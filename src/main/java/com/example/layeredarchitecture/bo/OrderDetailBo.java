package com.example.layeredarchitecture.bo;

import com.example.layeredarchitecture.dao.custom.impl.OrderDetailsDAOImpl;
import com.example.layeredarchitecture.model.OrderDetailDTO;

import java.sql.SQLException;

public interface OrderDetailBo {
    public boolean saveOrderDetails(OrderDetailDTO dto) throws SQLException, ClassNotFoundException ;

}
