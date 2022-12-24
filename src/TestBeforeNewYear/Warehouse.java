package TestBeforeNewYear;

import java.sql.SQLOutput;
import java.util.*;
/*
Write the Warehouse class definition for warehouse dispatcher instances.
In the warehouse, a product is characterized by:

        - a unique code (an integer)

        - a name (a string)

        - a price (a double)

        - a producer (a string)

        - a production country (a string)

        - an expiration date (a string with a “dd/mm/yyyy” format)

        The warehouse dispatcher knows all the products in the warehouse (the number of products is limited to 1000).
        The methods of the Warehouse class are used to:

        a) add a new product in the warehouse <-- done

        b) cancel a product, given its code <-- done

        c) display all the products, with their information in alphabetical order <-- done

        d) find all the products manufactured in a specified country and having the price between two limits:
        minPrice and maxPrice <-- done

        e) display all the expired products in a given date, sorted by expiration date

        f) display the cheapest manufacturer for a given product, given its name <-- done


        Organize the class of products, called ProductWarehouse, in the most useful way you consider.

        Test all the defined methods, by calling them from the main method.
*/

public class Warehouse {

    private Set<ProductWarehouse> allProducts = new TreeSet<>(ProductWarehouse.NAME_CODE_ASC);

//add product to list
    public void addProduct(ProductWarehouse newProduct){
        allProducts.add(newProduct);
    }
//delete added product from list by given id
    public void cancelProductByCode(int code) {

        ProductWarehouse foundProduct = null;

        for(ProductWarehouse p : allProducts ){
            if( p.getCode() == code){
                foundProduct = p;
                break;
            }
        }

        if(foundProduct == null ){
            throw new IllegalArgumentException("Can't find product with code: " + code);
        }

        allProducts.remove(foundProduct);
    }
//display info about all products in the list
    public void displayAll() {

        for (ProductWarehouse p : allProducts) {
                System.out.printf("name: %s, price: %.2f,code %s, producer %s,production country %s, expiration date %s \n", p.getName(), p.getPrice(),p.getCode(), p.getProducer(),p.getCountry(),p.getExpirationDate());
            }
        }
//need new list for methods


    //find all products made by one country in range of min - max price
    public List<ProductWarehouse> findByCountry(String country, double minPrice, double maxPrice) {

        List<ProductWarehouse> matched = new ArrayList<>();

        for (ProductWarehouse p : allProducts) {
        /* use .equals to compare the objects and Strings */    if (p.getCountry().equals(country) && p.getPrice() >= minPrice && p.getPrice() <= maxPrice) {
                matched.add(p);
            }
        }

        return matched;
    }


    // find  the cheapest producer for product by name of product

    public String findCheapest(String productName){
        String producer = null;
        double cheapest = Double.MAX_VALUE;

        for (ProductWarehouse p : allProducts){

            int x = 133;

            if (p.getName().equals(productName) && p.getPrice() < cheapest ){
                producer = p.getProducer();
                cheapest = p.getPrice();
            }
        }
        return producer;
    }
    public static void main (String[]args){
        Warehouse warehouse = new Warehouse();

        ProductWarehouse p1 = new ProductWarehouse(133, "ro-name-1", 20.00, "producer-1",
                "RO", "10/10/2022");

        ProductWarehouse p2 = new ProductWarehouse(177, "usa-name-2", 15.00, "producer-2",
                "USA", "01/01/2022");

        // f) display the cheapest manufacturer for a given product, given its name
        ProductWarehouse p3 = new ProductWarehouse(135, "coca-cola", 30.00, "great-britain-producer",
                "UK", "20/10/2022");

        ProductWarehouse p4 = new ProductWarehouse(137, "coca-cola", 10.00, "ukraine-producer",
                "UA", "23/10/2022");

        warehouse.addProduct(p1);
        warehouse.addProduct(p2);
        warehouse.addProduct(p3);
        warehouse.addProduct(p4);



       // warehouse.cancelProductByCode(133);

//      warehouse.displayAll();


        System.out.println("Cheapest producer "+warehouse.findCheapest("coca-cola"));
//        List<ProductWarehouse> found =
//                warehouse.findByCountry("UA", 10.0, 20.0);
//
//        if( found.isEmpty() ){
//            System.out.println("Not found");
//        }
//        else {
//            System.out.println("Found: " + found);
//        }


    }




}
