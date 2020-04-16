package service;

import model.Product;
import service.Interface.IProduct;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProductImpl implements IProduct {

    @Override
    public List<Product> findAll() {
        List<Product> list = new ArrayList<>();
        try (PreparedStatement statement = Connect.getConnection().prepareStatement("select * from products")){
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()){
                String productCode = resultSet.getString(1);
                String productName = resultSet.getString(2);
                float Discount = resultSet.getFloat(3);
                float Price = resultSet.getFloat(4);
//                int amount = resultSet.getInt(5);
                String supplier = resultSet.getString(5);
//                String typeCode = resultSet.getString(7);
                String image = resultSet.getString(6);
//                int amountImport = resultSet.getInt(9);
//                int amountExport = resultSet.getInt(10);
//                String description = resultSet.getString(11);
//                Product product = new Product(productCode,productName,
//                        Discount,Price,amount,supplier,typeCode,
//                        image,amountImport,amountExport,description);
                Product product = new Product(productCode,productName,Discount,Price,supplier,image);
                list.add(product);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }

    @Override
    public void save(Product product) throws SQLException {

    }

    @Override
    public Product findById(int id) {
        return null;
    }

    @Override
    public boolean update(int id, Product product) throws SQLException {
        return false;
    }

    @Override
    public boolean remove(int id) throws SQLException {
        return false;
    }
}
