package com.derman.controller.appointmentCrud;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import com.derman.model.Appointment;
import com.derman.model.TreatmentNormal;
import com.derman.model.TreatmentSpecial;

import java.io.IOException;

public class AppointmentUpdateController {

    @FXML
    private AnchorPane rootPane;

    @FXML
    private Label Return;

    @FXML
    private Button updateButton;

    @FXML
    private TextField nameInput;

    @FXML
    private DatePicker dateInput;

    @FXML
    private TextField timeInput;

    @FXML
    private CheckBox treatmentCheck;

    @FXML
    private TextArea treatmentInfo;

    @FXML
    private Label treatmentPriceLabel;

    @FXML
    private TextField treatmentPrice;

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
            appointmentTreatment.setText("normal treatment " + app.getHasTreatment().getInfo() + ", price: " + app.getHasTreatment().getPrice());
        }
    }

    @FXML
    void Return(MouseEvent event) throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("/view/MainScreen.fxml"));
        rootPane.getChildren().setAll(pane);
    }

    @FXML
    void check(ActionEvent event) {
        treatmentInfo.setVisible(treatmentCheck.isSelected());
        treatmentPriceLabel.setVisible(treatmentCheck.isSelected());
        treatmentPrice.setVisible(treatmentCheck.isSelected());
    }

    @FXML
    void update(ActionEvent event) throws IOException {
        if (Appointment.appointments.size() > 0) {
            Appointment app = Appointment.appointments.get(Appointment.appointments.size()-1);

            if (treatmentCheck.isSelected()) {
                app.updateAppointment(nameInput.getText(), dateInput.getValue(), timeInput.getText(), new TreatmentSpecial(treatmentInfo.getText(), Integer.parseInt(treatmentPrice.getText())));
            } else {
                app.updateAppointment(nameInput.getText(), dateInput.getValue(), timeInput.getText(), new TreatmentNormal());
            }
         }

        AnchorPane pane = FXMLLoader.load(getClass().getResource("/view/appointmentCrud/AppointmentUpdateScreen.fxml"));
        rootPane.getChildren().setAll(pane);
    }

}








