package com.example.layeredarchitecture.dao.custom;


import com.example.layeredarchitecture.dao.CrudDAO;
import com.example.layeredarchitecture.model.OrderDTO;

import java.sql.SQLException;

public interface OrderDAO extends CrudDAO<OrderDTO> {
    public String generateNewID() throws SQLException, ClassNotFoundException;
    public boolean exist(String orderId) throws SQLException, ClassNotFoundException;
    public boolean Add(OrderDTO dto) throws SQLException, ClassNotFoundException;
}
