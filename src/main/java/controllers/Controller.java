package controllers;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.layout.StackPane;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    @FXML
    StackPane contentPane;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        System.out.println("Initializing " + getClass().getSimpleName());

        // Here we try to access the file using the two periods
        try {
            // We try to go up one directory. This *should* take us from `controllers` to the default package.
            URL relativeResource = getClass().getResource("../fxml/inner-layout.fxml");
            Parent root = FXMLLoader.load(relativeResource);
            contentPane.getChildren().setAll(root);
            System.out.println(relativeResource.toExternalForm());
        } catch (Exception e0) {
            System.err.println("An error occurred while loading the inner layout.");
            e0.printStackTrace();
        }


        // To prove that the file is there, we can get it with an absolute path.

//        try {
//            URL absoluteResource = getClass().getResource("/fxml/inner-layout.fxml");
//            Parent root = FXMLLoader.load(absoluteResource);
//            contentPane.getChildren().setAll(root);
//        } catch (Exception e1) {
//            System.err.println("Another error occurred while loading the inner layout.");
//            e1.printStackTrace();
//        }

    }
}
