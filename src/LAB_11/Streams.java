package LAB_11;

import java.io.File;
import java.io.FileNotFoundException;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Streams {




    // will try to use scanner to read files
    public static void main(String[] args)
            throws FileNotFoundException {
        File f2 = new File("C:\\Users\\Shade\\Desktop\\workspace\\project2\\src\\LAB_11\\test.txt");
        Scanner sc2 = new Scanner(f2);





        String str;
        ArrayList<String> listOfStrings = new ArrayList<String>();
        while(sc2.hasNext()) {
            str = sc2.next();
            listOfStrings.add(str);
        }

        ArrayList<String> revArrayList = new ArrayList<String>();
        for (int i =listOfStrings.size()-1; i >=0; i--){
            revArrayList.add(listOfStrings.get(i));
        }
String[]array = listOfStrings.toArray(new String[0]);
        System.out.println(revArrayList);
}

}












