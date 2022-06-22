package ir.iamgeek.model.service;

import ir.iamgeek.model.entity.Bin;
import ir.iamgeek.model.repository.BinDataAccess;

import java.util.List;

public class BinService {
    private static final BinService binService = new BinService();

    private BinService() {
    }

    public static BinService getInstance() {
        return binService;
    }

    public void save(Bin bin) {
        try (BinDataAccess binDataAccess = new BinDataAccess()) {
            binDataAccess.insert(bin);
        }
    }

    public void remove(Bin bin) {
        try (BinDataAccess binDataAccess = new BinDataAccess()) {
            binDataAccess.delete(bin);
        }
    }

    public void update(Bin bin) {
        try (BinDataAccess binDataAccess = new BinDataAccess()) {
            binDataAccess.update(bin);
        }
    }

    public List<Bin> findAll() {
        try (BinDataAccess binDataAccess = new BinDataAccess()) {
            return binDataAccess.selectAll();
        }
    }

    public Bin findOneById(long id) {
        try (BinDataAccess binDataAccess = new BinDataAccess()) {
            return binDataAccess.selectById(id);
        }
    }
}
