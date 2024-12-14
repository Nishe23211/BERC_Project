package oop.berc_oop_project.Sayma_2320543;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import oop.berc_oop_project.HelloApplication;

import java.io.IOException;

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

    @FXML
    public void onBackButtonClick(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("PolicyMakerDashboard.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = (Stage)(((Node) actionEvent.getSource()).getScene().getWindow());
        stage.setScene(scene);
    }
}
