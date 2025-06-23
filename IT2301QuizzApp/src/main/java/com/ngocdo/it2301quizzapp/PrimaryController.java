package com.ngocdo.it2301quizzapp;

import com.ngocdo.utils.MyAlert;
import com.ngocdo.utils.MyStage;
import java.io.IOException;
import javafx.event.ActionEvent;


public class PrimaryController {
    public void handleQuestionManagement(ActionEvent event) throws IOException{
      MyStage.getInstace().ShowStage("questions.fxml");
    }
    
    public void handlePractice(ActionEvent event){
      MyAlert.getInstace().ShowMsg("Nan na nan na na na!");
    }

   
   
}
