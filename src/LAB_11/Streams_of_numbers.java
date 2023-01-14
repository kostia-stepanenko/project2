package LAB_11;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.*;

public class Streams_of_numbers {
    public static void main(String[] args)
            throws FileNotFoundException {
        File f1 = new File("C:\\Users\\Shade\\Desktop\\workspace\\project2\\src\\LAB_11\\numbers.txt");
        Scanner sc1 = new Scanner(f1);

        List<Integer> listOfStrings = new ArrayList<Integer>();
        while(sc1.hasNext()){
           int str=Integer.parseInt(sc1.next());
            listOfStrings.add(str);
        }
        Integer[] array = listOfStrings.toArray(new Integer[0]);
        for (Integer eachNumber : array){
            System.out.println(eachNumber);
        }




    }

     }



