package oop.berc_oop_project.Sayma_2320543;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;

public class SystemAdministrator3 {
    @javafx.fxml.FXML
    private Label DisplayText;
    @javafx.fxml.FXML
    private ComboBox<String> performancemetricsComboBox;
    @javafx.fxml.FXML
    private ComboBox<String> userperformanceComboBox;

    @FXML
    public void initialize(){
        userperformanceComboBox.getItems().addAll("Expert Representative","Policy Maker");
        performancemetricsComboBox.getItems().addAll("Technical data","Regulatory data");
    }


    @javafx.fxml.FXML
    public void onReportButtonClick(ActionEvent actionEvent) {
        DisplayText.setText("Energy production,efficiency,product feasibality details");


    }


}
