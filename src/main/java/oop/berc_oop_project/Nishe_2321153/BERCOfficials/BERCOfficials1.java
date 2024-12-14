package oop.berc_oop_project.Nishe_2321153.BERCOfficials;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import oop.berc_oop_project.HelloApplication;

import java.io.IOException;

public class BERCOfficials1 {
    @javafx.fxml.FXML
    private TableView<Report> securetable;
    @javafx.fxml.FXML
    private TableColumn<Report, String> namecolumn;
    @javafx.fxml.FXML
    private TextField namefield;
    @javafx.fxml.FXML
    private ComboBox<String> typeCB;
    @javafx.fxml.FXML
    private DatePicker dor;
    @javafx.fxml.FXML
    private TableColumn<Report, String> typecolumn;
    @javafx.fxml.FXML
    private Label securesystem;
    @javafx.fxml.FXML
    private TableColumn<Report, String> datecolumn;
    @javafx.fxml.FXML
    private Label secureText;
    private ObservableList<Report> reports;

    @javafx.fxml.FXML
    public void onBack(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("BERCOfficialsDashboard.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = (Stage) (((Node) actionEvent.getSource()).getScene().getWindow());
        stage.setScene(scene);
    }

    @javafx.fxml.FXML
    public void onView(ActionEvent actionEvent) {
        Report selectedReport = securetable.getSelectionModel().getSelectedItem();
        if (selectedReport == null) {
            secureText.setText("Please select a report to view.");
        } else {
            secureText.setText("Viewing " + selectedReport.getReportname());
        }
    }

    @javafx.fxml.FXML
    public void onViewReport(ActionEvent actionEvent) {
        String selectedType = typeCB.getValue();
        if (selectedType == null) {
            secureText.setText("Please select a report type.");
            return;
        }

        ObservableList<Report> filteredReports = FXCollections.observableArrayList();
        for (Report report : reports) {
            if (report.getReporttype().equals(selectedType)) {
                filteredReports.add(report);
            }
        }

        if (filteredReports.isEmpty()) {
            secureText.setText("No reports found for the selected type.");
        } else {
            securetable.setItems(filteredReports);
            secureText.setText("Reports loaded for type " + selectedType);
        }
    }
    @FXML
    public void initialize() {
        typeCB.getItems().addAll("Financial", "Operational", "Environmental");
        namecolumn.setCellValueFactory(new PropertyValueFactory<>("reportname"));
        typecolumn.setCellValueFactory(new PropertyValueFactory<>("reporttype"));
        datecolumn.setCellValueFactory(new PropertyValueFactory<>("date"));

        securetable.setItems(reports);


        reports = FXCollections.observableArrayList(
                new Report("Annual Report", "Financial", "2024-12-10"),
                new Report("Quarterly Update", "Operational", "2024-11-15"),
                new Report("Impact Assessment", "Environmental", "2024-10-05")
        );
    }
}
