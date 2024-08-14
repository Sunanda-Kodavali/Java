package org.example.javafxbasicdemo;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    private Label welcomeText;
    @FXML
    private Label welcomeTextHBox;

    @FXML
    public void initialize() {
        System.out.println("Welcome");
    }

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    @FXML
    protected void onCheck() {
        welcomeText.setText("Hey Button!");
    }

    @FXML
    protected void onHelloHBoxButtonClick() {
        welcomeTextHBox.setText("Hey HBox Button!");
    }
}