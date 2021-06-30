package com.derman.controller.appointmentCrud;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import com.derman.model.Appointment;

import java.io.IOException;

public class AppointmentDeleteController {

    @FXML
    private AnchorPane rootPane;

    @FXML
    private Button deleteButton;

    @FXML
    private Label appointmentName;

    @FXML
    private Label appointmentDate;

    @FXML
    private Label appointmentTime;

    @FXML
    private Label appointmentTreatment;

    @FXML
    private Label Return;

    @FXML
    void Return(MouseEvent event) throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("/view/MainScreen.fxml"));
        rootPane.getChildren().setAll(pane);
    }

    @FXML
    public void initialize() {
        if (Appointment.appointments.size() > 0) {
            Appointment app = Appointment.appointments.get(Appointment.appointments.size()-1);

            appointmentName.setText(app.getName());
            appointmentDate.setText(app.getDate().toString());
            appointmentTime.setText(app.getTime());
            appointmentTreatment.setText("normal treatment " + app.getHasTreatment().getInfo() + ", price: " + app.getHasTreatment().getPrice());
        }
    }

    @FXML
    void delete(ActionEvent event) throws IOException {
        Appointment.appointments.get(0).deleteAppointment();
        System.out.println(Appointment.appointments.size());

        AnchorPane pane = FXMLLoader.load(getClass().getResource("/view/MainScreen.fxml"));
        rootPane.getChildren().setAll(pane);
    }

}
