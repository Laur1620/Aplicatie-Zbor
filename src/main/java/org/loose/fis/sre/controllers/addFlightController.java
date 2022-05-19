package org.loose.fis.sre.controllers;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import org.loose.fis.sre.Main;
import org.loose.fis.sre.exceptions.InvalidFlightIdException;
import org.loose.fis.sre.model.Flight;
import org.loose.fis.sre.services.FlightService;

import java.io.IOException;
import java.sql.Date;
import java.util.ArrayList;

public class addFlightController {

    @FXML
    private TextField id;
    @FXML
    private TextField plecare;
    @FXML
    private TextField sosire;
    @FXML
    private TextField numaruMaxim;
    @FXML
    private DatePicker data;
    @FXML
    private Label exceptie;

    public void Back() throws IOException {
        Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("main.fxml"));
        Main.primaryStage.setScene(new Scene(root, 400, 300));
    }
    public void addFlight() {
        try {
            FlightService.add_flight(new Flight(Integer.parseInt(id.getText()),plecare.getText(),sosire.getText(), Date.valueOf(data.getValue()),Integer.parseInt(numaruMaxim.getText())));
            exceptie.setText("");
        }
        catch (InvalidFlightIdException ex){
            System.out.println(ex);
            exceptie.setText("A flight with the same ID already exists");
        }

        ArrayList<Flight> f = FlightService.get_flights();

        for (Flight fl:f) {
            System.out.println(fl.getLocul_plecare() + " " + fl.getLocul_sosire() + " " + fl.getData() + " " + fl.getNr_maxim());
        }
    }
}
