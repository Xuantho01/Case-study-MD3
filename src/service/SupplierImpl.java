package service;

import model.Supplier;
import service.Interface.ISupplier;

import java.sql.SQLException;
import java.util.List;

public class SupplierImpl implements ISupplier {
    @Override
    public List<Supplier> findAll() {
        return null;
    }

    @Override
    public void save(Supplier supplier) throws SQLException {

    }

    @Override
    public Supplier findById(int id) {
        return null;
    }

    @Override
    public boolean update(int id, Supplier supplier) throws SQLException {
        return false;
    }

    @Override
    public boolean remove(int id) throws SQLException {
        return false;
    }
}
