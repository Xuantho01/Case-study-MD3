package service;

import model.Oder;
import service.Interface.IOder;

import java.sql.SQLException;
import java.util.List;

public class OderImpl implements IOder {
    @Override
    public List<Oder> findAll() {
        return null;
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
