package view.Interface;

import model.oder;

import java.sql.SQLException;
import java.util.List;

public interface IOder {
    public List<oder> findAll();

    public void save(oder oder) throws SQLException;

    public oder findById(int id);

    public boolean update(int id, oder product) throws SQLException;

    public boolean remove(int id) throws SQLException;
}
