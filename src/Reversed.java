import java.util.Scanner;
public class Reversed {





        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a number to reverse: ");
            int number = scanner.nextInt();

            int reversedNumber = 0;
            while (number != 0) {
                reversedNumber = reversedNumber * 10 + number % 10;
                number /= 10;
            }

            System.out.println("Reversed number: " + reversedNumber);
        }
    }


