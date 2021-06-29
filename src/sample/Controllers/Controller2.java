package sample.Controllers;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import sample.RuleBaseCars;

import java.net.URL;
import java.util.ResourceBundle;

import static java.lang.System.exit;

public class Controller2  {
    private Stage stage;
    private Scene scene;
    private Parent root;
    @FXML
    Button option21,option22,option23,option24,option25;
    @FXML
    private TableView<RuleBaseCars> CareRuleBase;
    @FXML
    private TableColumn<RuleBaseCars, String> Rule;
    @FXML
    private TableColumn<RuleBaseCars, String> Condition1;
    @FXML
    private TableColumn<RuleBaseCars, String> Condition2;
    @FXML
    private TableColumn<RuleBaseCars, String>Condition3;
    @FXML
    private TableColumn<RuleBaseCars, String> Condition4;

    ObservableList<RuleBaseCars> list = FXCollections.observableArrayList(
            new RuleBaseCars("Bicycle","Bicycle","cycle","2","no"),
            new RuleBaseCars("Tricycle","Tricycle","cycle","3","no"),
            new  RuleBaseCars("Motocycle","Motocycle","cycle","2","yes"),
            new RuleBaseCars("SportCar","SportCar","automobile","2","small"),
            new RuleBaseCars("Sedan","Sedan","automobile","4","medium"),
            new RuleBaseCars("MiniVan","MiniVan","automobile","3","medium")
    );

/*
    @Override
    public void initialize(URL url, ResourceBundle rb) {

        Rule.setCellValueFactory(new PropertyValueFactory<RuleBaseCars, String>("Rule"));
        //  CarConditions.setCellValueFactory(new PropertyValueFactory<RuleBaseCars,String>("CarConditions"));
        Condition1.setCellValueFactory(new PropertyValueFactory<RuleBaseCars, String>("Condition1"));
        Condition2.setCellValueFactory(new PropertyValueFactory<RuleBaseCars, String>("Condition2"));
        Condition3.setCellValueFactory(new PropertyValueFactory<RuleBaseCars, String>("Condition3"));
        Condition4.setCellValueFactory(new PropertyValueFactory<RuleBaseCars, String>("Condition4"));

        CareRuleBase.setItems(list);

    }
*/
    /*-------Methods-Main2-----*/

    public void handleButtonOption21()  {
        try{
        FXMLLoader loader = new FXMLLoader(getClass().getClassLoader().getResource("sample/fxml/carAgent/option21.fxml"));
        root = loader.load();
        Stage stage  = (Stage) option21.getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.show();
    }
        catch (Exception e){ e.printStackTrace();}
    }
    public void handleButtonOption22() throws Exception{
        Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("sample/fxml/carAgent/option22.fxml"));
        Stage stage  = (Stage) option22.getScene().getWindow();
        stage.setScene(new Scene(root));
    }
    public void handleButtonOption23() throws Exception{
        Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("sample/fxml/carAgent/option23.fxml"));
        //  Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("sample/fxml/option23.fxml"));
        Stage stage  = (Stage) option23.getScene().getWindow();
        stage.setScene(new Scene(root));
    }
    public void handleButtonOption24() throws Exception{
        Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("sample/fxml/carAgent/option24.fxml"));
        Stage stage  = (Stage) option24.getScene().getWindow();
        stage.setScene(new Scene(root));
    }
    public void handleButtonOption25() throws Exception{
        FXMLLoader loader = new FXMLLoader(getClass().getClassLoader().getResource("sample/fxml/medicalAgent/Main1.fxml"));
        root = loader.load();
        Controller1 controller1 = loader.getController();
         stage  = (Stage) option25.getScene().getWindow();
         stage.setScene(new Scene(root));
         stage.show();
    }
    public void handleButtonSwitchTravel() throws Exception{    try{
        FXMLLoader loader = new FXMLLoader(getClass().getClassLoader().getResource("sample/fxml/part2/Main3.fxml"));
        Controller2 controller2 = loader.getController();
        root = loader.load();
        stage = (Stage) option25.getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.show();
    }
    catch (Exception e){ e.printStackTrace();}
    }

}
