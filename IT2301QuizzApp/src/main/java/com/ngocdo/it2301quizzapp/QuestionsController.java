/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package com.ngocdo.it2301quizzapp;

import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;
import javax.xml.transform.Result;

/**
 * FXML Controller class
 *
 * @author admin
 */
public class QuestionsController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        try{
            //B1: nap driver
            Class.forName("com.sql.cj.jdbc.Driver");
            
            //B2: thiet lap ket noi
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/quizzdb", "root", "root");
            
            //B3: Thuc thi truy van
            Statement stm = conn.createStatement();
            ResultSet rs = stm.executeQuery("Select * From category");
            while(rs.next()){
                int id = rs.getInt("id");
                String ten=rs.getString("name");
            }
        }
        catch(ClassNotFoundException | SQLException ex){
            ex.printStackTrace();
        }
    }    
    
}
