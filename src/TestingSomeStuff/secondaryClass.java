package TestingSomeStuff;

public class secondaryClass {
    private int x;
    private int y;
    private int z;

    public secondaryClass(int x,int  y ,int z){
        this.x=x;
        this.y=y;
        this.z=z;
    }
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getZ() {
        return z;
    }

    @Override
    public String toString() {
        return "secondaryClass{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }
}
