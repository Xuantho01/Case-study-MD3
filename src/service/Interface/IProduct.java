package service.Interface;
import model.Product;

import java.sql.SQLException;
import java.util.List;

public interface IProduct {
    public List<Product> findAll();

    public void save(Product product) throws SQLException;

    public Product findById(int id);

    public boolean update(int id, Product product) throws SQLException;

    public boolean remove(int id) throws SQLException;
}
