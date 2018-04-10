package controllers;

import javafx.fxml.Initializable;

import java.net.URL;
import java.util.ResourceBundle;

public class InnerController implements Initializable{

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        System.out.println("Initializing " + getClass().getSimpleName());

    }
}
