package view;

import model.product;
import view.Interface.IProduct;

import java.sql.SQLException;
import java.util.List;

public class productImpl implements IProduct {

    @Override
    public List<product> findAll() {
        return null;
    }

    @Override
    public void save(product product) throws SQLException {

    }

    @Override
    public product findById(int id) {
        return null;
    }

    @Override
    public boolean update(int id, product product) throws SQLException {
        return false;
    }

    @Override
    public boolean remove(int id) throws SQLException {
        return false;
    }
}
