package LinkedIn_tests;

public class SalesPerson  extends Employee{
private double salaryIncrease;


    public SalesPerson(String name, double salary, String location,int age,double salaryIncrease){
        super(name,salary,location,age);
        this.salaryIncrease =salaryIncrease;
    }
public double applySalaryIncrease(){
       salary= salary+salaryIncrease;
       return salary;
}

    public static void main(String[] args) {
SalesPerson s1 =
        new SalesPerson("Kevin Conroy",400,"France",45,700);
        System.out.println(s1.applySalaryIncrease());
    }
}
