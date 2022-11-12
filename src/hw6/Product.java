package hw6;

public class Product {

    private static double RON_TO_ROL = 9896.13;

    private String name;
    private double priceInRols;

    public Product(String name, double priceInRols) {
        this.name = name;
        this.priceInRols = priceInRols;
    }

    public String displayProduct() {
        return name;
    }

    public double getPrice() {
        return priceInRols;
    }

    public void setPrice(double priceInRols) {
        this.priceInRols = priceInRols;
    }

    public double getPriceInRON() {
        return priceInRols / RON_TO_ROL;
    }

    public void setPriceInRON(double priceInRons) {
        this.priceInRols = priceInRons * RON_TO_ROL;
    }


    public static void main(String[] args) {
        Product p1 = new Product("Coca-Cola", 98960.13);
        Product p2 = new Product("Croissant", 9896.13 * 5);

        System.out.printf("product: %s, price(ROL): %.3f\n", p1.displayProduct(), p1.getPrice());
        System.out.printf("product: %s, price(ROL): %.3f\n", p2.displayProduct(), p2.getPrice());

        double p1RaisedInRons = p1.getPriceInRON() + 10.25;
        System.out.printf("product: %s, raised price(RON): %.3f\n", p1.displayProduct(), p1RaisedInRons);

        double p2RaisedInRons = p2.getPriceInRON() + 10.25;
        System.out.printf("product: %s, raised price(RON): %.3f\n", p2.displayProduct(), p2RaisedInRons);

        System.out.printf("product: %s, initial price(RON): %.3f\n", p1.displayProduct(), p1.getPriceInRON());
        System.out.printf("product: %s, initial price(RON): %.3f\n", p2.displayProduct(), p2.getPriceInRON());
    }

}
