import java.io.IOException;
import java.util.Scanner;

public class Fibonacci2 {
    public static void main(String args[]) {

        System.out.print("Input n: ");

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int n1=0, n2=1;

        for(int i = 0; i < n; ++i){
            System.out.println(n1);
            int temp=n1;
            n1=n2;
            n2=temp +n2;
        }


    }
}
