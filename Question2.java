package Activity1;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class Question2 extends Application {  
    @Override
    public void start(Stage primaryStage) {
        ClockPane clock1 = new ClockPane(4,20,45) ;
        ClockPane clock2 = new ClockPane(22,46,15) ;
        
        clock1.setHeight(200) ;
        clock1.setWidth(200) ;
        clock2.setHeight(200) ;
        clock2.setWidth(200) ;
        
        HBox pane = new HBox(10) ;
        pane.setAlignment(Pos.CENTER) ;
        pane.getChildren().addAll(clock1,clock2) ;
        Scene scene = new Scene(pane,250,250) ;
        primaryStage.setTitle("HandleEvent");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }   
}
