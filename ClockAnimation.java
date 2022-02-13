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
import javafx.util.Duration ;
import static javafx.util.Duration.millis;
/**
 *
 * @author Hamza
 */
public class ClockAnimation extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        ClockPane clock = new ClockPane() ;
        
        EventHandler<ActionEvent>
eventHandler = e -> { 
    clock.setCurrentTime() ;
};
    Timeline animation = new Timeline(
    new KeyFrame(Duration.millis(1000),eventHandler) ) ;
    animation.setCycleCount(Timeline.INDEFINITE) ;
    animation.play();
    
    Scene scene = new Scene (clock,300,100) ;
    primaryStage.setTitle("clock animation");
    primaryStage.setScene(scene);
    primaryStage.show();
    
                
                }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}