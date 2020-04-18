package service.Interface;

import model.Oder;
import model.Product;

import java.sql.SQLException;
import java.util.List;

public interface IOder {
    public List<Oder> findAll();

    public void save(Oder oder) throws SQLException;

    public Oder findByUserName(String userName);

    public void update(Product product) throws SQLException;

    public boolean remove(int id) throws SQLException;
}
