package sample.Controllers;
import com.sun.webkit.ContextMenu;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.css.Rule;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import sample.RuleBaseCars;

import java.awt.*;
import java.net.URL;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ResourceBundle;
public class Controller2 {
    private Stage stage;
    private Parent root;
    public RuleBaseCars Rule;
    @FXML
    Button option21,option22,option23,option24,option25;
    @FXML private TableView<RuleBaseCars> CareRuleBase;
    @FXML private TableColumn rule ;
    @FXML private TableColumn condition1;
    @FXML private TableColumn condition2;
    @FXML private TableColumn condition3;
    @FXML  private TableColumn condition4;
    @FXML Label output;
    @FXML  private ChoiceBox vehiculeType;
    @FXML  private ChoiceBox numWheels;
    @FXML  private ChoiceBox motor;
    @FXML  private ChoiceBox size;
    @FXML  private ChoiceBox numDoors;

    String vehiculeTypeValue ,numWheelsValue ,numDoorsvalue  , motorValue, sizeValue ;


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
         stage  = (Stage) option25.getScene().getWindow();
         stage.setScene(new Scene(root));
         stage.show();
    }
    public void handleButtonSwitchTravel() throws Exception{    try{
        FXMLLoader loader = new FXMLLoader(getClass().getClassLoader().getResource("sample/fxml/part2/Main3.fxml"));
        root = loader.load();
        stage = (Stage) option25.getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.show();
    } catch (Exception e){ e.printStackTrace();} }
    //Get All Rules
    /**
     * condition 1 : vehiculeTypeValue
     * condition 2 : num_wheels
     * condition 3 : motor
     * condition 4 : size
     * condition 5 : num_doors
     */
    ObservableList<RuleBaseCars> ruleBaseCars = FXCollections.observableArrayList(
         new RuleBaseCars("Bicycle","cycle","2","no","",""),
         new RuleBaseCars("Tricycle","cycle","3","no","",""),
         new  RuleBaseCars("Motocycle","cycle","2","yes","",""),
         new RuleBaseCars("SportCar","automobile","","","small","2"),
         new RuleBaseCars("Sedan","automobile","","","medium","4"),
         new RuleBaseCars("MiniVan","automobile","","","3","medium"));
  /*  @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        System.out.println("aicha hi ");
        //Name Column

        Rule = new TableColumn();
        condition1 = new TableColumn();
        condition2 = new TableColumn();
        condition3 = new TableColumn();
        condition4 = new TableColumn();
        CareRuleBase = new TableView<>();
        Rule.setCellValueFactory(new PropertyValueFactory<RuleBaseCars,String> ("RuleRule"));
        condition4.setCellValueFactory(new PropertyValueFactory<RuleBaseCars,String> ("x"));
        condition3.setCellValueFactory(new PropertyValueFactory<RuleBaseCars,String> ("Y"));
        condition2.setCellValueFactory(new PropertyValueFactory<RuleBaseCars,String> ("Z"));
        condition1.setCellValueFactory(new PropertyValueFactory<RuleBaseCars,String> ("W"));
        CareRuleBase.setItems(ruleBaseCars);

        System.out.println(" " + ruleBaseCars.get(2).getRuleName());
        System.out.println("hello ");
        /*
        TableColumn<RuleBaseCars, String> Rule = new TableColumn<>("Rule");
        Rule.setCellValueFactory(new PropertyValueFactory<>("Rule"));
        TableColumn<RuleBaseCars, String> condition1 = new TableColumn<>("condition1");
        condition1.setCellValueFactory(new PropertyValueFactory<>("condition1"));
        TableColumn<RuleBaseCars, String> condition2 = new TableColumn<>("condition2");
        condition2.setCellValueFactory(new PropertyValueFactory<>("condition2"));
        TableColumn<RuleBaseCars, String> condition3 = new TableColumn<>("condition3");
        condition3.setCellValueFactory(new PropertyValueFactory<>("condition3"));
        TableColumn<RuleBaseCars, String> condition4 = new TableColumn<>("condition4");
        condition4.setCellValueFactory(new PropertyValueFactory<>("condition4"));
        TableView<RuleBaseCars> CareRuleBase= new TableView<>(ruleBaseCars);
        CareRuleBase.getColumns().addAll(Rule, condition1, condition2, condition3, condition4);
       */

    /*****************************************Handling ChoiceBoxes ************************************************/

    public void initialize() {
      //////choicebox 1 vehiculeType
      try {
          ArrayList<String> list = new ArrayList<>();
          list.add("automobile");
          list.add("cycle");
          list.add(" ");
          ObservableList obList = FXCollections.observableList(list);
          vehiculeType.setItems(obList);
      } catch (Exception e) {
          // TODO Auto-generated catch block
          System.out.println(e.toString());
      }

      //////choicebox 2 numWheels

      try {
          ArrayList<String> list = new ArrayList<>();
          list.add("3");
          list.add("2");
          list.add(" ");
          ObservableList obList = FXCollections.observableList(list);
          numWheels.setItems(obList);
      } catch (Exception e) {
          // TODO Auto-generated catch block
          System.out.println(e.toString());
      }

      //////choicebox 3 motor;

      try {
          ArrayList<String> list = new ArrayList<>();
          list.add("yes");
          list.add("no");
          list.add(" ");
          ObservableList obList = FXCollections.observableList(list);
          motor.setItems(obList);
      } catch (Exception e) {
          // TODO Auto-generated catch block
          System.out.println(e.toString());
      }

      //////choicebox 4  size;
      try {

          ArrayList<String> list = new ArrayList<>();
          list.add("small");
          list.add("medium");
          list.add("large");
          list.add(" ");
          ObservableList obList = FXCollections.observableList(list);
          size.setItems(obList);

      } catch (Exception e) {
          // TODO Auto-generated catch block
          System.out.println(e.toString());
      }

      //////choicebox 4  numDoors;
      try {

          ArrayList<String> list = new ArrayList<>();
          list.add("2");
          list.add("3");
          list.add("4");
          list.add(" ");
          ObservableList obList = FXCollections.observableList(list);
          numDoors.setItems(obList);

      } catch (Exception e) {
          // TODO Auto-generated catch block
          System.out.println(e.toString());
      }


  }
    public void validation(){
        numDoorsvalue = (String) numDoors.getValue();
        sizeValue = (String) size.getValue();
        motorValue = (String) motor.getValue();
        numWheelsValue = (String) numWheels.getValue();
        vehiculeTypeValue = (String) vehiculeType.getValue();

        if(numDoorsvalue == null) numDoorsvalue=" ";
        if(sizeValue == null) sizeValue=" ";
        if(motorValue == null) motorValue=" ";
        if(numWheelsValue == null) numWheelsValue=" ";
        if(vehiculeTypeValue == null) vehiculeTypeValue=" ";

        System.out.println( vehiculeTypeValue+" "+numWheelsValue+" " + motorValue+ " " + sizeValue+" " + numDoorsvalue+ " ");
        Rule = new RuleBaseCars("hi",vehiculeTypeValue,numWheelsValue,motor.toString(),size.toString(),numDoorsvalue);
        System.out.println( Rule.getNum_doors());
        String output = CheckRule();
        System.out.println("output = "+output);
    }
    public String CheckRule( ){
        String Vehicule =" NONE " ;

        if((Rule.getVehiculeType().equals("cycle")) && (Rule.getNum_wheels().equals("2")) && (motorValue.equals("no")) && (sizeValue.equals(" ")) &&  (numDoorsvalue.equals(" ")) ) Vehicule="Bicycle";
        if((Rule.getVehiculeType().equals("cycle")) && (Rule.getNum_wheels().equals("2")) && (motorValue.equals("yes")) && (sizeValue.equals(" ")) &&  (numDoorsvalue.equals(" "))) Vehicule="Motocycle";
        if(Rule.getVehiculeType().equals("cycle")&&  ((Rule.getNum_wheels().equals("3"))) && (motorValue.equals("no")) && (sizeValue.equals(" ")) &&  (numDoorsvalue.equals(" "))) Vehicule ="Tricycle";
        if(vehiculeTypeValue.equals("automobile") && (sizeValue.equals("medium")) && (numDoorsvalue.equals("4"))  && ((Rule.getNum_wheels().equals(" "))) && (motorValue.equals(" "))) Vehicule ="Sedan";
        if(vehiculeTypeValue.equals("automobile") && (sizeValue.equals("medium")) && (numDoorsvalue.equals("3"))   && ((Rule.getNum_wheels().equals(" "))) && (motorValue.equals(" "))) Vehicule ="MiniVan";
        if(vehiculeTypeValue.equals("automobile") && (sizeValue.equals("small")) && (numDoorsvalue.equals("2"))   && ((Rule.getNum_wheels().equals(" "))) && (motorValue.equals(" "))) Vehicule ="Sport Car";
        if(vehiculeTypeValue.equals("automobile") && (sizeValue.equals("large")) && (numDoorsvalue.equals("4"))  && ((Rule.getNum_wheels().equals(" "))) && (motorValue.equals(" "))) Vehicule ="Sport Utility Vehicule ";
//        if(Rule.getNum_wheels().equals("3") || Rule.getNum_wheels().equals("2")) { Rule.setVehiculeType( "cycle");}
  //      if (Rule.getNum_wheels().equals("4")) { Rule.setVehiculeType(  "automobile"); }
           System.out.println(" " + vehiculeTypeValue + " " + sizeValue + " " + numDoorsvalue);

System.out.println(" " +
      vehiculeTypeValue.equals("automobile")+ (sizeValue.equals("medium"))  + (numDoorsvalue.equals("4"))   + ((Rule.getNum_wheels().equals(" "))) + (motorValue.equals(" "))) ;
        output.setText(Vehicule);
        return Vehicule;

    }







}


