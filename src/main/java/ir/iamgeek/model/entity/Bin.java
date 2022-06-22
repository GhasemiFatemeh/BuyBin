package ir.iamgeek.model.entity;

import jakarta.persistence.*;

@Table
@Entity
public class Bin {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private long binId;
    @Column
    private long empId;
    @Column
    private String binName;
    @Column
    private long price;
    @Column
    private int quantity;
    @Version
    private long recordVersion;

    public long getBinId() {
        return binId;
    }

    public Bin setBinId(long binId) {
        this.binId = binId;
        return this;
    }

    public long getRecordVersion() {
        return recordVersion;
    }

    public Bin setRecordVersion(long recordVersion) {
        this.recordVersion = recordVersion;
        return this;
    }

    public String getBinName() {
        return binName;
    }

    public Bin setBinName(String binName) {
        this.binName = binName;
        return this;
    }

    public long getPrice() {
        return price;
    }

    public Bin setPrice(long price) {
        this.price = price;
        return this;
    }

    public int getQuantity() {
        return quantity;
    }

    public Bin setQuantity(int quantity) {
        this.quantity = quantity;
        return this;
    }

    public long getEmpId() {
        return empId;
    }

    public Bin setEmpId(long empId) {
        this.empId = empId;
        return this;
    }
}
