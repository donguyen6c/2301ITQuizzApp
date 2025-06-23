/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ngocdo.utils;

import javafx.scene.control.Alert;

/**
 *
 * @author admin
 */
public class MyAlert {
    private static MyAlert instance;
    private final  Alert alert;
    private MyAlert(){
        alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Quizz App");
        alert.setHeaderText("Cau Hoi?");
    }
    
    public static MyAlert getInstace(){
        if(instance==null){
            instance=new MyAlert();
        }
        return instance;
    }
    
    public void ShowMsg(String s){
        this.alert.setContentText(s);
        this.alert.showAndWait();
    }
}
