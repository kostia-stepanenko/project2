

public class arrayOfPrimes {


    public static boolean isPrime(int val) {
        if (val <= 1) {
            return false;
        }

        for (int i = 2; i < val; i++) {
            if (val % i == 0) {
                return false;
            }
        }
        return true;

    }

    public static void main(String[] args) {

        System.out.println("Value  is Prime or Not ");
        System.out.println(isPrime(5));
        System.out.println("It equals ");
        System.out.println(4);

    }
}