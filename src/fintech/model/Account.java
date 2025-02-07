package fintech.model;

/**
 * @author 12S23006 - Cardolan Sinaga
 * @author 12S23051 - Theresia Silaban
 */
public class Account {
    private String owner;
    private String accountName;
    private double balance;

    public Account(String owner, String accountName) {
        this.owner = owner;
        this.accountName = accountName;
        this.balance = 0.0;
    }

    public String getOwner() {
        return owner;
    }

    public String getAccountName() {
        return accountName;
    }

    public double getBalance() {
        return balance;
    }

    public void updateBalance(double amount) {
        this.balance += amount;
    }

    @Override
    public String toString() {
        return accountName + "|" + owner + "|" + balance;
    }
}