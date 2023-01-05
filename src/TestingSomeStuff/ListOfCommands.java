package TestingSomeStuff;

import java.lang.*;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListOfCommands
{


       public static void main (String[] args) {
           /**messing with values and to_string**/
           int x = 42;
           String fromX = Integer.toString(x);
           boolean b1 = false;
           String fromBoolean = Boolean.toString(b1);
           long l1 = 100_000_000;
           NumberFormat formatter = NumberFormat.getNumberInstance();
           String fromLong = formatter.format(l1);
           //System.out.println(fromLong);


/**String builder fun**/

           // StringBuilder sb1 = new StringBuilder("Hello there");
           // sb1.append(",");
           // sb1.append("why are you here");
           //sb1.append("?");
           //  System.out.println(sb1);
           //sb1.delete(0,sb1.length());


           /**Scanner use**/

           //Scanner sc1 = new Scanner(System.in);
           // System.out.println("Input value");
           // String input = sc1.nextLine();
           //System.out.println(input);


           /**Iteration loop**/
           // for (int i = 0; i < 0/* array sie, string length,*/ ; i ++){}


           /** Reversed number**/


//           public int getReverse() {
//        int temp = (int) x;
//        List<Integer> digitsList = new ArrayList<>();
//
//        int reverseDigit = 0;
//
//        while (temp != 0) {
//            reverseDigit = temp % 10;
//            temp = temp / 10;
//            digitsList.add(reverseDigit);
//        }
//
//
//        int res = 0;
//        for(int val : digitsList ){
//           res = res * 10 + val;
//        }
//
//        return res;
//    }




           /** Sum of digits of number**/
//           public int sumDigits() {
//               int sum = 0;
//               int temp = (int) x;
//
//               while (temp != 0) {
//                   int digit = temp % 10;
//                   temp = temp / 10;
//                   sum = sum + digit;
//               }
//
//               return sum;
//           }
//       }



           /**List of factors of number**/

//           public List<Integer> listFactor(){
//
//               int val = (int)x;
//
//               List<Integer> factorList = new ArrayList<>();
//
//                val = 120, factorList = []
//
//               while(val != 1) {
//
//                   for(int i = 2; i <= val; ++i){
//                       int rem = val % i;
//                       if (rem == 0){
//                           factorList.add(i);
//                           val = val /i;
//                           break;
//                       }
//                   }
//               }
//
//               return factorList;
//           }
      }
}