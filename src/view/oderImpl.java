package view;

import model.oder;
import view.Interface.IOder;

import java.sql.SQLException;
import java.util.List;

public class oderImpl implements IOder {
    @Override
    public List<oder> findAll() {
        return null;
    }

    @Override
    public void save(oder oder) throws SQLException {

    }

    @Override
    public oder findById(int id) {
        return null;
    }

    @Override
    public boolean update(int id, oder product) throws SQLException {
        return false;
    }

    @Override
    public boolean remove(int id) throws SQLException {
        return false;
    }
}
