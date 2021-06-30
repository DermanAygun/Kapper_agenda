package com.derman.controller.appointmentCrud;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import com.derman.model.Appointment;

import java.io.IOException;

public class AppointmentReadController {

    @FXML
    private AnchorPane rootPane;

    @FXML
    private Label Return;

    @FXML
    private Label appointmentName;

    @FXML
    private Label appointmentDate;

    @FXML
    private Label appointmentTime;

    @FXML
    private Label appointmentTreatment;

    @FXML
    public void initialize() {
        if (Appointment.appointments.size() > 0) {
            Appointment app = Appointment.appointments.get(Appointment.appointments.size()-1);

            appointmentName.setText(app.getName());
            appointmentDate.setText(app.getDate().toString());
            appointmentTime.setText(app.getTime());
            appointmentTreatment.setText("treatment: " + app.getHasTreatment().getInfo() + ", price: " + app.getHasTreatment().getPrice());
        }
    }

    @FXML
    void Return(MouseEvent event) throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("/view/MainScreen.fxml"));
        rootPane.getChildren().setAll(pane);
    }

}



