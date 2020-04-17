package service;

import model.Oder;
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
    public Oder findById(int id) {
        return null;
    }

    @Override
    public boolean update(int id, Oder product) throws SQLException {
        return false;
    }

    @Override
    public boolean remove(int id) throws SQLException {
        return false;
    }
}
