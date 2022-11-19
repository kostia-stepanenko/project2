package LAB_06;

public class Car {
    private double startKm;
    private double endKm;
    private double liters;

    public Car(double startKm ,double endKm, double liters) {
        this.startKm = startKm;
        this.endKm = endKm;
        this.liters = liters;




    }
    public double getLiters(){
        this.liters = (endKm - startKm) / 100 * liters;

        return liters;
    }


    public static void main(String[] args) {
        Car test1 = new Car(0.0, 100.0, 5);
        Car test2 = new Car(0.0, 500.0, 20);
//liters = liters per 100 km
        System.out.println( "Used liters");
        System.out.println( "Test1");
        System.out.println( test1.getLiters());
        System.out.println( "Test2");
        System.out.println( test2.getLiters());

    }
}
