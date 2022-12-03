package Lab_07;

public class Complex {
    private int re;
    private int im;

    public Complex() {
        re = 0;
        im = 0;
    }
    public Complex(int re, int im) {
        this.re=re;
        this.im = im;
    }

    public static Complex add(Complex c1, Complex c2) {
int addRe = c1.re +c2.re;
int addIm = c1.im + c2.im;

        return new Complex(addRe,addIm);
    }


    @Override
    public String toString() {
        return re + " + " + im + "*i";
    }

    public static void main(String[] args) {
        Complex c1 = new Complex(2,2);
        Complex c2 = new Complex(3,4);

        System.out.println(add(c1,c2));
    }
}
