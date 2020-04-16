package view.Interface;

import model.user;

import java.sql.SQLException;
import java.util.List;

public interface IUser {
    public List<user> findAll();

    public void save(user user) throws SQLException;

    public user findById(int id);

    public boolean update(int id, user product) throws SQLException;

    public boolean remove(int id) throws SQLException;
}
