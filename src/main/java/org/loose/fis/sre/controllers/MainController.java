package org.loose.fis.sre.controllers;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import org.loose.fis.sre.Main;

import java.io.IOException;

public class MainController {
    public void RegisterClick() throws IOException {
        Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("register.fxml"));
        Main.primaryStage.setScene(new Scene(root, 400, 300));
    }

    @FXML
    private Button registerbtn;
    @FXML
    private Button loginbtn;
    @FXML
    private Button addbtn;
    @FXML
    private Button deletebtn;
    @FXML
    private Button editbtn;

    public void initialize(){
        if(Main.loggedIn){
            registerbtn.setVisible(false);
            loginbtn.setVisible(false);
            addbtn.setVisible(true);
            deletebtn.setVisible(true);
            editbtn.setVisible(true);

        }
    }

    public void LogInClick() throws IOException {
        Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("login.fxml"));
        Main.primaryStage.setScene(new Scene(root, 400, 300));
    }

    public void addFlightClick() throws IOException {
        Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("addFlight.fxml"));
        Main.primaryStage.setScene(new Scene(root, 400, 300));
    }
}
