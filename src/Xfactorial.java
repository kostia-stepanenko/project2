import java.util.Scanner;

public class Xfactorial {

    public static void main(String args[]) {
        System.out.print("Input x: ");

        Scanner reader = new Scanner(System.in);
        int result = 1;
        int x = Integer.parseInt(reader.nextLine());
        while (x > 0) {

            result = result * x;


            x--;
        }
        System.out.println(result);
    }

}

