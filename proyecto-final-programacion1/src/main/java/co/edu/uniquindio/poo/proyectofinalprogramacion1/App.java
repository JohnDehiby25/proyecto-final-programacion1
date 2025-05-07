package co.edu.uniquindio.poo.proyectofinalprogramacion1;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class App extends Application {
    @Override
    public void start(Stage primaryStage) {
        Label label = new Label("Hola JavaFX");
        Scene scene = new Scene(label, 400, 300);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Mi App JavaFX");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
