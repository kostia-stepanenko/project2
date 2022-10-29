import java.util.Scanner;

public class XandY {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Input x: ");
        int x = Integer.parseInt(reader.nextLine());

        System.out.print("Input y: ");
        int y = Integer.parseInt(reader.nextLine());

        if (x>y){
            System.out.println("X is greater than Y");
        }
        else if (x<y) {
            System.out.println("X is lesser than Y");
        }
        else {
            System.out.println("X is equal to Y");
        }
    }
}
