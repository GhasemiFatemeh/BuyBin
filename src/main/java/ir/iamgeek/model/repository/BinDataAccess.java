package ir.iamgeek.model.repository;

import ir.iamgeek.common.JpaProvider;
import ir.iamgeek.model.entity.Bin;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;
import java.util.List;

public class BinDataAccess implements AutoCloseable {
    private final EntityManager entityManager;
    private EntityTransaction entityTransaction;

    public BinDataAccess() {
        entityManager = JpaProvider.getEntityManger();
    }

    public void insert(Bin bin) {
        entityTransaction = entityManager.getTransaction();
        entityTransaction.begin();
        entityManager.persist(bin);
        entityTransaction.commit();
    }

    public void delete(Bin bin) {
        entityTransaction = entityManager.getTransaction();
        entityTransaction.begin();
        entityManager.remove(bin);
        entityTransaction.commit();
    }

    public void update(Bin bin) {
        entityTransaction = entityManager.getTransaction();
        entityTransaction.begin();
        entityManager.merge(bin);
        entityTransaction.commit();
    }

    public List<Bin> selectAll() {
        Query selectQuery = entityManager.createQuery("select o from Bin o");
        return (List<Bin>) selectQuery.getResultList();
    }

    public Bin selectById(long id) {
        Query query = entityManager.createQuery("select o from Bin o where binId=" + id);
        return (Bin) query.getResultList();
    }

    @Override
    public void close() {
        entityManager.close();
    }
}
