package org.loose.fis.sre.controllers;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import org.loose.fis.sre.Main;
import org.loose.fis.sre.services.UserService;

import java.io.IOException;

public class LogInController {

    @FXML
    private TextField usernameField;
    @FXML
    private PasswordField passwordField;
    public void Back() throws IOException {
        Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("main.fxml"));
        Main.primaryStage.setScene(new Scene(root, 400, 300));
    }

    public void LogInClick(){
        UserService.checkUser(usernameField.getText(), passwordField.getText());
    }
}
