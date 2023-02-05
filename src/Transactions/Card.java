package Transactions;

public class Card {
    private int cardId;
    private String userName;
    private double balance;

    public Card(int cardId, String userName, double balance) {
        this.cardId = cardId;
        this.userName = userName;
        this.balance = balance;
    }

    public int getCardId() {
        return cardId;
    }

    public String getUserName() {
        return userName;
    }

    public double getBalance() {
        return balance;
    }

    public void addBalance(double add){
        this.balance= balance+add;
    }
    public void subtractBalance(double sub){
        this.balance= balance-sub;
    }

    @Override
    public String toString() {
        return
                "cardId=" + cardId +
                ", userName='" + userName + '\'' +
                ", balance=" + balance;
    }
}
