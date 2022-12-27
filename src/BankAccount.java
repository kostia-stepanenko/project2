import java.util.Objects;

public class BankAccount {

    private String name;
    private double balance;
    private double fee;

    public BankAccount(String name, double balance, double fee) {
        if( balance < 0.0 ){
            throw new IllegalArgumentException("balance is negative");
        }
        if( fee < 0.0 ){
            throw new IllegalArgumentException("fee is negative");
        }

        this.name = Objects.requireNonNull(name, "null 'name' detected");
        this.balance = balance;
        this.fee = fee;
    }

    public double withdraw() {
        if (fee > balance) {
            throw new IllegalStateException("Error balance is less than fee");
        }
        balance = balance - fee;
        return balance;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "name='" + name + '\'' +
                ", balance=" + balance +
                ", fee=" + fee +
                '}';
    }

    public static void main(String[] args) {

        BankAccount b1 = new BankAccount("Maksym", 0.0, 5.00);
        b1.withdraw();


//        BankAccount b2 = new BankAccount("James Raynor", 400.00, 100.00);
//        System.out.println(b1);
//        b1.withdraw();
//        System.out.println("After withdraw");
//        System.out.println(b1);
//        System.out.println(b2);
//        b2.withdraw();
//        System.out.println("After withdraw");
//        System.out.println(b2);
    }
}


