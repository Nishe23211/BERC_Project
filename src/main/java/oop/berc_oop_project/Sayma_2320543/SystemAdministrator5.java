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

public class SystemAdministrator5 {


    @FXML
    private ComboBox<String> documentsComboBox;
    @FXML
    private Label DisplayText;

    @FXML
    public void initialize() {
        documentsComboBox.getItems().addAll("Tariff and Pricing Documents","Legal Frameworks","Technical Standards","Environmental and Renewable Energy Policies");
    }

    @FXML
    public void onUploadButtonClick(ActionEvent actionEvent) {
        String selectedDocument = documentsComboBox.getValue();

        if (selectedDocument != null) {
            DisplayText.setText("Uploading " + selectedDocument + ".");
        } else {
            DisplayText.setText("Please select a document type to upload.");
        }
    }

    @FXML
    public void onBackButtonClick(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("SystemAdministratorDashboard.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = (Stage)(((Node) actionEvent.getSource()).getScene().getWindow());
        stage.setScene(scene);
    }
}
