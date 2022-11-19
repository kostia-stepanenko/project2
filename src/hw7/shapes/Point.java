package hw7.shapes;

public class Point extends Form {

    private int x;
    private int y;

    public Point(){
    }

    public Point(int a, int b) {
        x = a;
        y = b;
    }

    public void setPoint(int a, int b) {
        x = a;
        y = b;
    }

    @Override
    public String toString() {
        return String.format("POINT[(%d; %d)]", x, y);
    }

    public static void main(String[] args) {

        Point p1 = new Point(1, 2);

        System.out.println(p1);
        System.out.printf("point area: %.2f\n", p1.computeArea());
        System.out.printf("point volume: %.2f\n", p1.computeVolume());
    }
}
