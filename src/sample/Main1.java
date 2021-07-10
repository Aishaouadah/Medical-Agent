package sample;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.awt.*;

public class Main1 extends Application {
    private static Stage stage;
    TableView<RuleBaseCars> table;
    @Override
    public void start(Stage primaryStage) throws Exception{
        try {
            Parent root = FXMLLoader.load(getClass().getResource("fxml/medicalAgent/Main1.fxml"));
            Scene scene = new Scene(root);
            stage = primaryStage;
            primaryStage.setTitle("Medical & Cars Agent ");
            primaryStage.initStyle(StageStyle.DECORATED);
            primaryStage.setResizable(false);
            primaryStage.setScene(scene);
            primaryStage.show();
        }
        catch (HeadlessException e) {
            e.printStackTrace();
        }
    }




  public static void main(String[] args) {
        launch(args);
    }
}
