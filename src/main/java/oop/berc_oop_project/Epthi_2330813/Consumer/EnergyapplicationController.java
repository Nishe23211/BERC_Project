package oop.berc_oop_project.Epthi_2330813.Consumer;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import oop.berc_oop_project.HelloApplication;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class EnergyapplicationController {
    @FXML
    private TextField incomeDetailsFX;

    @FXML
    private Label displayTextFX;

    @FXML
    private TextField houseHoldFX;

    @FXML
    private TextField energyUsageHistoryFX;

    private static int applicationID = 1001;
    private final List<EnergyApplication> applicationList = new ArrayList<>();

    @FXML
    public void initialize() {
        displayTextFX.setText("");
    }

    @FXML
    public void onSubmitButtonClick(ActionEvent event) {
        String incomeDetails = incomeDetailsFX.getText().trim();
        String householdSize = houseHoldFX.getText().trim();
        String energyUsage = energyUsageHistoryFX.getText().trim();

        if (incomeDetails.isEmpty() || householdSize.isEmpty() || energyUsage.isEmpty()) {
            showAlert("Validation Error", "Please fill out all fields.");
            return;
        }

        int currentApplicationID = applicationID++;
        EnergyApplication newApplication = new EnergyApplication(currentApplicationID, incomeDetails, householdSize, energyUsage);
        applicationList.add(newApplication);


        displayTextFX.setText("Your subsidy application has been submitted successfully!");
        incomeDetailsFX.clear();
        houseHoldFX.clear();
        energyUsageHistoryFX.clear();

        showAlert("Application Submitted","Your application ID is: " + currentApplicationID);
    }

    private void showAlert(String title, String message) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle(title);
        alert.setContentText(message);
        alert.showAndWait();
    }

    @FXML
    public void OnbackBC(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("consumer.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = (Stage) (((Node) actionEvent.getSource()).getScene().getWindow());
        stage.setScene(scene);
    }
}