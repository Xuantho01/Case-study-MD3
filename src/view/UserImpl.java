package view;

import model.user;
import view.Interface.IUser;

import java.sql.SQLException;
import java.util.List;

public class UserImpl implements IUser {
    @Override
    public List<user> findAll() {
        return null;
    }

    @Override
    public void save(user user) throws SQLException {

    }

    @Override
    public user findById(int id) {
        return null;
    }

    @Override
    public boolean update(int id, user product) throws SQLException {
        return false;
    }

    @Override
    public boolean remove(int id) throws SQLException {
        return false;
    }
}
