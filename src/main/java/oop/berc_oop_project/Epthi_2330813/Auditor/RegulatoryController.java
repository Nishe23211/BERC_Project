package oop.berc_oop_project.Epthi_2330813.Auditor;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class RegulatoryController {


    @FXML
    private ComboBox<String> decisionCB;

    @FXML
    private TableColumn<AlertController.Record, String> detailsTC;

    @FXML
    private DatePicker dateDB;

    @FXML
    private TableColumn<AlertController.Record, String> dateTC;

    @FXML
    private TableColumn<AlertController.Record, String> decisionTC;

    @FXML
    private TableColumn<AlertController.Record, String> recordTC;

    @FXML
    private TableView<AlertController.Record> regulatoryTV;

    @FXML
    private Label settext;

    @FXML
    private Button applyFiltersButton;

    @FXML
    void applyfilterButtonClick(ActionEvent event) {
        applyFilter();
    }

    public void initialize() {
        if (decisionCB != null) {
            decisionCB.getItems().addAll("Tariff", "License", "Approval");

        }

        decisionTC.setCellValueFactory(cellData -> cellData.getValue().decisionTypeProperty());
        dateTC.setCellValueFactory(cellData -> cellData.getValue().dateProperty());
        recordTC.setCellValueFactory(cellData -> cellData.getValue().recordIdProperty());
        detailsTC.setCellValueFactory(cellData -> cellData.getValue().detailsProperty());

        if (applyFiltersButton != null) {
            applyFiltersButton.setOnAction(e -> applyFilter());
        }

    }

    private void applyFilter() {
        String selectedDecision = decisionCB.getValue();
        String selectedDate = dateDB.getValue() != null ? dateDB.getValue().toString() : "";

        ObservableList<AlertController.Record> filteredRecords = fetchFilteredRecords(selectedDecision, selectedDate);

        if (filteredRecords.isEmpty()) {
            settext.setText("No records found.");
        } else {
            regulatoryTV.setItems(filteredRecords);
            settext.setText("Filter applied successfully!");
        }
    }

    private ObservableList<AlertController.Record> fetchFilteredRecords(String decisionType, String date) {

        ObservableList<AlertController.Record> records = FXCollections.observableArrayList();

        records.add(new AlertController.Record("R001", "Tariff", "2024-10-01", " Got Tariff Approval "));
        records.add(new AlertController.Record("R002", "License", "2024-09-15", "Got License Issuance "));
        records.add(new AlertController.Record("R004", "Approval", "2024-08-01", "Approval pending."));
        records.add(new AlertController.Record("R005", "Approval", "2024-08-01", "Approval pending for increase tariff rate(gas)"));
        records.add(new AlertController.Record("R006", "Approval", "2024-08-01", "Approval Rejected for License "));
        records.add(new AlertController.Record("R007", "Approval", "2024-08-01", "Approval Rejected for increase tariff rate"));
        records.add(new AlertController.Record("R008", "Approval", "2024-08-01", "Approval pending"));
        records.add(new AlertController.Record("R009", "Approval", "2024-08-01", "Approval Rejected"));
        records.add(new AlertController.Record("R0010", "Approval", "2024-08-01", "Approval pending"));


        return records.filtered(record -> record.getDecisionType().equals(decisionType)
                && (date.isEmpty() || record.getDate().equals(date)));
    }
}
