package hw7;

public class EnhancedEmployee extends Employee {

    private int age;

    public EnhancedEmployee(String name, double salary, int age) {
        super(name, salary);
        this.age = age;
    }


//    public String getName() {
//        return "Hello, " + super.getName();
//    }

}
