package service;

import model.User;
import service.Interface.IUser;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UserImpl implements IUser {
    @Override
    public List<User> findAll() {
        List<User> list = new ArrayList<>();
        try(PreparedStatement statement = Connect.getConnection().prepareStatement("" +
                "select*from user")) {
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()){
                String userName = resultSet.getString("userName");
                String password = resultSet.getString("password");
                String name = resultSet.getString("name");
                String sex = resultSet.getString("sex");
                int phoneNumber = resultSet.getInt("phoneNumber");
                String Email = resultSet.getString("Email");
                Date birthday = resultSet.getDate("birthday");
                String address = resultSet.getString("address");
                String numberOfPurchases = resultSet.getString("numOfPurchases");
                String role = resultSet.getString("Role");

                User user = new User(userName,password,name,sex,phoneNumber,
                        Email,birthday,address,numberOfPurchases,role);
                list.add(user);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }

    @Override
    public void save(User user) throws SQLException {

    }

    @Override
    public User findById(int id) {
        return null;
    }

    @Override
    public boolean update(int id, User product) throws SQLException {
        return false;
    }

    @Override
    public boolean remove(int id) throws SQLException {
        return false;
    }
}
