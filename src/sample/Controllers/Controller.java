package sample.Controllers;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import static java.lang.System.exit;


public class Controller {
    @FXML
    Button option1,option2,option3,option4,option5,exit,option21,option22,option23,option24,option25;


    /*-------Methods-Main1-----*/

    public void handleButtonOption1() throws Exception {
        Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("sample/fxml/option1.fxml"));
        Stage stage  = (Stage) option1.getScene().getWindow();
        stage.setScene(new Scene(root));
    }
    public void handleButtonOption2() throws Exception{
        Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("sample/fxml/option2.fxml"));
        Stage stage  = (Stage) option2.getScene().getWindow();
        stage.setScene(new Scene(root));
    }
    public void handleButtonOption3() throws Exception{
        Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("sample/fxml/option3.fxml"));
        Stage stage  = (Stage) option3.getScene().getWindow();
        stage.setScene(new Scene(root));
    }

    public void handleButtonOption4() throws Exception{
        Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("sample/fxml/option4.fxml"));
        Stage stage  = (Stage) option4.getScene().getWindow();
        stage.setScene(new Scene(root));
    }
    public void handleButtonOption5() throws Exception{
        Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("sample/fxml/Main2.fxml"));
        Stage stage  = (Stage) option5.getScene().getWindow();
        stage.setScene(new Scene(root));
    }
    /*-------Methods-Main2-----*/

    public void handleButtonOption21() throws Exception {
        Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("sample/fxml/option21.fxml"));
        Stage stage  = (Stage) option21.getScene().getWindow();
        stage.setScene(new Scene(root));
    }

    public void handleButtonOption22() throws Exception{
        Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("sample/fxml/option22.fxml"));
        Stage stage  = (Stage) option22.getScene().getWindow();
        stage.setScene(new Scene(root));
    }
    public void handleButtonOption23() throws Exception{
        Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("sample/fxml/option23.fxml"));
      //  Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("sample/fxml/option23.fxml"));
        Stage stage  = (Stage) option23.getScene().getWindow();
        stage.setScene(new Scene(root));
    }
    public void handleButtonOption24() throws Exception{
        Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("sample/fxml/option24.fxml"));
        Stage stage  = (Stage) option24.getScene().getWindow();
        stage.setScene(new Scene(root));
    }
    public void handleButtonOption25() throws Exception{
        Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("sample/fxml/Main2.fxml"));
        Stage stage  = (Stage) option25.getScene().getWindow();
        stage.setScene(new Scene(root));
    }
    public void handleButtonExit() throws Exception{
       exit(-1);
    }



}
