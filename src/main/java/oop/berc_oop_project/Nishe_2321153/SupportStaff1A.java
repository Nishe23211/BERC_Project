package oop.berc_oop_project.Nishe_2321153;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;

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
    public void onAnalyze(ActionEvent actionEvent) {
        String incidentText = textarea.getText();
        if (incidentText == null || incidentText.isEmpty()) {
            logtextarea.setText("No incident details provided to analyze.");
            return;
        }
        String response = analyzeIncident(incidentText);
        logtextarea.setText(response);
    }

    private String analyzeIncident(String incidentText) {
        String incidentDetails = "";
        return "Incident analyzed: " + incidentDetails + "\nSuggested resolution: Verify system logs and escalate if needed.";
    }

    @FXML
    public void onUpdateLog(ActionEvent actionEvent) {
        String logDetails = logtextarea.getText();
        if (logDetails == null || logDetails.isEmpty()) {
            logtextarea.setText("No analysis details to log.");
            return;
        }
        logIncident(logDetails);
        logtextarea.setText("Log updated successfully!");
    }

    private void logIncident(String logDetails) {
        System.out.println("Log entry: " + logDetails);
    }
}
