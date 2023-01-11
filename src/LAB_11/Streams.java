package LAB_11;

import java.io.File;
import java.io.FileNotFoundException;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Streams {

    // will try to use scanner to read files
    public static void main(String[] args)
    throws FileNotFoundException {
        File f1= new File("C:\\Users\\Shade\\Desktop\\workspace\\project2\\src\\numbers.txt");
        File f2= new File("C:\\Users\\Shade\\Desktop\\workspace\\project2\\src\\test.txt");
        Scanner sc = new Scanner(f1);

        while(sc.hasNextLine()){
            System.out.println(sc.nextLine());
        }
    }
}
