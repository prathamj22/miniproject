package com.example.dhruuv;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class Login {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }


}
