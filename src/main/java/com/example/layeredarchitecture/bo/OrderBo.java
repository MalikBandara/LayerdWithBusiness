package com.example.layeredarchitecture.bo;

import com.example.layeredarchitecture.dao.custom.impl.OrderDAOImpl;
import com.example.layeredarchitecture.model.OrderDTO;

import java.sql.SQLException;

public interface OrderBo {
    public String generateNewID() throws SQLException, ClassNotFoundException ;



    public boolean exist(String orderId) throws SQLException, ClassNotFoundException ;


    public boolean Add(OrderDTO dto) throws SQLException, ClassNotFoundException ;
}
