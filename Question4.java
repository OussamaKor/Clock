package Activity1;

import javafx.application.Application;

import javafx.geometry.Pos;

import javafx.stage.Stage;

import javafx.scene.Scene;

import javafx.scene.control.Label;

import javafx.scene.layout.BorderPane;

public class Question4 extends Application {
@Override 
public void start(Stage primaryStage) {

ClockPane clock = new ClockPane((int)(Math.random()*12),(int)(Math.random()*31),0);
clock.setsecondHandVisible(false);

String timeString = clock.getHour() + ":" + clock.getMinute() ;

Label lblCurrentTime = new Label(timeString);

BorderPane pane = new BorderPane();

pane.setCenter(clock);

pane.setBottom(lblCurrentTime);

BorderPane.setAlignment(lblCurrentTime, Pos.TOP_CENTER);


Scene scene = new Scene(pane, 250, 250);
primaryStage.setTitle("RandomClock"); 
primaryStage.setScene(scene);
primaryStage.show(); }

public static void main(String[] args) {

Application.launch(args);} }
