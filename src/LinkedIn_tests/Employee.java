package LinkedIn_tests;

public class Employee extends Human {

    protected double salary;
    private String location;



    public Employee(String name, double salary, String location, int age) {
        super(name,age);
        this.salary = salary;
        this.location = location;

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
