package sample.Controllers;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;


public class Controller {
    @FXML
    Button option1,option2,option3,option4,exit;

    /*-------Methods------*/

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
    public void handleButtonExit() throws Exception{
        Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("sample/fxml/exit.fxml"));
        Stage stage  = (Stage) exit.getScene().getWindow();
        stage.setScene(new Scene(root));
    }

}
