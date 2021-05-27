package sample;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.awt.*;

public class Main extends Application {
    Scene scene1,scene2,scene3,scene4,scene5,main;
    private static Stage stage;
    @Override
    public void start(Stage primaryStage) throws Exception{
        try {
/*
            Label label = new Label("Screen1");
            Button button1= new Button("option1");
            Button button2= new Button("option2");
            Button button3= new Button("option3");
            Button button4= new Button("option4");
            Button button5= new Button("option5");
            button1.addActionListener(e -> primaryStage.setScene(scene1));
            button2.addActionListener(e -> primaryStage.setScene(scene2));
            button3.addActionListener(e -> primaryStage.setScene(scene3));
            button4.addActionListener(e -> primaryStage.setScene(scene4));
            button5.addActionListener(e -> primaryStage.setScene(scene5));
*/
            Parent root = FXMLLoader.load(getClass().getResource("fxml/Main.fxml"));
            Scene scene = new Scene(root);
            stage = primaryStage;
            primaryStage.setTitle("Medical Agent ");
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
