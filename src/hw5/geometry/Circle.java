package hw5.geometry;


public class Circle {

    private int centerX;
    private int centerY;
    private double radius;

    public Circle(int centerX, int centerY, double radius) {
        this.centerX = centerX;
        this.centerY = centerY;
        if( radius < 0.0 ){
            throw new IllegalArgumentException("Negative radius detected");
        }
        this.radius = radius;
    }

    public double getArea(){
        return Math.PI * radius * radius;
    }

    public double getCircumference(){
        return 2.0 * Math.PI * radius;
    }

    public static void main(String[] args) {

        Circle c1 = new Circle(0, 0, 12.33);
        System.out.printf("area: %.2f, circumference: %.2f\n", c1.getArea(), c1.getCircumference());

        Circle c2 = new Circle(2, 3, 9.87);
        System.out.printf("area: %.2f, circumference: %.2f\n", c2.getArea(), c2.getCircumference());
    }
}
