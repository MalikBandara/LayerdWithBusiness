package com.example.layeredarchitecture.dao.custom;

import com.example.layeredarchitecture.dao.CrudDAO;
import com.example.layeredarchitecture.model.ItemDTO;

import java.sql.SQLException;
import java.util.ArrayList;

public interface ItemDAO extends CrudDAO<ItemDTO> {

    public ArrayList<ItemDTO> getAll() throws SQLException, ClassNotFoundException;
    public boolean Delete(String code) throws SQLException, ClassNotFoundException;
    public boolean Add(ItemDTO dto) throws SQLException, ClassNotFoundException;
    public boolean update(ItemDTO dto) throws SQLException, ClassNotFoundException;
    public boolean exist(String code) throws SQLException, ClassNotFoundException;
    public String generateNewID() throws SQLException, ClassNotFoundException;
    public ItemDTO search(String code) throws SQLException, ClassNotFoundException;
}
