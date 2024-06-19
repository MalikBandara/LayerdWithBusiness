package com.example.layeredarchitecture.bo;

import com.example.layeredarchitecture.dao.ItemDAOImpl;

import com.example.layeredarchitecture.model.ItemDTO;


import java.sql.SQLException;
import java.util.ArrayList;

public class ItemBoImpl {

    public ArrayList<ItemDTO> getAll() throws SQLException, ClassNotFoundException {

        ItemDAOImpl itemDAO = new ItemDAOImpl();
        return  itemDAO.getAll();
    }

    public boolean Delete(String code) throws SQLException, ClassNotFoundException {
        ItemDAOImpl itemDAO = new ItemDAOImpl();
        return itemDAO.Delete(code);
    }

    public boolean Add(ItemDTO dto) throws SQLException, ClassNotFoundException {
        ItemDAOImpl itemDAO = new ItemDAOImpl();
        return itemDAO.Add(dto);
    }

    public boolean update(ItemDTO dto) throws SQLException, ClassNotFoundException {

        ItemDAOImpl itemDAO = new ItemDAOImpl();
        return itemDAO.update(dto);
    }

    public boolean exist(String code) throws SQLException, ClassNotFoundException {

        ItemDAOImpl itemDAO = new ItemDAOImpl();
        return  itemDAO.exist(code);


    }

    public String generateNewID() throws SQLException, ClassNotFoundException {
        ItemDAOImpl itemDAO = new ItemDAOImpl();
        return itemDAO.generateNewID();
    }

    public ItemDTO search(String code) throws SQLException, ClassNotFoundException {
        ItemDAOImpl itemDAO = new ItemDAOImpl();
        return itemDAO.search(code);
    }

}
