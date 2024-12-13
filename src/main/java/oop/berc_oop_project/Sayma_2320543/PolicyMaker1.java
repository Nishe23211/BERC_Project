package oop.berc_oop_project.Sayma_2320543;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class PolicyMaker1 {


    @javafx.fxml.FXML
    private Label SetText;
    @javafx.fxml.FXML
    private TextField passwordField;
    @javafx.fxml.FXML
    private ComboBox<String> typeofcredentialComboBox;
    @javafx.fxml.FXML
    private TextField governmentidField;

    @FXML
    public void initialize() {
        typeofcredentialComboBox.getItems().addAll("Credential1","Credential2","Credential3");
    }

    @javafx.fxml.FXML
    public void onLogInButtonClick(ActionEvent actionEvent) {
        SetText.setText("show and use services");
    }
}
