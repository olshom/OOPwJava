package datasource;

import jakarta.persistence.*;

public class MariaDbConnection {
    private static EntityManagerFactory entityManagerFactory;
    private static EntityManager entityManager;

    public static EntityManager getInstance() {
        if (entityManager == null) {
            if (entityManagerFactory == null) {
                entityManagerFactory = Persistence.createEntityManagerFactory("CurrencyRatesMariaDbUnit");
            }
            entityManager = entityManagerFactory.createEntityManager();
        }
        return entityManager;
    }
}

