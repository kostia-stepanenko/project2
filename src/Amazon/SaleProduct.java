package Amazon;

import java.time.LocalDate;

public class SaleProduct {
    private int id;
    private String name;
    private int quantity;
    private double price;
    private LocalDate date;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }

    public LocalDate getDate() {
        return date;
    }

    public double getTotalPrice(){
        return price * quantity;
    }

    @Override
    public String toString() {
        return "SaleProduct{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", quantity=" + quantity +
                ", price=" + price +
                ", date=" + date +
                '}';
    }

    public SaleProduct(int id, String name, int quantity, double price, LocalDate date){
        this.id=id;
        this.name=name;
        this.quantity=quantity;
        this.price=price;
        this.date=date;
    }
}
