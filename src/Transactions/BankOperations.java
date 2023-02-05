package Transactions;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class BankOperations {

    public static void main(String[] args) throws FileNotFoundException {

        String filePath1 = BankOperations.class.getResource("transactions.txt").getFile();

        parseAndApplyTransactions(filePath1);

        System.out.println(allCards);
    }

    private static TreeMap<String, Card> allCards = new TreeMap<>();

    private static void parseAndApplyTransactions(String filePath1) throws FileNotFoundException {
        try(Scanner scanner = new Scanner(new File(filePath1))){

            Map<Integer, Card> allCards = parseCards(scanner);

            List<Transaction>  allTransactions = parseTransactions(scanner);

            for(Transaction singleTr : allTransactions) {
                int sourceId = singleTr.getSource();
                int destinationId = singleTr.getDestination();


                Card srcCard = allCards.get(sourceId);
                Card destcard = allCards.get(destinationId);

                srcCard.subtractBalance(singleTr.getSum());
                destcard.addBalance(singleTr.getSum());
            }
            System.out.println(allCards);
            System.out.println(allTransactions);
saveToFile(allCards, Paths.get("C:\\Users\\Shade\\Desktop\\workspace\\project2\\" +
        "src\\Transactions\\balance.txt"));
        }

    }
    private static void saveToFile(Map<Integer, Card> allCards, Path filePath) {
        try {
            Files.deleteIfExists(filePath);
            Files.createFile(filePath);

            try(PrintWriter writer = new PrintWriter(filePath.toFile())){
                for(Map.Entry<Integer, Card>  entry : allCards.entrySet()){

                    Card card = entry.getValue();

                    writer.printf("%d,%s,%.2f\n", card.getCardId(),card.getUserName(),card.getBalance());
                }
            }
        }
        catch(IOException ioEx){
            ioEx.printStackTrace();
        }
    }

    private static Map<Integer, Card> parseCards(Scanner scanner){
        Map<Integer, Card> allCards = new HashMap<>();

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();

            if (line.trim().equals("")) {
                break;
            }

            StringTokenizer st = new StringTokenizer(line, ",");

            if (st.countTokens() != 3) {
                throw new IllegalArgumentException("not enough tokens");
            }

            Integer cardId = Integer.parseInt(st.nextToken().trim());
            String username = st.nextToken().trim();
            Double balance = Double.parseDouble(st.nextToken().trim());

            Card card = new Card(cardId, username, balance);

            allCards.put(card.getCardId(), card);

        }

        return allCards;
    }

    private static List<Transaction> parseTransactions(Scanner scanner) {
        List<Transaction> allTransactions = new ArrayList<>();

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            StringTokenizer st = new StringTokenizer(line, ",");

            if (st.countTokens() != 3) {
                throw new IllegalArgumentException("not enough tokens");
            }
            Integer source = Integer.parseInt(st.nextToken().trim());
            Integer destination = Integer.parseInt(st.nextToken().trim());
            Double sum = Double.parseDouble(st.nextToken().trim());

            allTransactions.add(new Transaction(source, destination, sum));
        }

        return allTransactions;
    }

}
