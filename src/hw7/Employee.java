package hw7;


import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Employee {

    private final String name;
    private final double salary;
    private final int id;
    private static int nextId = 1;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
        id = getNextId();
    }


    public double getSalary() {
        return salary;
    }

    public int getId() {
        return id;
    }

    public final String getName() {
        return name;
    }


    public static int getNextId() {
        return nextId++;
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("FINALIZE employeer");
    }

    public static void main(String[] args) throws Exception {

        String str = "hello world again";

        String[] arr = str.split(" ");

        System.out.println(str);

    }

}



