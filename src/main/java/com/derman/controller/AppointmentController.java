package com.derman.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import com.derman.model.*;

import java.io.IOException;

public class AppointmentController {

    @FXML
    private AnchorPane rootPane;

    @FXML
    private Button saveAppointmentButton;

    @FXML
    private TextField nameInput;

    @FXML
    private DatePicker dateInput;

    @FXML
    private TextField timeInput;

    @FXML
    private Label returnLabel;

    @FXML
    private VBox vbox;

    @FXML
    private ChoiceBox<Treatment> treatmentOptions;

    @FXML
    private CheckBox treatmentCheck;

    @FXML
    private TextArea treatmentInfo;

    @FXML
    private TextField treatmentPrice;

    @FXML
    private Label treatmentPriceLabel;

    @FXML
    void check(ActionEvent event) {
        treatmentInfo.setVisible(treatmentCheck.isSelected());
        treatmentPriceLabel.setVisible(treatmentCheck.isSelected());
        treatmentPrice.setVisible(treatmentCheck.isSelected());
    }

    @FXML
    void Return(MouseEvent event) throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("/view/MainScreen.fxml"));
        rootPane.getChildren().setAll(pane);
    }

    @FXML
    void saveAppointment(ActionEvent event) throws IOException {
        if (treatmentCheck.isSelected()) {
            Appointment appointment = new Appointment(nameInput.getText(), dateInput.getValue(), timeInput.getText(), new TreatmentSpecial(treatmentInfo.getText(), Integer.parseInt(treatmentPrice.getText())));
            System.out.println(appointment.getHasTreatment().getPrice());
        } else {
            Appointment appointment = new Appointment(nameInput.getText(), dateInput.getValue(), timeInput.getText(), new TreatmentNormal());
            System.out.println(appointment.getHasTreatment().getPrice());
        }

//        vbox.getChildren().add(new Label(appointment.getName() + appointment.getDate() + appointment.getTime()));

        AnchorPane pane = FXMLLoader.load(getClass().getResource("/view/MainScreen.fxml"));
        rootPane.getChildren().setAll(pane);
    }

}
