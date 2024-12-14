package oop.berc_oop_project.Epthi_2330813.Auditor;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;
import oop.berc_oop_project.HelloApplication;

import java.io.IOException;

public class TrainingController {

    @FXML
    private TextField reviewTF;

    @FXML
    private Label feedbackLabel;

    @FXML
    private ComboBox<String> scenariosComboBox;

    @FXML
    private TextArea mockReportArea;

    @FXML
    public void initialize() {
        scenariosComboBox.getItems().addAll(
                "Audit a Financial Report",
                "Verify Compliance Reports",
                "Investigate License Violations"
        );

        feedbackLabel.setText("");
        mockReportArea.setEditable(false);
        mockReportArea.setText("Select a scenario to view the mock report.");
    }
    @FXML
    void onScenarioSelected() {
        String selectedScenario = scenariosComboBox.getSelectionModel().getSelectedItem();
        if (selectedScenario != null) {
            showMockScenario(selectedScenario);
        } else {
            showAlert("Selection Error", "Please select a scenario to proceed.");
        }


}

    @FXML
    void onsubmitButtonClick(ActionEvent event) {
        String userInput = reviewTF.getText().trim();
        if (userInput.isEmpty()) {
            showAlert("Input Error", "Please provide your review before submitting.");
            return;
        }
        if (userInput.equalsIgnoreCase("correct")) {
            feedbackLabel.setText("Great job! Your review is correct.");
        } else {
            feedbackLabel.setText("Incorrect review. Please try again.");
        }
    }


    @FXML
    public void OnbackBC(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("auditdboard.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = (Stage) (((Node) actionEvent.getSource()).getScene().getWindow());
        stage.setScene(scene);
    }

    private void showMockScenario(String scenario) {
        switch (scenario) {
            case "Audit a Financial Report":
                mockReportArea.setText(""" 
                Mock Financial Report:
                - Revenue: $500,000
                - Expenses: $600,000
                - Discrepancy: Missing $100,000
                - Department A: Underreported revenue by $50,000
                - Department B: Excessive expenses in Q2 ($40,000 over budget)
                - Observations:
                  * Inconsistent reporting of fixed assets
                  * Missing receipts for travel expenses worth $10,000
                Please review and provide your findings.
                """);
                reviewTF.setPromptText("Write your findings about the financial report...");
                break;

            case "Verify Compliance Reports":
                mockReportArea.setText(""" 
                Mock Compliance Report:
                - Safety Check:
                  * Missed in Q2 2024 for Plant X
                  * Q3 report incomplete for Plant Y
                - Environmental Violations:
                  * Overuse of restricted materials (20% above legal limit)
                  * Untreated waste released into nearby river (3 incidents in 2024)
                - Energy Efficiency:
                  * Plant X exceeds energy usage by 15% compared to industry standards
                  * No evidence of efforts to improve efficiency
                - Observations:
                  * No third-party verification of data
                  * Employees report outdated safety procedures
                Please identify key issues in this compliance report.
                """);
                reviewTF.setPromptText("Provide your observations about the compliance...");
                break;

            case "Investigate License Violations":
                mockReportArea.setText(""" 
                Mock License Report:
                - License ID: 12345
                - Violations:
                  * Unauthorized service expansion into Zone B
                  * Failure to renew license for Plant Z (expired 180 days ago)
                  * Operating with an unlicensed subcontractor
                - Fines and Penalties:
                  * Issued two warning notices (ignored)
                  * Pending fines worth $50,000
                - Observations:
                  * No corrective action plans submitted
                  * Historical record shows similar violations in 2022 and 2023
                Please investigate and detail the violations found.
                """);
                reviewTF.setPromptText("Describe the license violations...");
                break;

            default:
                mockReportArea.setText("Unknown scenario. Please select a valid scenario.");
                reviewTF.setPromptText("Select a valid scenario to proceed...");
        }
    }


    private void showAlert(String title, String message) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle(title);
        alert.setContentText(message);
        alert.showAndWait();
    }
}
