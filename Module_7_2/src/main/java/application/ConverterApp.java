package application;

import entity.Currency;
import dao.CurrencyDao;
import view.ConverterView;

import java.util.ArrayList;
import java.util.List;

public class ConverterApp {
    private ConverterView view;
    private CurrencyDao currencyDao = new CurrencyDao();

    public ConverterApp(ConverterView view) {
        this.view = view;
    }

    public void insertCur( String abb, String name, double rate) {
        try {
            Currency currency = new Currency(abb, name, rate);
            currencyDao.persist(currency);
        } catch (Exception e) {
            view.showDatabaseError(e.getMessage());
        }
    }

    public double convert (double amount, String from, String to) {
        try {
            Currency currencyFrom = currencyDao.getCurrencyByAbbreviation(from);
            Currency currencyTo = currencyDao.getCurrencyByAbbreviation(to);
            double rateFrom = currencyFrom.getExchangeRateToEUR();
            double rateTo = currencyTo.getExchangeRateToEUR();
            double amountInEur = amount * rateFrom;
            return amountInEur / rateTo;
        } catch (Exception e) {
            view.showDatabaseError(e.getMessage());
            return -1;
        }
    }

    public List<String> getAllCurrencyAbbreviations() {
        try{
            List<Currency> currencies = currencyDao.findAll();
            List<String> abbreviations = new ArrayList<>();
            for (Currency currency : currencies) {
                abbreviations.add(currency.getAbbreviation());
            }
            return abbreviations;
        } catch (Exception e) {
            view.showDatabaseError(e.getMessage());
            return new ArrayList<>();
        }
    }

    public static void main(String[] args) {
        ConverterView.launch(ConverterView.class);
    }
}
