package square;

import Lab_09.Point;

public class Square {

    Point topLeft;

    private int length;


    public Square(Point topLeft, int length) {
        this.topLeft = topLeft;
        this.length = length;
    }

    public Point getTopLeft() {
        return topLeft;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void scale(int factor){
        length *= factor;
    }

    @Override
    public String toString() {
        return "["+topLeft+", length:" + length+ "]";
    }
}
