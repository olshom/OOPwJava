package dao;

import datasource.MariaDbConnection;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import entity.Currency;

public class CurrencyDao {
    public List<Currency> getAllCurrencies() {
        Connection conn = MariaDbConnection.getConnection();
        String sql = "SELECT abbreviation, name, exchangeRateToEUR FROM currencies";
        List<Currency> currencies = new ArrayList<>();
        try {
            Statement statement = conn.createStatement();
            ResultSet rs = statement.executeQuery(sql);

            while (rs.next()) {
                String abbreviation = rs.getString("abbreviation");
                String name = rs.getString("name");
                double rate = rs.getDouble("exchangeRateToEUR");
                currencies.add(new Currency(abbreviation, name, rate));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return currencies;
    }

    public Currency getCurrencyByAbbreviation(String abbreviation) {
        Connection conn = MariaDbConnection.getConnection();
        String sql = "SELECT abbreviation, name, exchangeRateToEUR FROM currencies WHERE abbreviation = ?";
        Currency currency = null;
        int count = 0;
        try {
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(1, abbreviation);
            ResultSet rs = statement.executeQuery();

            while (rs.next()) {
                String abbr = rs.getString("abbreviation");
                String name = rs.getString("name");
                double rate = rs.getDouble("exchangeRateToEUR");
                currency = new Currency(abbr, name, rate);
                count++;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        if (count == 1) {
            return currency;
        } else {
            return null;
        }
    }
}
