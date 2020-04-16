package view.Interface;

import model.supplier;

import java.sql.SQLException;
import java.util.List;

public interface ISupplier {
    public List<supplier> findAll();

    public void save(supplier supplier) throws SQLException;

    public supplier findById(int id);

    public boolean update(int id, supplier supplier) throws SQLException;

    public boolean remove(int id) throws SQLException;
}
