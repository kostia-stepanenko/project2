package Lab_07;

public class Rational {
    private int num;
    private int den;

    public Rational() {
        num = 0;
        den = 1;
    }

    public Rational(int num, int den) {
        if(num ==0 || den == 0){
            throw new IllegalArgumentException("0 num or den");
        }
        if( num < 0 && den < 0){
            this.num = -num;
            this.den = -den;
        }
        else if( num > 0 && den < 0){
            this.num = -num;
            this.den = -den;
        }
        else {
            this.num = num;
            this.den = den;
        }
    }

    public static Rational add(Rational r1, Rational r2) {

        int sumNum = (r1.num * r2.den) + (r2.num * r1.den);
        int sumDen = r1.den * r2.den;

        int gcdVal = gcd(sumNum, sumDen);

        return new Rational(sumNum / gcdVal, sumDen / gcdVal);
    }

     private static int gcd(int a, int b) {

        if(a == 0 || b == 0 ){
            return 0;
        }

        int v1 = Math.abs(a);
        int v2 = Math.abs(b);

        while( v2 != 0 ){
           int temp = v2;
           v2 = v1 % v2;
           v1 = temp;
        }


        return v1;
    }


    public static Rational sub(Rational r1, Rational r2) {

        int dubNum = (r1.num * r2.den) - (r2.num * r1.den);
        int subDen = r1.den * r2.den;

        int gcdVal = gcd(dubNum, subDen);

        return new Rational(dubNum / gcdVal, subDen / gcdVal);
    }

    public static Rational mul(Rational r1, Rational r2) {

        int mulNum = r1.num * r2.num;
        int mulDen = r1.den * r2.den;

        int gcdVal = gcd(mulNum, mulDen);

        return new Rational(mulNum / gcdVal, mulDen / gcdVal);

    }

    public static Rational div(Rational r1, Rational r2) {
        return mul(r1, new Rational(r2.den, r2.num));
    }


    public void intFormat(){
        String res = num + "/" + den;
        System.out.println(res);
    }

    public void realFormat(){
        double res = ((double)num) / den;
        System.out.printf("%.2f\n", res);
    }


    public static void main(String[] args) {
        Rational r1 = new Rational(4, 5);
        Rational r2 = new Rational(7, 10);

//        r1.intFormat();
//        r2.intFormat();

//        r1.realFormat();
//        r2.realFormat();

        Rational sum = Rational.div(r1, r2);
        sum.intFormat();



    }

}


