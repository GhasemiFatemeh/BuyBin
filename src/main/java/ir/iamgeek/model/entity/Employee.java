package ir.iamgeek.model.entity;

import jakarta.persistence.*;

@Table
@Entity
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private long empId;
    @Column
    private String name;
    @Column
    private String family;
    @Column
    private long empCode;
    @Version
    private long recordVersion;

    public long getEmpId() {
        return empId;
    }

    public Employee setEmpId(long empId) {
        this.empId = empId;
        return this;
    }

    public long getRecordVersion() {
        return recordVersion;
    }

    public Employee setRecordVersion(long recordVersion) {
        this.recordVersion = recordVersion;
        return this;
    }

    public String getName() {
        return name;
    }

    public Employee setName(String name) {
        this.name = name;
        return this;
    }

    public String getFamily() {
        return family;
    }

    public Employee setFamily(String family) {
        this.family = family;
        return this;
    }

    public long getEmpCode() {
        return empCode;
    }

    public Employee setEmpCode(long empCode) {
        this.empCode = empCode;
        return this;
    }
}
