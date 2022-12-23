package TestBeforeNewYear;

import java.util.Comparator;

public class ProductWarehouse {

    public static Comparator<ProductWarehouse> NAME_CODE_ASC = Comparator.comparing(ProductWarehouse::getName).
            thenComparing(ProductWarehouse::getCode);

    private int code;

    private String name;

    private double price;

   private String producer;

   private String country;

    /**
     * dd/mm/yyyy
     */
   private String expirationDate;

    public ProductWarehouse(int code, String name, double price, String producer, String country, String expirationDate) {
        this.code = code;
        this.name = name;
        this.price = price;
        this.producer = producer;
        this.country = country;
        this.expirationDate = expirationDate;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }

    @Override
    public String toString() {
        return "country: " + country + ", name: " + name + ", price: " + price;
    }
}
