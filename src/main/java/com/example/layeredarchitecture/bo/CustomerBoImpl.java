package com.example.layeredarchitecture.bo;

import com.example.layeredarchitecture.dao.CustomerDAOImpl;
import com.example.layeredarchitecture.dao.SQLUtil;
import com.example.layeredarchitecture.db.DBConnection;
import com.example.layeredarchitecture.model.CustomerDTO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class CustomerBoImpl {
    public ArrayList<CustomerDTO> getAll() throws SQLException, ClassNotFoundException {
        CustomerDAOImpl customerDAO = new CustomerDAOImpl();
        return customerDAO.getAll();
    }


    public boolean Add(CustomerDTO dto) throws SQLException, ClassNotFoundException {
        CustomerDAOImpl customerDAO = new CustomerDAOImpl();
        return customerDAO.Add(dto);
    }

    public boolean update(CustomerDTO dto) throws SQLException, ClassNotFoundException {
        CustomerDAOImpl customerDAO = new CustomerDAOImpl();
        return customerDAO.update(dto);
    }

    public boolean exist(String id) throws SQLException, ClassNotFoundException {


        CustomerDAOImpl customerDAO = new CustomerDAOImpl();
        return customerDAO.exist(id);
    }

    public String generateNewID() throws SQLException, ClassNotFoundException {
        CustomerDAOImpl customerDAO = new CustomerDAOImpl();
        return customerDAO.generateNewID();
    }


    public boolean Delete(String id) throws SQLException, ClassNotFoundException {

        CustomerDAOImpl customerDAO = new CustomerDAOImpl();
        return customerDAO.Delete(id);
    }


    public CustomerDTO search(String id) throws SQLException, ClassNotFoundException {

        CustomerDAOImpl customerDAO = new CustomerDAOImpl();
        return customerDAO.search(id);
    }

}
