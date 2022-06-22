package ir.iamgeek.common;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JpaProvider {
    private static final EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("bin");

    public static EntityManager getEntityManger() {
        return entityManagerFactory.createEntityManager();
    }
}
