package service;

import model.Supplier;
import service.Interface.ISupplier;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class SupplierImpl implements ISupplier {
    @Override
    public List<Supplier> findAll() {
        List<Supplier> list = new ArrayList<>();
        try (PreparedStatement statement = Connect.getConnection().prepareStatement(
                "select*from supplier")){
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()){
                String supplierCode = resultSet.getString("supplierCode");
                String name = resultSet.getString("nameSupplier");
                String address = resultSet.getString("address");
                int phoneNumber = resultSet.getInt("phoneNumber");
                Supplier supplier = new Supplier(supplierCode,name, address, phoneNumber);
                list.add(supplier);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }

    @Override
    public void save(Supplier supplier) throws SQLException {

    }

    @Override
    public Supplier findById(int id) {
        return null;
    }

    @Override
    public boolean update(int id, Supplier supplier) throws SQLException {
        return false;
    }

    @Override
    public boolean remove(int id) throws SQLException {
        return false;
    }
}
