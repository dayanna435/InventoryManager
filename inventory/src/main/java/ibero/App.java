package ibero;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.Parent;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import java.io.IOException;

import ibero.controllers.FXMLController;

public class App extends Application {
    @Override
    public void start(Stage stage) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/ibero/views/MainView.fxml"));
            Parent root = loader.load();

            FXMLController controller = loader.getController();

            stage.setTitle("Inventory Manager");
            String iconPath = "/ibero/icons/icon.png";
            if (getClass().getResource(iconPath) != null) {
                stage.getIcons().add(new Image(getClass().getResourceAsStream(iconPath)));
            }

            stage.setScene(new Scene(root));
            stage.show();
        } catch (IOException e) {
            System.err.println("Error to load: " + e.getMessage());
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}