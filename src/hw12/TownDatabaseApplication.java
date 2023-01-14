package hw12;

import java.io.File;
import java.io.FileNotFoundException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class TownDatabaseApplication {

    private static final String FILE_NAME = "zip.txt";
    private static final String TOKEN_DELIMITER = ",";

    public static void main(String[] args) throws FileNotFoundException {

        String filePath = TownDatabaseApplication.class.getResource(FILE_NAME).getFile();

        List<String> allData = parseAllTokens(filePath);

        //System.out.printf("tokens count: %d\n", allData.size());


        // 01985 west newbury MA 508 essex eastern 649400 ==> Town
        // 01985 west newbury MA 508 essex eastern 649400 ==> Town

        List<Town> towns = convertToTowns(allData);

        Scanner inputScanner = new Scanner(System.in);

        while( true ){
            System.out.println("Input search query:");

            String queryStr = inputScanner.nextLine().toLowerCase();

            if( queryStr.equals("exit") ){
                break;
            }

            try {
                Query query = parseQuery(queryStr);

                Town foundTown = findTown(query, towns);

                if (foundTown == null) {
                    System.out.println("Not found");
                } else {
                    System.out.println("Found...");
                    System.out.println("Town: " + foundTown.getName());
                    System.out.println("County: " + foundTown.getCountry());
                }
                System.out.println();
            }
            catch(IllegalArgumentException ex){
                System.err.println(ex.getMessage());
            }
        }


    }

    private static Town findTown(Query query, List<Town> towns) {
        for(int i = 0; i < towns.size(); i++){

            Town singleTown = towns.get(i);

            if (query.getState().equals(singleTown.getState().toLowerCase()) &&
                    query.getTownName().equals(singleTown.getName().toLowerCase())){
                return singleTown;
            }
        }

        return null;
    }

    private static List<Town> convertToTowns(List<String> allData) {

        List<Town> towns = new ArrayList<>();

        for(int i = 0; i < allData.size(); i += 7){

            String zipCode = allData.get(i);
            String townName = allData.get(i+1);
            String state = allData.get(i+2);
            String phoneAreaCode = allData.get(i+3);
            String country = allData.get(i+4);
            String timeZone = allData.get(i+5);
            String population = allData.get(i+6);
            towns.add(new Town(zipCode, townName,state,phoneAreaCode,country,timeZone,population));
        }

        return towns;
    }

    private static List<String> parseAllTokens(String filePath) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File(filePath));

        List<String> allData = new ArrayList<>();

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();

            StringTokenizer st = new StringTokenizer(line, TOKEN_DELIMITER);

            for (int i = 0; st.hasMoreTokens(); ++i) {
                String word = st.nextToken().trim();
                if (i == 4 || i == 7 || i == 8) {
                    continue;
                }
                allData.add(word);
            }
        }

        return allData;
    }

    private static Query parseQuery(String singleQuery) {

            StringTokenizer queryTokenizer = new StringTokenizer((singleQuery), TOKEN_DELIMITER);

            if (queryTokenizer.countTokens() != 2) {
                throw new IllegalArgumentException("Incorrect query format: '" + singleQuery + "'");
            }

            String townName = queryTokenizer.nextToken().trim();
            String state = queryTokenizer.nextToken().trim();

            return new Query(townName, state);


    }

}
