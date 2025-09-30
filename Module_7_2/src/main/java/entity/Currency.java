package entity;

public class Currency {

    private String abbreviation;
    private String name;
    private double exchangeRateToEUR;

    public Currency(String abbreviation, String name, double exchangeRateToEUR) {
        this.abbreviation = abbreviation;
        this.name = name;
        this.exchangeRateToEUR = exchangeRateToEUR;
    }
    public double getRateToEUR() {
        return exchangeRateToEUR;
    }
    public String getAbbreviation() {
        return abbreviation;
    }
}
