package LAB_06;

public class Account {
    private String accountNumber;
    private String accountHolder;
    private double balance;

    public Account(String accountNumber, String accountHolder, double balance) {
        this.accountHolder= accountHolder;
        this.accountNumber= accountNumber;
        this.balance= balance;
    }
    public double getBalance(){
        return balance;
    }
public double processDeposit(){
        double depositAdd = 2000;
        double   depositedBalance =balance+ depositAdd;
         return depositedBalance;
}

    public double processCheck(){
        double checkSub = 1500;
        double checkedBalance = balance - checkSub;
        return checkedBalance;
    }








    public static void main(String[] args) {
        Account AccountTest1= new Account("194648253","Perederic Christian", 24655.0);
        Account AccountTest2= new Account("197464665","John Doe", 57593.0);
        System.out.println(AccountTest1.processDeposit());
        System.out.println(AccountTest2.processCheck());

    }
}
