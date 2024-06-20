package com.example.layeredarchitecture.bo;


import com.example.layeredarchitecture.model.CustomerDTO;

import java.sql.SQLException;
import java.util.ArrayList;

public interface CustomerBo {
    public ArrayList<CustomerDTO> getAll() throws SQLException, ClassNotFoundException ;
    public boolean Add(CustomerDTO dto) throws SQLException, ClassNotFoundException ;
    public boolean update(CustomerDTO dto) throws SQLException, ClassNotFoundException ;

    public boolean exist(String id) throws SQLException, ClassNotFoundException;
    public String generateNewID() throws SQLException, ClassNotFoundException ;
    public boolean Delete(String id) throws SQLException, ClassNotFoundException ;
    public CustomerDTO search(String id) throws SQLException, ClassNotFoundException ;

}
