package oop.berc_oop_project.Sayma_2320543;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import oop.berc_oop_project.HelloApplication;

import java.io.IOException;

public class PolicyMaker4
{
    @javafx.fxml.FXML
    private TextField usernameField;
    @javafx.fxml.FXML
    private ComboBox<String> typeComboBox;
    @javafx.fxml.FXML
    private TextField passwordField;

    @javafx.fxml.FXML
    public void initialize() {
        typeComboBox.getItems().addAll("English","Bangla");
    }

    @javafx.fxml.FXML
    public void onBackButtonClick(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("PolicyMakerDashboard.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = (Stage)(((Node) actionEvent.getSource()).getScene().getWindow());
        stage.setScene(scene);

    }
}