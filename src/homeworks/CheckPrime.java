package homeworks;

public class CheckPrime {

    public static boolean isPrime(int val) {
        if (val <= 1) {
            return false;
        }

        for (int div = 2; div < val; div++) {
            if (val % div == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        System.out.println("Positive cases:");
        System.out.println(isPrime(2));
        System.out.println(isPrime(7));
        System.out.println(isPrime(97));
        System.out.println(isPrime(1217));

        System.out.println("Negative cases:");
        System.out.println(isPrime(10));
        System.out.println(isPrime(24));
        System.out.println(isPrime(9));
        System.out.println(isPrime(256));

        System.out.println(isPrime(0));
        System.out.println(isPrime(1));

        System.out.println(isPrime(-10));
        System.out.println(isPrime(-7));
        System.out.println(isPrime(-1217));
    }
}
