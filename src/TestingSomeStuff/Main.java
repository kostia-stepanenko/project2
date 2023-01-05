package TestingSomeStuff;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;

public class Main  {

    public static void main (String[] args)
    {
        int x = 42;
        String fromX=Integer.toString(x);
        boolean b1 = false;
        String fromBoolean=Boolean.toString(b1);
        long l1 = 100_000_000;
        NumberFormat formatter = NumberFormat.getNumberInstance();
        String fromLong= formatter.format(l1);
        //System.out.println(fromLong);


        SecondaryClass secondClassPoint =new SecondaryClass(11,20,5);
        //assigning an enumerator
        secondClassPoint.usedPlaneType = SecondaryClass.PlaneType.DIM_3D;
        System.out.println("old X");
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
        // printing enumerator
        System.out.println(secondClassPoint.getUsedPlaneType());

// trying custom class array list
        List<SecondaryClass> points = new ArrayList<SecondaryClass>();
        points.add(new SecondaryClass(10,10,10));


        SecondaryClass p1 = new SecondaryClass(20,20,20);
        points.add(p1);

        for (SecondaryClass c : points){
            System.out.println(c);
        }
    }
}
