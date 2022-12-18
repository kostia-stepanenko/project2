package Lab_09;

public class TestLineSub {


    public static void main(String[] args) {

        LineSub l2 = new LineSub(0, 0, 3, 4);

        System.out.println(l2);
        System.out.println("Length of line: " + l2.getLengthSub());
        System.out.printf("Gradient of line: %.2f\n", l2.getGradientSub());


        Point p3 = new Point(5, 6);
        Point p4 = new Point(7, 8);
        LineSub l3 = new LineSub(p3, p4);
        System.out.println(l3);
        System.out.println("Length of line: " + l3.getLengthSub());
        System.out.printf("Gradient of line: %.2f\n", l3.getGradientSub());
        Point p5 = new Point(1, 2);
        Point p6 = new Point(14, 15);
        LineSub l4 = new LineSub(p5, p6);
        System.out.println(l4);
        System.out.println("Length of line: " + l4.getLengthSub());
        System.out.printf("Gradient of line: %.2f\n",  l4.getGradientSub());
    }
}
