package service.Interface;

import model.Oder;

import java.sql.SQLException;
import java.util.List;

public interface IOder {
    public List<Oder> findAll();

    public void save(Oder oder) throws SQLException;

    public Oder findById(int id);

    public boolean update(int id, Oder product) throws SQLException;

    public boolean remove(int id) throws SQLException;
}
