package oop.berc_oop_project.Sayma_2320543;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;

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
        DisplayText.setText("Tariff and Pricing file,Legal Frameworks file,Technical Standards file,Environmental and Renewable Energy Policies file");
    }
}
