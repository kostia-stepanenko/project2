package square;

import Lab_09.Point;

public class CompositeSquare {

    private Square topLeft;
    private Square topRight;

    private Square bottomLeft;
    private Square bottomRight;

    public CompositeSquare(Square smaller){

        int x = smaller.getTopLeft().getX();
        int y = smaller.getTopLeft().getY();
        int length = smaller.getLength();

        topLeft = new Square(new Point(x, y), length);
        topRight = new Square(new Point(x+length, y), length);
        bottomLeft = new Square(new Point(x, y+length), length);
        bottomRight = new Square(new Point(x+length, y+length), length);
    }

    public void scale(int factor) {
        topLeft.scale(factor);
        topRight.scale(factor);
        bottomLeft.scale(factor);
        bottomRight.scale(factor);
    }

    @Override
    public String toString() {
        return "topLeft: " + topLeft +
                ", topRight: " + topRight +
                ", bottomLeft: " + bottomLeft +
                ", bottomRight: " + bottomRight;
    }

    public static void main(String[] args) {
        Square small = new Square(new Point(0,0), 4);
        System.out.println(small);

        CompositeSquare big = new CompositeSquare(small);

        small.scale(10);

        System.out.println(small);
        System.out.println(big);
    }


}
