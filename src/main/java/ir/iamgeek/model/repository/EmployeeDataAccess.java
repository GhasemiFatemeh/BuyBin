package ir.iamgeek.model.repository;

import ir.iamgeek.common.JpaProvider;
import ir.iamgeek.model.entity.Bin;
import ir.iamgeek.model.entity.Employee;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;
import java.util.List;

public class EmployeeDataAccess implements AutoCloseable {
    private final EntityManager entityManager;
    private EntityTransaction entityTransaction;

    public EmployeeDataAccess() {
        entityManager = JpaProvider.getEntityManger();
    }

    public void insert(Employee employee) {
        entityTransaction = entityManager.getTransaction();
        entityTransaction.begin();
        entityManager.persist(employee);
        entityTransaction.commit();
    }

    public void delete(Employee employee) {
        entityTransaction = entityManager.getTransaction();
        entityTransaction.begin();
        entityManager.remove(employee);
        entityTransaction.commit();
    }

    public void update(Employee employee) {
        entityTransaction = entityManager.getTransaction();
        entityTransaction.begin();
        entityManager.merge(employee);
        entityTransaction.commit();
    }

    public List<Employee> selectAll() {
        Query selectQuery = entityManager.createQuery("select o from Employee o");
        return (List<Employee>) selectQuery.getResultList();
    }

    public Employee selectById(long id) {
        Query query = entityManager.createQuery("select o from Employee o where empId=" + id);
        return (Employee) query.getResultList();
    }

    public void insertBinForEmployee(Bin bin){

    }

    @Override
    public void close() {
        entityManager.close();
    }
}
