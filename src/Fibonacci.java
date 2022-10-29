import java.io.IOException;
import java.util.Scanner;

public class Fibonacci {
    public static void main(String args[]) throws IOException {

        System.out.println("Input n: ");

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.next());

        int n1=0, n2=1;
        int count = 0;

        while(count<n){
            System.out.println(n1);
            int temp=n1;
            n1=n2;
            n2=temp +n2;

            count+=1;
        }

    }
}
