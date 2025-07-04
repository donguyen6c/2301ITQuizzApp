package com.ngocdo.services;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.ngocdo.pojo.Category;
import com.ngocdo.utils.JdbcConnector;

public class CategoryService {

    public List<Category> getCates() throws SQLException{
    Connection conn = JdbcConnector.getInstance().connect();

    Statement stm = conn.createStatement();
    ResultSet rs = stm.executeQuery("Select * From category");
    List<Category> cates= new ArrayList<>();while(rs.next())
    {
        int id = rs.getInt("id");
        String name = rs.getString("name");

        Category c = new Category(id, name);
        cates.add(c);
    }  
    return cates;
    }
}
