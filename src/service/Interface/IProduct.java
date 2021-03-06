package service.Interface;
import model.ProductForSearch;
import model.Product;

import java.sql.SQLException;
import java.util.List;

public interface IProduct {
    public List<Product> findAll();

    public void save(Product product) throws SQLException;

    public Product findByProductCode(String productCode);

    public void update(String productCode, Product product) throws SQLException;

    public void remove(String productCode) throws SQLException;

    public List<Product> findProductByInputType(String inputType);
}
