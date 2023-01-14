package PL_TestExercises;

public class Bottle{
    private double volume;
    private double price;

    private double quantityOfLiquid;

    public Bottle(double volume,double price,double quantityOfLiquid){
        this.volume=volume;
        this.price=price;
        this.quantityOfLiquid=quantityOfLiquid;
    }

    public static void main(String[] args){
        Bottle b1 = new Bottle(2.0,200,5);
    }
}
