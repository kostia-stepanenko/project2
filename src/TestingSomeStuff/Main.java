package TestingSomeStuff;

public class Main {

    public static void main (String[] args)
    {

        SecondaryClass secondClassPoint =new SecondaryClass(11,20,5);
        secondClassPoint.usedPlaneType = SecondaryClass.PlaneType.DIM_3D;
        System.out.println("old x");
        System.out.println(secondClassPoint.getX());
        System.out.println("X set as default(0)");
        secondClassPoint.setX();
        System.out.println(secondClassPoint.getX());
        System.out.println("new x and rest");
        secondClassPoint.setX(100);
        System.out.println(secondClassPoint.getX());
        System.out.println(secondClassPoint.getY());
        System.out.println(secondClassPoint.getZ());
        System.out.println(secondClassPoint);
        System.out.println("Used plane type is ");
        System.out.println(secondClassPoint.getUsedPlaneType());

    }

}
