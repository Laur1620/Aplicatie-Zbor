package org.loose.fis.sre.controllers;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import org.loose.fis.sre.Main;
import org.loose.fis.sre.model.Flight;
import org.loose.fis.sre.services.FlightService;

import java.io.IOException;
import java.util.ArrayList;

public class DeleteFlightController {
    @FXML
    private VBox vBox;

    public void initialize(){
        ArrayList<Flight> flights = FlightService.get_flights();
        for (Flight flight:flights) {
            VBox vb = new VBox();

            Label idLabel = new Label();
            Label plecareLabel = new Label();
            Label sosireLabel = new Label();
            Label dataLabel = new Label();
            Label nrMaxLabel = new Label();
            idLabel.setText("Zborul ID: " + flight.getFlight_id());
            plecareLabel.setText("Pleaca din: " + flight.getLocul_plecare());
            sosireLabel.setText("Sosire: " + flight.getLocul_sosire());
            dataLabel.setText("Data plecarii: " + flight.getData());
            nrMaxLabel.setText("Numarul maxim: " + flight.getNr_maxim());

            Button deleteButton = new Button();
            deleteButton.setText("Delete");
            deleteButton.setOnAction(new EventHandler<ActionEvent>() {
                @Override
                public void handle(ActionEvent actionEvent) {

                }
            });

            vb.getChildren().add(idLabel);
            vb.getChildren().add(plecareLabel);
            vb.getChildren().add(sosireLabel);
            vb.getChildren().add(dataLabel);
            vb.getChildren().add(nrMaxLabel);
            vb.getChildren().add(deleteButton);

            vBox.getChildren().add(vb);
        }
    }

    public void Back() throws IOException {
        Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("main.fxml"));
        Main.primaryStage.setScene(new Scene(root, 400, 300));
    }
}
