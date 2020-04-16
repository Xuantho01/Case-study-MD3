package service.Interface;

import model.TypeProduct;

import java.sql.SQLException;
import java.util.List;

public interface ITypeProduct {
    public List<TypeProduct> findAll();

    public void save(TypeProduct type) throws SQLException;

    public TypeProduct findById(int id);

    public boolean update(int id, TypeProduct type) throws SQLException;

    public boolean remove(int id) throws SQLException;
}
