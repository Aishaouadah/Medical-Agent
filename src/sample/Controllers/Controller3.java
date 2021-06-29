package sample.Controllers;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import sample.RuleBaseCars;

import java.net.URL;
import java.util.LinkedList;
import java.util.ResourceBundle;

import static java.lang.System.exit;

import static java.lang.System.exit;

public class Controller3 {

    @FXML
    Button option1,option2,option3,option4,option5,exit;
    private Stage stage;
    private Parent root;

    /*-------Methods-Main3-----*/

    public void handleButtonKnowledgeBase() throws Exception{
        Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("sample/fxml/part2/KnowledgeBase.fxml"));
        Stage stage  = (Stage) option2.getScene().getWindow();
        stage.setScene(new Scene(root));
    }
    public void handleButtonReservation() throws Exception {
        Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("sample/fxml/part2/Reservation.fxml"));
        Stage stage  = (Stage) option1.getScene().getWindow();
        stage.setScene(new Scene(root));
    }

    public void handleButtonAgentsCommunication() throws Exception{
        Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("sample/fxml/part2/Agent'sCommunication.fxml"));
        Stage stage  = (Stage) option3.getScene().getWindow();
        stage.setScene(new Scene(root));
    }
    public void handleButtonSwitchMedical() throws Exception{
        Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("sample/fxml/medicalAgent/Main1.fxml"));
        Stage stage  = (Stage) option4.getScene().getWindow();
        stage.setScene(new Scene(root));
    }
    public void handleButtonSwitchCars() throws Exception {
        try{
            //root = FXMLLoader.load(getClass().getClassLoader().getResource("sample/fxml/Main2.fxml"));
            FXMLLoader loader = new FXMLLoader(getClass().getClassLoader().getResource("sample/fxml/carAgent/Main2.fxml"));
            Controller2 controller2 = loader.getController();
            root = loader.load();
            stage = (Stage) option5.getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.show();
        }
        catch (Exception e){ e.printStackTrace();}
    }

    /*-------Methods-Main2-----*/

    /* public void handleButtonOption21() throws Exception {
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
         Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("sample/fxml/Main1.fxml"));
         Stage stage  = (Stage) option25.getScene().getWindow();
         stage.setScene(new Scene(root));
     }*/
    public void handleButtonExit() throws Exception{
        exit(1);
    }


}
