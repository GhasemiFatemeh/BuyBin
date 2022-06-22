package ir.iamgeek.model.service;

import ir.iamgeek.model.entity.Bin;
import ir.iamgeek.model.entity.Employee;
import ir.iamgeek.model.repository.EmployeeDataAccess;

import java.util.List;

public class EmployeeService {
    private static final EmployeeService employeeService = new EmployeeService();

    private EmployeeService() {
    }

    public void addBinForEmployee(Employee employee, Bin bin){

    }

    public static EmployeeService getInstance() {
        return employeeService;
    }

    public void save(Employee employee) {
        try (EmployeeDataAccess employeeDataAccess = new EmployeeDataAccess()) {
            employeeDataAccess.insert(employee);
        }
    }

    public void remove(Employee employee) {
        try (EmployeeDataAccess employeeDataAccess = new EmployeeDataAccess()) {
            employeeDataAccess.delete(employee);
        }
    }

    public void update(Employee employee) {
        try (EmployeeDataAccess employeeDataAccess = new EmployeeDataAccess()) {
            employeeDataAccess.update(employee);
        }
    }

    public List<Employee> findAll() {
        try (EmployeeDataAccess employeeDataAccess = new EmployeeDataAccess()) {
            return employeeDataAccess.selectAll();
        }
    }

    public Employee findOneById(long id) {
        try (EmployeeDataAccess employeeDataAccess = new EmployeeDataAccess()) {
            return employeeDataAccess.selectById(id);
        }
    }
}
