package dao;

import entity.Transaction;
import jakarta.persistence.EntityManager;

public class TransactionDao {
    public void persist(Transaction transaction) {
        EntityManager em = datasource.MariaDbConnection.getInstance();
        em.getTransaction().begin();
        em.persist(transaction);
        em.getTransaction().commit();
    }
}
