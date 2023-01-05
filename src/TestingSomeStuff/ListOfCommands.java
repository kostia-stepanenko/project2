package TestingSomeStuff;

import java.lang.*;
import java.text.NumberFormat;

public class ListOfCommands
{


       public static void main (String[] args) {
           //messing with values and to_string
           int x = 42;
           String fromX = Integer.toString(x);
           boolean b1 = false;
           String fromBoolean = Boolean.toString(b1);
           long l1 = 100_000_000;
           NumberFormat formatter = NumberFormat.getNumberInstance();
           String fromLong = formatter.format(l1);
           //System.out.println(fromLong);


//String builder fun

           // StringBuilder sb1 = new StringBuilder("Hello there");
           // sb1.append(",");
           // sb1.append("why are you here");
           //sb1.append("?");
           //  System.out.println(sb1);
           //sb1.delete(0,sb1.length());


           //Scanner use

           //Scanner sc1 = new Scanner(System.in);
           // System.out.println("Input value");
           // String input = sc1.nextLine();
           //System.out.println(input);


           //Itteration loop
           // for (int i = 0; i < 0/* array sie, string length,*/ ; i ++){}

       }
}