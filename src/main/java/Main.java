
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.net.URL;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {

        URL resource = getClass().getResource("fxml/layout.fxml");
        Parent root = FXMLLoader.load(resource);
        Scene theScene = new Scene(root);
        primaryStage.setScene(theScene);
        primaryStage.show();
    }
}
