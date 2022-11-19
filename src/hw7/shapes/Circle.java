package hw7.shapes;

public class Circle extends Point {
    private int radius;

    public Circle(){
    }

    public Circle(int r, int a, int b) {
        super(a, b);
        radius = r;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int r) {
        radius = r;
    }

    @Override
    public double computeArea() {
        return Math.PI * Math.pow(radius, 2.0);
    }

    @Override
    public String toString() {
        return String.format("CIRCLE[radius: %d, center: %s]", radius, super.toString());
    }

    public static void main(String[] args) {

        Circle c1 = new Circle(10, 1, 2);

        System.out.println(c1);
        System.out.printf("circle area: %.2f\n", c1.computeArea());
        System.out.printf("circle volume: %.2f\n", c1.computeVolume());
    }

}
