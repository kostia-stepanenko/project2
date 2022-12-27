
import java.util.ArrayList;
import java.util.List;

public class Number {
    private double x;

    public Number(double x) {
        this.x = x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public boolean isZero() {
        if (x == 0) {
            return true;
        }
        return false;

    }

    public boolean isPositive() {
        if (x > 0) {
            return true;
        }
        return false;
    }

    public boolean isNegative() {
        if (x < 0) {
            return true;
        }
        return false;
    }

    public boolean isOdd() {
        if (x % 2 == 0) {
            return false;
        }
        return true;
    }

    public boolean isEven() {
        if (x % 2 == 0) {
            return true;
        }
        return false;
    }


    public boolean isPrime() {
        if (x <= 1) {
            return false;
        }

        for (int div = 2; div < x; div++) {
            if (x % div == 0) {
                return false;
            }
        }
        return true;
    }

    public double getFactorial() {
        if (x == 0) {
            return 1;
        }
        double result = 1;
        while (x > 0) {
            result = result * x;
            x--;
        }
        return result;
    }

    public double getSqrt() {
        double result = Math.sqrt(x);
        return result;
    }

    public int sumDigits() {
        int sum = 0;
        int temp = (int) x;

        while (temp != 0) {
            int digit = temp % 10;
            temp = temp / 10;
            sum = sum + digit;
        }

        return sum;
    }

    public int getReverse() {
        int temp = (int) x;
        List<Integer> digitsList = new ArrayList<>();

        int reverseDigit = 0;

        while (temp != 0) {
            reverseDigit = temp % 10;
            temp = temp / 10;
            digitsList.add(reverseDigit);
        }


        int res = 0;
        for(int val : digitsList ){
           res = res * 10 + val;
        }

        return res;
    }

    public List<Integer> listFactor(){

        int val = (int)x;

        List<Integer> factorList = new ArrayList<>();

        // val = 120, factorList = []

        while(val != 1) {

            for(int i = 2; i <= val; ++i){
                int rem = val % i;
                if (rem == 0){
                    factorList.add(i);
                    val = val /i;
                    break;
                }
            }
        }

        return factorList;
    }

    public static void main(String[] args) {
        Number test1 = new Number(120);
//        System.out.println(test1.getReverse());
        System.out.println(test1.listFactor());
//        System.out.println("test1 is zero?");
//        System.out.println(test1.isZero());
//        System.out.println("test1 is positive?");
//        System.out.println(test1.isPositive());
//        System.out.println("test1 is negative?");
//        System.out.println(test1.isNegative());
//        System.out.println("test1 is prime number?");
//        System.out.println(test1.isPrime());
//        System.out.println("test1 is odd ?");
//        System.out.println(test1.isOdd());
//        System.out.println("test1 is even ?");
//        System.out.println(test1.isEven());
//        System.out.println("Factorial of test1");
//        System.out.println(test1.getFactorial());
//        System.out.println("sum of digits of test1");
//        System.out.println(test1.sumDigits());
//        System.out.println("square root  of test1");
//        System.out.println(test1.getSqrt());
//        System.out.println(test1.sumDigits());
    }
}
