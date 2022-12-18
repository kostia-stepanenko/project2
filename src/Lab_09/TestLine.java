package Lab_09;

public class TestLine {


    public static void main(String[] args) {
        Point p2 = new Point(88, 99);
        Line l1 = new Line(10, 10, 30, 30);
        System.out.println(p2);
        System.out.println(l1);
        System.out.println("Length of line: " + l1.getLength());
        System.out.printf("Gradient of line: %.2f\n", l1.getGradient());
    }
}
