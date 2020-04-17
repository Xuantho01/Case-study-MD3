package service;

import model.TypeProduct;
import service.Interface.ITypeProduct;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class TypeProductImpl implements ITypeProduct {
    @Override
    public List<TypeProduct> findAll() {
        List<TypeProduct> list = new ArrayList<>();
        try(PreparedStatement statement = Connect.getConnection().prepareStatement(
                "select * from typeproduct")) {
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()){
                String typeCode = resultSet.getString("typeCode");
                String typeName = resultSet.getString("typeName");
                String description = resultSet.getString("description");
                TypeProduct typeProduct = new TypeProduct(typeCode, typeName, description);
                list.add(typeProduct);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }

    @Override
    public void save(TypeProduct type) throws SQLException {

    }

    @Override
    public TypeProduct findById(int id) {
        return null;
    }

    @Override
    public boolean update(int id, TypeProduct type) throws SQLException {
        return false;
    }

    @Override
    public boolean remove(int id) throws SQLException {
        return false;
    }
}
