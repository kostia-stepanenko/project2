package Lab_09;

public class Point {

    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    //getters
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    //setters
    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "point[" + x + ", " + y + "]";
    }

    public static class Testpoint {
        public static void main(String[] args) {
            Point p1 = new Point(10, 20);


            System.out.println(p1);
            p1.setXY(100, 10);

            System.out.println(p1);
        }
    }
}
