package hw7.shapes;

public class Cylinder extends Circle {

    private int height;

    public Cylinder(){}

    public Cylinder(int h , int r,int a, int b){
        super(r, a, b);
        height = h;
    }

    public void setHeight(int h){
        height = h;
    }

    // πr^2 * h
    @Override
    public double computeVolume() {
        return super.computeArea() * height;
    }

    // total surface area of cylinder = 2πr(r + h)
    @Override
    public double computeArea() {
        int radius = super.getRadius();
        return 2 * Math.PI * radius * (radius + height);
    }

    @Override
    public String toString() {
        return String.format("CYLINDER[height: %d, circle: %s]", height, super.toString());
    }


    public static void main(String[] args) {
        Cylinder c1 = new Cylinder(10, 5, 1, 0);
        System.out.println(c1);
        System.out.printf("cylinder area: %.2f\n", c1.computeArea());
        System.out.printf("cylinder volume: %.2f\n", c1.computeVolume());
    }
}
