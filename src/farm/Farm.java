package farm;

import java.util.Map;
import java.util.TreeMap;


public class Farm {

    private static Map<String, Double> allAnimals = new TreeMap<>();


    /*
    Ex 1.  John has to manage a farm where he takes care of multiple animals. He needs to store all these animals inside a
    collection and to order them alphabetically. Write the function which will help John to visualize his animals in
    alphabetical order.
     */
    public static void printAllAnimals() {
        for (Map.Entry<String, Double> entry : allAnimals.entrySet()) {
            System.out.println(entry.getKey() + ", " + entry.getValue());
        }
    }

    /*
    Ex 2.  It was Black Friday and John bought some new animals for his farm. Write the function which will help John
    update his collection of animals
     */
    public static void addAnimal(String name, double weight) {
        if( name == null ) {
            System.err.println("null name animal");
            return;
        }
        if( weight > 0.0 ){
            allAnimals.put(name.toLowerCase(), weight);
        }
        else {
            System.err.println("Negative weight for " + name);
        }
    }


    /*
    Ex 3.  Christmas is coming, so John will sell some of his animals. Decide the best prices which can be applied
    per kilogram for each animal. Write the function which will help John update his collection of animals, as well as
    compute the total sum of money which he has to earn.
     */
    public static double sellAnimal(String animalName, double price) {
        if( animalName == null){
            System.err.println("null name animal");
            return 0.0;
        }

        if(price <= 0.0 ){
            System.err.println("Can't sell for negative or zero price: " + price);
            return 0.0;
        }

        if (allAnimals.containsKey(animalName.toLowerCase())) {
            double money = allAnimals.get(animalName.toLowerCase()) * price;
            allAnimals.remove(animalName);
            return money;
        } else {
            System.err.println("Can't sell animal " + animalName);
            return 0.0;
        }
    }

    public static void main(String[] args) {
        addAnimal("sheep", 55.76);
        addAnimal("cow", 335.88);
        addAnimal("chicken", 1.5);
        addAnimal("pig", 88.0);
        addAnimal("goat", 77.0);
      //  addAnimal(null, 77.0);


        System.out.println("All animals");
        printAllAnimals();

        double money = sellAnimal("Cow", 10.99);
        money += sellAnimal("sheep", 20.99);

      // money += sellAnimal("sheep", -20.99);
     //  money += sellAnimal("frog", 30.99);


        System.out.printf("%n money: %.2f RON %n%n", money);

        System.out.println("After Christmas");
        printAllAnimals();
    }

}
