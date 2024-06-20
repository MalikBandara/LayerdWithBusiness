package com.example.layeredarchitecture.bo;

import com.example.layeredarchitecture.dao.custom.impl.OrderDAOImpl;

import com.example.layeredarchitecture.model.OrderDTO;


import java.sql.SQLException;

public class OrderBoImpl implements OrderBo {

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
