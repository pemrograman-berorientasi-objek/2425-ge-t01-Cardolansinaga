package fintech.model;

import java.time.LocalDateTime;

/**
 * @author 12S23006 - Cardolan Sinaga
 * @author 12S23051 - Theresia Silaban
 */
public class Transaction {
    private static int idCounter = 0;
    private int id;
    private String accountName;
    private double amount;
    private LocalDateTime postedAt;
    private String note;

    public Transaction(String accountName, double amount, LocalDateTime postedAt, String note) {
        this.id = ++idCounter;
        this.accountName = accountName;
        this.amount = amount;
        this.postedAt = postedAt;
        this.note = note;
    }

    public int getId() {
        return id;
    }

    public String getAccountName() {
        return accountName;
    }

    public double getAmount() {
        return amount;
    }

    public LocalDateTime getPostedAt() {
        return postedAt;
    }

    public String getNote() {
        return note;
    }

    @Override
    public String toString() {
        return id + "|" + accountName + "|" + amount + "|" + postedAt + "|" + note;
    }
}