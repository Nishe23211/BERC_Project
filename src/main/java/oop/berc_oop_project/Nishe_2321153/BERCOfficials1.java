package oop.berc_oop_project.Nishe_2321153;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.time.LocalDate;
import java.util.ArrayList;

public class BERCOfficials1 {
    @javafx.fxml.FXML
    private Label securesystemaccess;
    @javafx.fxml.FXML
    private Label securesystemaccess11;
    @javafx.fxml.FXML
    private TableColumn<Report, String> reporttypecolumn;
    @javafx.fxml.FXML
    private TableView<Report> reporttable;
    @javafx.fxml.FXML
    private Label securesystemaccess1;
    @javafx.fxml.FXML
    private TableColumn<Report, String> reportnamecolumn;
    @javafx.fxml.FXML
    private TableColumn<Report, String> datecolumn;
    @javafx.fxml.FXML
    private ComboBox<String> accessCB;
    private ObservableList<Report> reports;
    @FXML
    private Label reportText;

    @javafx.fxml.FXML
    public void onViewReport(ActionEvent actionEvent) {
        String selectedType = accessCB.getValue();
        if (selectedType == null) {
            reportText.setText("Please select a report type.");
            return;
        }

        ObservableList<Report> filteredReports = FXCollections.observableArrayList();
        for (Report report : reports) {
            if (report.getReporttype().equals(selectedType)) {
                filteredReports.add(report);
            }
        }

        if (filteredReports.isEmpty()) {
            reportText.setText("No reports found for the selected type.");
        } else {
            reporttable.setItems(filteredReports);
            reportText.setText("Reports loaded for type " + selectedType);
        }
    }

    @javafx.fxml.FXML
    public void onView(ActionEvent actionEvent) {
        Report selectedReport = reporttable.getSelectionModel().getSelectedItem();
        if (selectedReport == null) {
            reportText.setText("Please select a report to view.");
        } else {
            reportText.setText("Viewing " + selectedReport.getReportname());
        }
    }

    @FXML
    public void initialize() {
        accessCB.getItems().addAll("Financial", "Operational", "Environmental");
        reportnamecolumn.setCellValueFactory(new PropertyValueFactory<>("reportname"));
        reporttypecolumn.setCellValueFactory(new PropertyValueFactory<>("reporttype"));
        datecolumn.setCellValueFactory(new PropertyValueFactory<>("date"));

        reporttable.setItems(reports);


        reports = FXCollections.observableArrayList(
                new Report("Annual Report", "Financial", "2024-12-10"),
                new Report("Quarterly Update", "Operational", "2024-11-15"),
                new Report("Impact Assessment", "Environmental", "2024-10-05")
        );
    }

}
