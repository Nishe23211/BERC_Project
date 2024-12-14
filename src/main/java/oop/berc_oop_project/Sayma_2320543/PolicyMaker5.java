package oop.berc_oop_project.Sayma_2320543;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import oop.berc_oop_project.HelloApplication;

import java.io.IOException;

public class PolicyMaker5 {
    @javafx.fxml.FXML
    private Label DisplayText;
    @FXML
    private ComboBox<String> guidesfileComboBox;

    @FXML
    public void initialize() {
        guidesfileComboBox.getItems().addAll("Energy Policy Guide","Environmental Compliance Guide","Regulatory Framework Guide","Renewable Energy Guide");
    }


    @javafx.fxml.FXML
    public void onShowFileButtonClick(ActionEvent actionEvent) {
        String selectedFile = guidesfileComboBox.getValue();

        if (selectedFile != null) {
            DisplayText.setText("Selected File " + selectedFile + ".");
        } else {
            DisplayText.setText("Please select a guide file.");
        }

    }

    @FXML
    public void onBackButtonClick(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("PolicyMakerDashboard.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = (Stage)(((Node) actionEvent.getSource()).getScene().getWindow());
        stage.setScene(scene);
    }
}
