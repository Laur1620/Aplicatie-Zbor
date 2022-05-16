package org.loose.fis.sre.controllers;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import org.loose.fis.sre.Main;

import java.io.IOException;

public class MainController {
    public void RegisterClick() throws IOException {
        Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("register.fxml"));
        Main.primaryStage.setScene(new Scene(root, 400, 300));
    }

    public void LogInClick() throws IOException {
        Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("login.fxml"));
        Main.primaryStage.setScene(new Scene(root, 400, 300));
    }
}
