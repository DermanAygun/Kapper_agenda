package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import model.Login;
import model.User;

import java.io.IOException;

public class LoginController {

    @FXML
    private AnchorPane rootPane;

    @FXML
    private Button loginButton;

    @FXML
    private PasswordField passwordInput;

    @FXML
    private TextField usernameInput;    @FXML
    private Label errorLabel;

    // checks if only 1 user is active.
    @FXML
    public void initialize(){
        System.out.println(Login.getInstance().getUser());
    }

    @FXML
    void login(ActionEvent event) throws IOException {

        for (User m : Login.getInstance().getUsers()) {
            if (m.getUsername().equals(usernameInput.getText()) && m.getPassword().equals(passwordInput.getText())) {

                Login.getInstance().setUser(m);
                System.out.println(Login.getInstance().getUser());

                AnchorPane pane = FXMLLoader.load(getClass().getResource("/view/MainScreen.fxml"));
                rootPane.getChildren().setAll(pane);
            } else {
                errorLabel.setVisible(true);
            }
        }
    }

}
