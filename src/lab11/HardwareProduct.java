package lab11;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public  abstract class HardwareProduct {
    protected static final double DOLLARS_TO_RONS = 4.53;
    protected static final double EUROS_TO_RONS = 4.76;

    private static final Path MONITORS_PATH =
            Paths.get("C:\\Users\\Shade\\Desktop\\workspace\\project2\\src\\lab11\\monitors.txt");
    public static void main(String[] args) throws FileNotFoundException {

        String filePath1 = HardwareProduct.class.getResource("PlaciVideo.txt").getFile();
        String filePath2 = HardwareProduct.class.getResource("Monitoare.txt").getFile();

        List<String> allVideoCards = parseAllTokens(filePath1);
        List<String> allMonitors = parseAllTokens(filePath2);


        List<Monitor> doneMonitors = convertToMonitor(allMonitors);
        List<VideoCard> doneVideoCard = convertToVideoCard(allVideoCards);

        saveToFile(doneMonitors, MONITORS_PATH);

        System.out.println(doneMonitors);
        System.out.println(doneVideoCard);
    }

    private static void saveToFile(List<Monitor> doneMonitors, Path filePath) {
        try {
            Files.deleteIfExists(filePath);
            Files.createFile(filePath);

            try(PrintWriter writer = new PrintWriter(filePath.toFile())){
                for(Monitor singleMonitor : doneMonitors){
                    writer.printf("currency: %d, performance: %.2f\n",
                            singleMonitor.currency, singleMonitor.calculatePerformance());
                }
            }
        }
        catch(IOException ioEx){
            ioEx.printStackTrace();
        }
    }

    private static List<Monitor> convertToMonitor(List<String> allDevices) {

        List<Monitor> allMonitors = new ArrayList<>();

        for (int i = 0; i < allDevices.size(); i += 2) {

            String currency = allDevices.get(i);
            String currentScore = allDevices.get(i + 1);

            long priceInRons = Math.round(Long.valueOf(currency) * DOLLARS_TO_RONS);

            allMonitors.add(new Monitor(priceInRons, Integer.parseInt(currentScore)));
        }

        return allMonitors;
    }

    private static List<VideoCard> convertToVideoCard(List<String> allDevices) {

        List<VideoCard> allVideoCards = new ArrayList<>();

        for (int i = 0; i < allDevices.size(); i += 2) {

            String currency = allDevices.get(i);
            String currentScore = allDevices.get(i + 1);

            long priceInRons = Math.round(Long.valueOf(currency) * EUROS_TO_RONS);

            allVideoCards.add(new VideoCard(priceInRons, Integer.parseInt(currentScore)));
        }

        return allVideoCards;
    }

    private static List<String> parseAllTokens(String filePath2) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File(filePath2));

        List<String> allDevices = new ArrayList<>();

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();

            StringTokenizer st = new StringTokenizer(line, " ");

            for (int i = 0; st.hasMoreTokens(); ++i) {
                String word = st.nextToken().trim();

                allDevices.add(word);
            }
        }

        return allDevices;
    }

   }
