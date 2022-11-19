package LAB_06;

public class Fleet {
    private Car town;
    private Car suv;

    public Fleet() {
        this.town = new Car(0, 400, 5);
        this.suv = new Car(0, 500, 20);
    }

    public double averageConsumption() {
        double average = (town.getLiters() + suv.getLiters()) / 2;
        return average;
    }
//liters = liters per 100 km


    public static void main(String[] args) {
        Fleet testFleet = new Fleet();
        System.out.println("Average consumption of the fleet");
        System.out.println(testFleet.averageConsumption());
    }
}

