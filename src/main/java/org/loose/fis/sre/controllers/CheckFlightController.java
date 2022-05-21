package org.loose.fis.sre.controllers;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import org.loose.fis.sre.Main;
import org.loose.fis.sre.model.Flight;
import org.loose.fis.sre.services.FlightService;

import java.io.IOException;
import java.util.ArrayList;

public class CheckFlightController {

    public void Back() throws IOException {
        Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("main.fxml"));
        Main.primaryStage.setScene(new Scene(root, 400, 300));
    }

    public void initialize(){

    }
}
