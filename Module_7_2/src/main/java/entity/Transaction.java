package entity;

import jakarta.persistence.*;

@Entity
@Table(name = "transactions")
public class Transaction {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int id;
    private double amount;
    @ManyToOne
    @JoinColumn(name = "currencyFrom_id")
    private Currency currencyFrom;
    @ManyToOne
    @JoinColumn(name = "currencyTo_id")
    private Currency currencyTo;


    public Transaction(double amount, Currency currencyFrom, Currency currencyTo) {
        this.amount = amount;
        this.currencyFrom = currencyFrom;
        this.currencyTo = currencyTo;
    }

    public Transaction() {
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public double getAmount() {
        return amount;
    }
    public void setAmount(int amount) {
        this.amount = amount;
    }
}
