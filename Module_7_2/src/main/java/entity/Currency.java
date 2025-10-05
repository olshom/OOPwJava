package entity;

import jakarta.persistence.*;

@Entity
@Table(name = "currencies")
public class Currency {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String abbreviation;
    private String name;
    private double exchangeRateToEUR;

    public Currency(String abbreviation, String name, double exchangeRateToEUR) {
        this.abbreviation = abbreviation;
        this.name = name;
        this.exchangeRateToEUR = exchangeRateToEUR;
    }

    public Currency() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAbbreviation() {
        return abbreviation;
    }

    public void setAbbreviation(String abbreviation) {
        this.abbreviation = abbreviation;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getExchangeRateToEUR() {
        return exchangeRateToEUR;
    }

    public void setExchangeRateToEUR(double exchangeRateToEUR) {
        this.exchangeRateToEUR = exchangeRateToEUR;
    }
}
