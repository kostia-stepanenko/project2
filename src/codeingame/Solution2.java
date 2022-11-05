package codeingame;

import java.util.*;

/*
Output value based on n.

INPUT: 3

OUTPUT:
if n == 1:
    print("n is 1")
elif n == 2:
    print("n is 2")
elif n == 3:
    print("n is 3")
else:
    print("number not found :(")
 */

public class Solution2 {


    public static void main(String args[]) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        for (int i = 0; i < n; i++) {

            // Write an answer using System.out.println()
            // To debug: System.err.println("Debug messages...");
            if (i == 0) {
                System.out.printf("if n == 1:\n");
                System.out.printf("\tprint(\"n is 1\")\n");
            } else {
                System.out.printf("elif n == %d:\n", (i+1));
                System.out.printf("\tprint(\"n is %d\")\n", (i + 1));
            }

        }

        System.out.printf("else:%n");
        System.out.printf("\tprint(\"number not found :(\")");
    }

}
