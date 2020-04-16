package service;

import model.User;
import service.Interface.IUser;

import java.sql.SQLException;
import java.util.List;

public class UserImpl implements IUser {
    @Override
    public List<User> findAll() {
        return null;
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
