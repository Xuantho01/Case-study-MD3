package view.Interface;

import model.typeProduct;

import java.sql.SQLException;
import java.util.List;

public interface ITypeProduct {
    public List<typeProduct> findAll();

    public void save(typeProduct type) throws SQLException;

    public typeProduct findById(int id);

    public boolean update(int id, typeProduct type) throws SQLException;

    public boolean remove(int id) throws SQLException;
}
