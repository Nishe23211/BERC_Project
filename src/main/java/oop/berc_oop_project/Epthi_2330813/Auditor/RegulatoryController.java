package oop.berc_oop_project.Epthi_2330813.Auditor;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;
import oop.berc_oop_project.HelloApplication;

import java.io.IOException;

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
    private Button applyFilter;

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

        if (applyFilter != null) {
            applyFilter.setOnAction(this::applyfilterButtonClick);
        }
    }

    private void applyFilter() {
        String selectedDecision = decisionCB.getValue() != null ? decisionCB.getValue() : "";
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
        records.add(new Record("R001", "Tariff", "2024-10-01", "Got Tariff Approval"));
        records.add(new Record("R002", "License", "2024-09-15", "Got License Issuance"));
        records.add(new Record("R004", "Approval", "2024-08-01", "Approval pending."));
        records.add(new Record("R005", "Approval", "2024-08-01", "Approval pending for increase tariff rate (gas)"));
        records.add(new Record("R006", "Approval", "2024-08-01", "Approval Rejected for License"));
        records.add(new Record("R007", "Approval", "2024-08-01", "Approval Rejected for increase tariff rate"));
        records.add(new Record("R008", "Approval", "2024-08-01", "Approval pending"));
        records.add(new Record("R009", "Approval", "2024-08-01", "Approval Rejected"));
        records.add(new Record("R0010", "Approval", "2024-08-01", "Approval pending"));
        records.add(new Record("R0011", "Tariff", "2024-07-25", "Tariff Increase Approved"));
        records.add(new Record("R0012", "License", "2024-06-15", "New License Application Received"));
        records.add(new Record("R0013", "Approval", "2024-07-01", "Approval Granted for Power Plant Expansion"));
        records.add(new Record("R0014", "Tariff", "2024-05-20", "Tariff Decrease Rejected"));
        records.add(new Record("R0015", "License", "2024-04-10", "License Renewal Pending"));
        records.add(new Record("R0016", "Approval", "2024-03-05", "Approval Granted for Renewable Energy Project"));
        records.add(new Record("R0017", "Tariff", "2024-02-12", "Tariff Increase Application Received"));
        records.add(new Record("R0018", "License", "2024-01-28", "License Application Under Review"));
        records.add(new Record("R0019", "Approval", "2024-01-15", "Approval Rejected for Policy Violation"));
        records.add(new Record("R0020", "Tariff", "2024-01-01", "New Tariff Policy Implemented"));



        return records.filtered(record ->
                (decisionType.isEmpty() || record.getDecisionType().equals(decisionType)) &&
                        (date.isEmpty() || record.getDate().equals(date)));
    }

    @FXML
    public void OnbackBC(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("auditdboard.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = (Stage) (((Node) actionEvent.getSource()).getScene().getWindow());
        stage.setScene(scene);
    }
}
