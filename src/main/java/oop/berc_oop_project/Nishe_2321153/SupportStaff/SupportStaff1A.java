package oop.berc_oop_project.Nishe_2321153.SupportStaff;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;
import oop.berc_oop_project.HelloApplication;

import java.io.IOException;

public class SupportStaff1A {
    @FXML
    private Label logdetails;
    @FXML
    private TextArea textarea;
    @FXML
    private TextArea logtextarea;
    @FXML
    private Label incidentresolution;
    @FXML
    private Label logsText;

    @FXML
    public void onAnalyze(ActionEvent actionEvent) {
        String incidentText = textarea.getText();
        if (incidentText == null || incidentText.isEmpty()) {
            logsText.setText("No incident details provided to analyze.");
            return;
        }
        String response = analyzeIncident(incidentText);
        logsText.setText(response);
    }

    private String analyzeIncident(String incidentText) {
        String incidentDetails = "";
        return "Incident analyzed: " + incidentDetails +
                "\nSuggested resolution: Verify system logs and escalate if needed.";
    }

    @FXML
    public void onUpdateLog(ActionEvent actionEvent) {
        String logDetails = logtextarea.getText();
        if (logDetails == null || logDetails.isEmpty()) {
            logsText.setText("No analysis details to log.");
            return;
        }
        logIncident(logDetails);
        logsText.setText("Log updated successfully!");
    }

    private void logIncident(String logDetails) {
        System.out.println("Log entry: " + logDetails);
    }

    @FXML
    public void onBack(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("SupportStaff1.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = (Stage) (((Node) actionEvent.getSource()).getScene().getWindow());
        stage.setScene(scene);
    }
}
