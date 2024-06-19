package com.example.layeredarchitecture.bo;

import com.example.layeredarchitecture.dao.OrderDAOImpl;
import com.example.layeredarchitecture.dao.SQLUtil;
import com.example.layeredarchitecture.model.OrderDTO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class OrderBoImpl {

    public String generateNewID() throws SQLException, ClassNotFoundException {
        OrderDAOImpl orderDAO = new OrderDAOImpl();
        return  orderDAO.generateNewID();
    }




    public boolean exist(String orderId) throws SQLException, ClassNotFoundException {
        OrderDAOImpl orderDAO = new OrderDAOImpl();
        return orderDAO.exist(orderId);
    }



    public boolean Add(OrderDTO dto) throws SQLException, ClassNotFoundException {
        OrderDAOImpl orderDAO = new OrderDAOImpl();
        return orderDAO.Add(dto);
    }



}
