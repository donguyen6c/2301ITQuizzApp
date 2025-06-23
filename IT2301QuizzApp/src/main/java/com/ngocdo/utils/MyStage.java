/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ngocdo.utils;

import com.ngocdo.it2301quizzapp.App;
import java.io.IOException;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author admin
 */
public class MyStage {
   private static MyStage instance;
   private Scene scene ;
    private final  Stage stage;
    private MyStage(){
      stage =new Stage();
      stage.setTitle("QuizzApp");
    }
    
    public static MyStage getInstace(){
        if(instance==null){
            instance=new MyStage();
        }
        return instance;
    }
    
    public void ShowStage(String fxml) throws IOException{
        if(scene==null){
            scene = new Scene( new FXMLLoader(App.class.getResource(fxml)).load());
        }else{
            scene.setRoot(new FXMLLoader(App.class.getResource(fxml)).load());
        }
        stage.setScene(scene);
        stage.show();
    }
    
}
