package Lab_09;

public class Line {
    private Point begin;
    private Point end;

    public Line(Point begin, Point end) {
        this.begin = begin;
        this.end = end;
    }

    public Line(int beginX, int beginY, int endX, int endY) {
        begin = new Point(beginX, beginY);
        end = new Point(endX, endY);
    }


    @Override
    public String toString() {
        return "Line [" + begin + ',' + end + ']';
    }

    public Point getBegin() {
        return begin;
    }

    public Point getEnd() {
        return end;
    }

    //setters
    public void setBegin(Point begin) {
        this.begin = begin;
    }

    public void setEnd(Point end) {
        this.end = end;
    }

    //getters
    public int getBeginX() {
        return this.begin.getX();
    }

    public int getBeginY() {
        return this.begin.getY();
    }

    public int getEndX() {
        return this.end.getX();
    }

    public int getEndY() {
        return this.end.getY();
    }

    //Math formulas
    public int getLength() {
        return (int) Math.sqrt(getBeginX() * getEndX() + getBeginY() * getEndY());
    }

    public double getGradient() {
        return Math.atan2((getEndY() - getBeginY()), (getEndX() - getEndX()));
    }


}
