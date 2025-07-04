package com.ngocdo.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class JdbcConnector {
    private static JdbcConnector instance;
    private final Connection conn;

    static {
        try {
            Class.forName("com.sql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            Logger.getLogger(JdbcConnector.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    private JdbcConnector() throws SQLException {
        conn = DriverManager.getConnection("jdbc:mysql://localhost/quizzdb", "root", "root");
    }

    public static JdbcConnector getInstance() throws SQLException {
        if(instance == null){
            instance = new JdbcConnector();
        }
        return instance;
    }

    public Connection connect(){
        return this.conn;
    }

    public void close() throws SQLException{
        if(this.conn != null){
            this.conn.close();
        }
    }
}
