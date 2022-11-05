package codeingame;

import java.util.*;

/**
 * Given a String that contains only characters: A, T, G, C
 *
 * Change this string in the following way:
 * A-> double A
 * T-> triple T
 * G -> remove
 * C-> left as is
 *
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solution1 {

    /**
     * Example:
     *
     * INPUT: ATGGCAT
     * OUTPUT: AATTTCAATTT
     */
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String DNA = in.nextLine();

        StringBuilder res = new StringBuilder();

        for(char ch : DNA.toCharArray()){
            if(ch == 'A'){
                res.append(ch).append(ch);
            }
            else if(ch == 'T'){
                res.append(ch).append(ch).append(ch);
            }
            else if(ch == 'C'){
                res.append(ch);
            }
        }

        // Write an answer using System.out.println()
        // To debug: System.err.println("Debug messages...");

        System.out.println(res.toString());
    }
}
