package controller;

import dao.CurrencyDao;
import entity.Currency;
import view.ConverterView;

import java.util.ArrayList;
import java.util.List;

public class Controller {
    private ConverterView view;
    private CurrencyDao currencyDao;

    public Controller(ConverterView view) {
        this.view = view;
        this.currencyDao = new CurrencyDao();
    }
    public double convert (double amount, String from, String to) {
        try {
            Currency currencyFrom = currencyDao.getCurrencyByAbbreviation(from);
            Currency currencyTo = currencyDao.getCurrencyByAbbreviation(to);

        double rateFrom = currencyFrom.getRateToEUR();
        double rateTo = currencyTo.getRateToEUR();
        double amountInEur = amount / rateFrom;
        return amountInEur * rateTo;
        } catch (Exception e) {
            view.showDatabaseError(e.getMessage());
            return -1;
        }
    }

    public List<String> getAllCurrencyAbbreviations() {
        try{
            List<Currency> currencies = currencyDao.getAllCurrencies();
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