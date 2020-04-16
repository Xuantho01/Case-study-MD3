package service;

import model.TypeProduct;
import service.Interface.ITypeProduct;

import java.sql.SQLException;
import java.util.List;

public class TypeProductImpl implements ITypeProduct {
    @Override
    public List<TypeProduct> findAll() {
        return null;
    }

    @Override
    public void save(TypeProduct type) throws SQLException {

    }

    @Override
    public TypeProduct findById(int id) {
        return null;
    }

    @Override
    public boolean update(int id, TypeProduct type) throws SQLException {
        return false;
    }

    @Override
    public boolean remove(int id) throws SQLException {
        return false;
    }
}
