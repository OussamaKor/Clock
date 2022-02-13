package Activity1;

import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.animation.KeyFrame ;
import javafx.animation.Timeline ;
import static javafx.application.Application.launch;
import javafx.geometry.Pos;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.*;
import javafx.util.Duration ;
import static javafx.util.Duration.millis;

public class Question6 extends Application {
    @Override
    public void start(Stage primaryStage) {
        ClockPane clock = new ClockPane() ;
        HBox pane1 = new HBox(10) ;
        pane1.setAlignment(Pos.CENTER) ;
        Button stop = new Button("STOP") ;
        Button start = new Button("START") ;
        pane1.getChildren().addAll(stop,start) ;
        BorderPane pane = new BorderPane();

        pane.setCenter(clock);
        pane.setBottom(pane1);
        start.setOnAction(eh->{
            clock.Play();
        });
        stop.setOnAction(eh->{
            clock.Stop();
        });
    Scene scene = new Scene (pane,300,200) ;
    primaryStage.setTitle("clock animation");
    primaryStage.setScene(scene);
    primaryStage.show();        }

    public static void main(String[] args) {
        launch(args);
    }  }
