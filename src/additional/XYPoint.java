package additional;

public class XYPoint {

    private int x;
    private int y;

    public XYPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public static double getDistance(XYPoint p1, XYPoint p2){

        double dx = Math.pow(p1.x - p2.x, 2);
        double dy = Math.pow(p1.y - p2.y, 2);

        return Math.sqrt( dx + dy);
    }

    public static void main(String[] args) {
        XYPoint  p1 = new XYPoint(0, 0);
        XYPoint  p2 = new XYPoint(3, 3);
        System.out.println(XYPoint.getDistance(p1, p2));
    }
}
