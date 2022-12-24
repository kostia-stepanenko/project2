package TestingSomeStuff;

public class SecondaryClass {

    //fields
    private int x;
    private int y;
    private int z;

    //enumerator
    PlaneType usedPlaneType = PlaneType.DIM_3D;

     enum PlaneType {
        DIM_3D, DIM_2D, DIM_4D
    }
    //methods


    public PlaneType getUsedPlaneType() {
        return usedPlaneType;
    }

    public SecondaryClass(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
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

    public void setX(int x) {
        this.x = x;
    }

    //set to default(set) position
    public void setX() {
        defaultValue();
    }

    public void defaultValue() {
        this.x = 0;
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
