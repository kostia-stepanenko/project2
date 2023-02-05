package Amazon;


import Transactions.Card;

import java.io.File;
import java.io.FileNotFoundException;
import java.sql.Date;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.*;

public class Amazon_sales {



    public static void main(String[] args) throws FileNotFoundException {
        String filePath1 = Amazon_sales.class.getResource("sales.txt").getFile();
        parseAndComputeSales(filePath1);
        System.out.println(allSales);
    }

    private static TreeMap<String, Card> allSales = new TreeMap<>();

    private static void parseAndComputeSales(String filePath1) throws FileNotFoundException {
        try (Scanner scanner = new Scanner(new File(filePath1))) {

            List<SaleProduct> allSales = parseSales(scanner);

            // 02.2023 => 13.0 + (singleSale.quantity * singleSale.price)
            // 01.2023 => 125.0
            // 03.203 => 177.0

            Map<String, Double> salesPerMonth = new HashMap<>();

            for(SaleProduct singleSale : allSales){
                String key = singleSale.getDate().getMonth().getValue() + "." +
                        singleSale.getDate().getYear();

                if(salesPerMonth.containsKey(key)){
                    Double prevVal = salesPerMonth.get(key);
                    prevVal += (singleSale.getTotalPrice());
                    salesPerMonth.put(key, prevVal);
                }
                else {
                    salesPerMonth.put(key,singleSale.getTotalPrice());
                }


            }

            List<MonthAndProfit> profits = new ArrayList<>();

            for(Map.Entry<String, Double>  entry : salesPerMonth.entrySet()){
                String month = entry.getKey();
               double totalProfit = entry.getValue();

                profits.add(new MonthAndProfit(month, totalProfit));

                //System.out.printf(" month:%s, totalProfit :%.2f \n ", month,totalProfit);
            }

            profits.sort(MonthAndProfit.PROFIT_DESC);


            System.out.println(profits.get(0));
            System.out.println(profits.get(1));


        }
    }


    private static List<SaleProduct> parseSales(Scanner scanner) {

        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        List<SaleProduct> allSales = new ArrayList<>();

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            StringTokenizer st = new StringTokenizer(line, ",");


            Integer id = Integer.parseInt(st.nextToken().trim());
            String name = st.nextToken().trim();
            Integer quantity = Integer.parseInt(st.nextToken().trim());
            Double price = Double.parseDouble(st.nextToken().trim());
            LocalDate date = LocalDate.parse(st.nextToken().trim(), dateFormatter);


            SaleProduct s1 = new SaleProduct(id, name, quantity, price, date);

            allSales.add(s1);

        }
        return allSales;
    }
}
