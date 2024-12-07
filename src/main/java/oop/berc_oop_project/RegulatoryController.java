package oop.berc_oop_project;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class RegulatoryController {


    @FXML
    private ComboBox<String> decisionCB;

    @FXML
    private TableColumn<Record, String> detailsTC;

    @FXML
    private DatePicker dateDB;

    @FXML
    private TableColumn<Record, String> dateTC;

    @FXML
    private TableColumn<Record, String> decisionTC;

    @FXML
    private TableColumn<Record, String> recordTC;

    @FXML
    private TableView<Record> regulatoryTV;

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

        ObservableList<Record> filteredRecords = fetchFilteredRecords(selectedDecision, selectedDate);

        if (filteredRecords.isEmpty()) {
            settext.setText("No records found.");
        } else {
            regulatoryTV.setItems(filteredRecords);
            settext.setText("Filter applied successfully!");
        }
    }

    private ObservableList<Record> fetchFilteredRecords(String decisionType, String date) {

        ObservableList<Record> records = FXCollections.observableArrayList();

        //  records
        records.add(new Record("R001", "Tariff", "2024-10-01", " Got Tariff Approval "));
        records.add(new Record("R002", "License", "2024-09-15", "Got License Issuance "));
        records.add(new Record("R004", "Approval", "2024-08-01", "Approval pending."));
        records.add(new Record("R005", "Approval", "2024-08-01", "Approval pending for increase tariff rate(gas)"));
        records.add(new Record("R006", "Approval", "2024-08-01", "Approval Rejected for License "));
        records.add(new Record("R007", "Approval", "2024-08-01", "Approval Rejected for increase tariff rate"));
        records.add(new Record("R008", "Approval", "2024-08-01", "Approval pending"));
        records.add(new Record("R009", "Approval", "2024-08-01", "Approval Rejected"));
        records.add(new Record("R0010", "Approval", "2024-08-01", "Approval pending"));


        return records.filtered(record -> record.getDecisionType().equals(decisionType)
                && (date.isEmpty() || record.getDate().equals(date)));
    }
}
