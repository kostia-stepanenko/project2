package Lab_09;

public class LineSub extends Point {

    private Point end;


    public LineSub(int beginX, int beginY, int endX, int endY) {
        super(beginX, beginY);
        this.end = new Point(endX, endY);
    }


    public LineSub(Point begin1, Point end) {
        super(begin1.getX(), begin1.getY());
        this.end = end;
    }
    //public methods
    // getX and getY are inherited from Point

    public String toString() {
        return "SubLine :(" + super.toString() + end + ')';
    }

    //getters
    public Point getEnd() {
        return end;
    }

    public Point getBegin() {
        return new Point(super.getX(), super.getY());
    }

    public int getBeginX() {
        return super.getX();
    }

    public int getBeginY() {
        return super.getY();
    }

    public int getEndY() {
        return end.getY();
    }

    public int getEndX() {
        return end.getX();
    }

    //setters
    public void setBeginX(int x) {
        super.setX(x);
    }

    public void setBeginY(int y) {
        super.setY(y);
    }

    public int getLengthSub() {

        int XDiff = end.getX() - super.getX();
        int YDiff = end.getY() - super.getY();
        return (int) Math.sqrt((XDiff * XDiff + YDiff * YDiff));
    }

    public double getGradientSub() {
        return Math.atan2((end.getY() - super.getY()), (end.getX() - super.getX()));
    }
}
