import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class SalutacioApp extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Crear el botó
        Button btn = new Button("Clica aquí");

        // Assignar l'acció al botó
        btn.setOnAction(event -> {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setContentText("Hola! Gràcies per clicar el botó.");
            alert.showAndWait();
        });
          
        StackPane root = new StackPane();
        root.getChildren().add(btn);

        Scene scene = new Scene(root, 300, 200);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Aplicació de Salutació");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
