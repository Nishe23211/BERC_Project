package oop.berc_oop_project;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class LogInPage {
    @javafx.fxml.FXML
    private TextField usernameField;
    @javafx.fxml.FXML
    private Label settext;
    @javafx.fxml.FXML
    private PasswordField passwordFiled;
    @javafx.fxml.FXML
    private ComboBox<String> typeCB;

    @javafx.fxml.FXML
    public void onLogInButtonClick(ActionEvent actionEvent) {

    }
}
