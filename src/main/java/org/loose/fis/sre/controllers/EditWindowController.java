package org.loose.fis.sre.controllers;

import com.sun.javafx.stage.StageHelper;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import org.loose.fis.sre.model.Flight;
import org.loose.fis.sre.services.FlightService;

import java.sql.Date;

public class EditWindowController {

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

    private EditFlightController editFlightController;

    private CheckFlightController checkFlightController;

    private Flight flight;

    public void saveEdit(){
        flight.setLocul_plecare(plecare.getText());
        flight.setLocul_sosire(sosire.getText());
        flight.setNr_maxim(Integer.parseInt(numaruMaxim.getText()));
        try {
            flight.setData(Date.valueOf(data.getValue()));
        }
        catch (Exception ex) {

        }

        FlightService.edit_flight(flight);

        Stage stage = (Stage) id.getScene().getWindow();

        stage.close();

        editFlightController.clear();
        editFlightController.initialize();
    }

    public void setFields(Flight f){
        flight = f;
        id.setText(""+f.getFlight_id());
        id.setDisable(true);
        plecare.setText(f.getLocul_plecare());
        sosire.setText(f.getLocul_sosire());
        numaruMaxim.setText(""+f.getNr_maxim());
        data.setPromptText(f.getData().toString());
    }

    public void setController(EditFlightController flightController) {
        this.editFlightController = flightController;
        System.out.println(flightController);
    }
}
