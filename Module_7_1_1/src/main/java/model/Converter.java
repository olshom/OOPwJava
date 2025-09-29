package model;

import java.util.HashMap;

public class Converter {
    HashMap<String, Double> euRates;
    public Converter() {
        euRates = new HashMap<>();
        euRates.put("EUR", 1.0);
        euRates.put("USD", 1.07);
        euRates.put("GBP", 0.88);
        euRates.put("BGN", 1.95583);
    }
    private double getRate(String currency) {
        return euRates.get(currency);
    }
    public double convert(double amount, String from, String to) {
        double firstStep = amount / getRate(from);
        return firstStep * getRate(to);
    }

}
