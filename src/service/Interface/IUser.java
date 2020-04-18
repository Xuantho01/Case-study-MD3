package service.Interface;

import model.User;

import java.sql.SQLException;
import java.util.List;

public interface IUser {
    public List<User> findAll();

    public void save(User user) throws SQLException;

    public User findByUserName(String userName);

    public void update(String userName, User user) throws SQLException;

    public void remove(String userName) throws SQLException;
}
