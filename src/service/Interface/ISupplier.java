package service.Interface;

import model.Supplier;

import java.sql.SQLException;
import java.util.List;

public interface ISupplier {
    public List<Supplier> findAll();

    public void save(Supplier supplier) throws SQLException;

    public Supplier findById(int id);

    public boolean update(int id, Supplier supplier) throws SQLException;

    public boolean remove(int id) throws SQLException;
}
