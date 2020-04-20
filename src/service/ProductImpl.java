package service;

import model.ProductForSearch;
import model.Product;
import service.Interface.IProduct;

import java.io.Reader;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProductImpl implements IProduct {


    @Override
    public List<Product> findAll() {
        List<Product> list = new ArrayList<>();
        try (PreparedStatement statement = Connect.getConnection().prepareStatement("select * from product")) {
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                String productCode = resultSet.getString(1);
                String productName = resultSet.getString(2);
                float Discount = resultSet.getFloat(3);
                float Price = resultSet.getFloat(4);
                int amount = resultSet.getInt(5);
                String supplier = resultSet.getString(6);
                String typeCode = resultSet.getString(7);
                String image = resultSet.getString(8);
                int amountImport = resultSet.getInt(9);
                int amountExport = resultSet.getInt(10);
                String description = resultSet.getString(11);

                Product product = new Product(productCode, productName,
                        Discount, Price, amount, supplier, typeCode,
                        image, amountImport, amountExport, description);
                list.add(product);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }

    @Override
    public void save(Product product) throws SQLException {
        try (PreparedStatement statement = Connect.getConnection().prepareStatement(
                "insert into product (productCode, productName, Discount, Price, amount, supplier, typeCode, amountImport, AmountExport,image) value (?,?,?,?,?,?,?,?,?,?)")) {
            statement.setString(1, product.getProductCode());
            statement.setString(2, product.getProductName());
            statement.setFloat(3, product.getDiscount());
            statement.setFloat(4, product.getPrice());
            statement.setInt(5, product.getAmount());
            statement.setString(6, product.getSupplier());
            statement.setString(7, product.getTypeCode());
            statement.setInt(8, product.getAmountImport());
            statement.setInt(9, product.getAmountExport());
            statement.setString(10, product.getImage());
            statement.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public Product findByProductCode(String productCode) {
        Product product = null;
        try (PreparedStatement statement = Connect.getConnection().prepareStatement
                ("select * from product where productCode = ?")) {
            statement.setString(1, productCode);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()){
                String PCode = resultSet.getString(1);
                String productName = resultSet.getString(2);
                float Discount = resultSet.getFloat(3);
                float Price = resultSet.getFloat(4);
                int amount = resultSet.getInt(5);
                String supplier = resultSet.getString(6);
                String typeCode = resultSet.getString(7);
                String image = resultSet.getString(8);
                int amountImport = resultSet.getInt(9);
                int amountExport = resultSet.getInt(10);
                String description = resultSet.getString(11);

                product = new Product(PCode, productName,
                        Discount, Price, amount, supplier, typeCode,
                        image, amountImport, amountExport, description);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return product;
    }
    @Override
    public List<Product> findProductByInputType(String inputType) {

        List<Product> list = new ArrayList<>();
//        List<ProductForSearch> list = new ArrayList<>();
        try (PreparedStatement statement = Connect.getConnection().prepareStatement
                ("select * from productFollowType where sex = ?")) {
            statement.setString(1, inputType);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()){
                String PCode = resultSet.getString("productCode");
                String productName = resultSet.getString("productName");
                float Discount = resultSet.getFloat("Discount");
                float Price = resultSet.getFloat("Price");
                int amount = resultSet.getInt("amount");
                String supplier = resultSet.getString("supplier");
                String typeCode = resultSet.getString("typeCode");
                String image = resultSet.getString("image");
                int amountImport = resultSet.getInt("amountImport");
                int amountExport = resultSet.getInt("AmountExport");
                String description = resultSet.getString("description");
                String sex = resultSet.getString("sex");
               Product product = new Product(PCode, productName,
                        Discount, Price, amount, supplier, typeCode,
                        image, amountImport, amountExport, description, sex);
                list.add(product);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }

    private String getParameter(ResultSet resultSet, int i) throws SQLException {
        return resultSet.getString(i);
    }

    @Override
    public void update(String productCode, Product product) throws SQLException {
        try {
            PreparedStatement statement = Connect.getConnection().prepareStatement(
                    "update product set productCode = ?, productName = ? , Discount = ?, Price = ?, amount = ?, supplier = ?, typeCode = ?, amountImport = ?, AmountExport = ?, image = ?, description = ? where productCode = ?");
            statement.setString(1, product.getProductCode());
            statement.setString(2, product.getProductName());
            statement.setFloat(3, product.getDiscount());
            statement.setFloat(4, product.getPrice());
            statement.setInt(5, product.getAmount());
            statement.setString(6, product.getSupplier());
            statement.setString(7, product.getTypeCode());
            statement.setString(8, product.getImage());
            statement.setInt(9, product.getAmountImport());
            statement.setInt(10, product.getAmountExport());
            statement.setString(11, product.getDescription());
            statement.setString(12, productCode);
            statement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void remove(String productCode) throws SQLException {
        try (PreparedStatement statement = Connect.getConnection().prepareStatement("delete from product where productCode = ?")){
            statement.setString(1,productCode);
            statement.executeUpdate();
        }catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
