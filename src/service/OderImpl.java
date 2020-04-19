package service;

import model.Oder;
import model.Product;
import service.Interface.IOder;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class OderImpl implements IOder {
    @Override
    public List<Oder> findAll() {
        List<Oder> list = new ArrayList<>();
        try (PreparedStatement statement = Connect.getConnection().prepareStatement("select * from Oder")){
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()){
                String OrderCode = resultSet.getString("oderCode");
                String userName = resultSet.getString("userName");
                String productList = resultSet.getString("productList");
                int totalAmount = resultSet.getInt("totalAmount");
                float totalPrice = resultSet.getFloat("totalPrice");
                Date dateBuy = resultSet.getDate("dateBuy");
                String status = resultSet.getString("status");
                Oder oder = new Oder(OrderCode,userName,productList,totalAmount,totalPrice,dateBuy,status);
                list.add(oder);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }

    @Override
    public void save(Oder oder) throws SQLException {

    }

    @Override
    public Oder findByUserName(String userName) {

        return null;
    }

    @Override
    public void update(Product product) throws SQLException {
        try (PreparedStatement statement = Connect.getConnection().prepareStatement(
                "insert into oder (userName, productList, totalAmount, totalPrice) value (?,?,?,?)")){
            statement.setString(1, product.getUserName());
            statement.setString(2, product.getProductCode());
            statement.setInt(3, product.getAmount());
            statement.setFloat(4, product.getAmount()*product.getPrice());
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public boolean remove(int id) throws SQLException {
        return false;
    }
}
