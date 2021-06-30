package com.derman.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import com.derman.model.*;

import java.io.IOException;

public class MainController {

    @FXML
    private AnchorPane rootPane;

    @FXML
    private Label usernameLabel;

    @FXML
    private Label appointmentButton;

    @FXML
    private Button logoutButton;

    @FXML
    private Label totalAppointments;

    @FXML
    private ChoiceBox<Treatment> treatmentOptions;

    @FXML
    private Label deleteButton;

    @FXML
    private Label showButton;

    @FXML
    private Label updateButton;

    @FXML
    private Label Return;

    @FXML
    void logout(ActionEvent event) throws IOException {
        Login.getInstance().setUser(null);

        AnchorPane pane = FXMLLoader.load(getClass().getResource("/view/LoginScreen.fxml"));
        rootPane.getChildren().setAll(pane);
    }

    @FXML
    public void initialize() {
        usernameLabel.setText(Login.getInstance().getUser().getFirstname());
        totalAppointments.setText("" + Appointment.appointments.size());
    }

    @FXML
    void goToDeleteAppointment(MouseEvent event) throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("/view/appointmentCrud/AppointmentDeleteScreen.fxml"));
        rootPane.getChildren().setAll(pane);
    }

    @FXML
    void goToShowAppointment(MouseEvent event) throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("/view/appointmentCrud/AppointmentReadScreen.fxml"));
        rootPane.getChildren().setAll(pane);
    }

    @FXML
    void goToUpdateAppointment(MouseEvent event) throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("/view/appointmentCrud/AppointmentUpdateScreen.fxml"));
        rootPane.getChildren().setAll(pane);
    }

    @FXML
    void goToAppointment(MouseEvent event) throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("/view/AppointmentScreen.fxml"));
        rootPane.getChildren().setAll(pane);
    }

}
