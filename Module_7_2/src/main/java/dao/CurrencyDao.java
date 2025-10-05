package dao;

import datasource.MariaDbConnection;

import entity.*;
import jakarta.persistence.EntityManager;
import java.util.List;

public class CurrencyDao {
    public List<Currency> findAll() {
        EntityManager currency = MariaDbConnection.getInstance();
//        String sql = "SELECT abbreviation, name, exchangeRateToEUR FROM currencies";
        List<Currency> currencies = currency.createQuery("select c from Currency c").getResultList();
        return currencies;
    }

    public Currency getCurrencyByAbbreviation(String abbreviation) {
        EntityManager currency = MariaDbConnection.getInstance();
//        String sql = "SELECT abbreviation, name, exchangeRateToEUR FROM currencies WHERE abbreviation = ?";
        Currency thecurrency = currency.createQuery("select c from Currency c where c.abbreviation = :abbreviation", Currency.class)
                .setParameter("abbreviation", abbreviation)
                .getSingleResult();
        return thecurrency;
    }

    public void persist(Currency currency) {
        EntityManager em = MariaDbConnection.getInstance();
        em.getTransaction().begin();
        em.persist(currency);
        em.getTransaction().commit();
    }
}
