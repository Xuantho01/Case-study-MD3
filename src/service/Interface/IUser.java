package service.Interface;

import model.User;

import java.sql.SQLException;
import java.util.List;

public interface IUser {
    public List<User> findAll();

    public void save(User user) throws SQLException;

    public User findById(int id);

    public boolean update(int id, User product) throws SQLException;

    public boolean remove(int id) throws SQLException;
}
