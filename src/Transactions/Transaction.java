package Transactions;

public class Transaction {
    private int source;
    private int destination;
    private double sum;

    public Transaction(int source, int destination, double sum) {
        this.source = source;
        this.destination = destination;
        this.sum = sum;
    }

    public int getDestination() {
        return destination;
    }

    public int getSource() {
        return source;
    }

    public double getSum() {
        return sum;
    }

    @Override
    public String toString() {
        return  source +
                " => " + destination +
                ": " + sum;
    }
}
