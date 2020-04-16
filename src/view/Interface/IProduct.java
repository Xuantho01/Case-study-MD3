package view.Interface;
import model.product;

import java.sql.SQLException;
import java.util.List;

public interface IProduct {
    public List<product> findAll();

    public void save(product product) throws SQLException;

    public product findById(int id);

    public boolean update(int id, product product) throws SQLException;

    public boolean remove(int id) throws SQLException;
}
