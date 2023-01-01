package LinkedIn_tests;

public class Employee {
    private String name;
    private double salary;
    private String location;
    private int age;


    public Employee(String name, double salary, String location, int age) {
        this.name = name;
        this.salary = salary;
        this.location = location;
        this.age = age;
    }
    public  double raiseSalary(){
        this.salary=salary+20;
        return salary ;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", location='" + location + '\'' +
                ", age=" + age +
                '}';
    }

    public static void main(String[] args) {


        Employee e1 = new Employee( "John Doe",200.00,"New York",34);
        System.out.println(e1.raiseSalary());
    }
}
