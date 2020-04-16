package view;

import model.typeProduct;
import view.Interface.ITypeProduct;

import java.sql.SQLException;
import java.util.List;

public class typeProductImpl implements ITypeProduct {
    @Override
    public List<typeProduct> findAll() {
        return null;
    }

    @Override
    public void save(typeProduct type) throws SQLException {

    }

    @Override
    public typeProduct findById(int id) {
        return null;
    }

    @Override
    public boolean update(int id, typeProduct type) throws SQLException {
        return false;
    }

    @Override
    public boolean remove(int id) throws SQLException {
        return false;
    }
}
