package oop.berc_oop_project.Epthi_2330813.Auditor;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import oop.berc_oop_project.HelloApplication;

import java.io.IOException;

public class ComplianceController {

    @FXML
    private TableColumn<Compliance, String> companyCOL;

    @FXML
    private TableColumn<Compliance, String> compliCol;

    @FXML
    private TableColumn<Compliance, String> dateCol;

    @FXML
    private TableView<Compliance> reportTV;
    @FXML
    private TableColumn<Compliance, String> rulesCol;
    private ObservableList<Compliance> reports;


    @FXML
    public void initialize() {
        companyCOL.setCellValueFactory(new PropertyValueFactory<>("companyName"));
        compliCol.setCellValueFactory(new PropertyValueFactory<>("complianceStatus"));
        dateCol.setCellValueFactory(new PropertyValueFactory<>("reportDate"));
        rulesCol.setCellValueFactory(new PropertyValueFactory<>("rulesFollowed"));


        reports = FXCollections.observableArrayList(
                new Compliance("Company A", "Compliant", "2024-12-01", "Compliance with Tariff Regulations, Adherence to Environmental Standards"),
                new Compliance("Company B", "Non-Compliant", "2024-12-05", "Failure to comply with Energy Efficiency Standards"),
                new Compliance("Company C", "Compliant", "2024-12-10", "Adherence to Pollution Control Measures, Compliance with Safety Regulations"),
                new Compliance("Company D", "Non-Compliant", "2024-11-22", "Violation of Renewable Energy Quota"),
                new Compliance("Company E", "Compliant", "2024-11-30", "Following Safety and Maintenance Protocols"),
                new Compliance("Company F", "Non-Compliant", "2024-12-15", "Non-Adherence to Billing Standards"),
                new Compliance("Company G", "Compliant", "2024-10-20", "Compliance with Renewable Energy Policies"),
                new Compliance("Company H", "Non-Compliant", "2024-12-03", "Missed Deadlines for Infrastructure Upgrades"),
                new Compliance("Company I", "Compliant", "2024-12-08", "Adherence to Workforce Safety Guidelines"),
                new Compliance("Company J", "Non-Compliant", "2024-11-18", "Failure to Submit Required Documentation")
        );

        reportTV.setItems(reports);
    }
    @FXML
    void FilterButtonClick(ActionEvent event) {
        ObservableList<Compliance> filteredReports = FXCollections.observableArrayList();

        for (Compliance report : reports) {
            if (report.getComplianceStatus().equals("Non-Compliant")) {
                filteredReports.add(report);
            }
        }

        reportTV.setItems(filteredReports);
    }

    @FXML
    public void OnbackBC(ActionEvent actionEvent)  throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("auditdboard.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = (Stage) (((Node) actionEvent.getSource()).getScene().getWindow());
        stage.setScene(scene);
    }
}

