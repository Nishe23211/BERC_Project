package oop.berc_oop_project.Nishe_2321153;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

public class SupportStaff3 {
    @FXML
    private TableColumn<EmployeeManagement, String> namecolumn;
    @FXML
    private Label employeemanagement;
    @FXML
    private TableColumn<EmployeeManagement, String> departmentcolumn;
    @FXML
    private TableColumn<EmployeeManagement, Integer> idcolumn;
    @FXML
    private TableView<EmployeeManagement> tableview;
    @FXML
    private TableColumn<EmployeeManagement, String> jobtitlecolumn;
    @FXML
    private TextArea additionalinfoarea;
    @FXML
    private TextField namefield;
    @FXML
    private TextField departmentfield;
    @FXML
    private TextField jobtitledield;
    @FXML
    private DatePicker startdate;
    @FXML
    private TextField employeeidfield;

    private final ObservableList<EmployeeManagement> employees = FXCollections.observableArrayList();
    @FXML
    private TableColumn<EmployeeManagement, String> startdatecolumn;

    @FXML
    public void initialize() {
        idcolumn.setCellValueFactory(new PropertyValueFactory<>("id"));
        namecolumn.setCellValueFactory(new PropertyValueFactory<>("name"));
        departmentcolumn.setCellValueFactory(new PropertyValueFactory<>("department"));
        jobtitlecolumn.setCellValueFactory(new PropertyValueFactory<>("jobTitle"));
        startdatecolumn.setCellValueFactory(new PropertyValueFactory<>("startDate"));

        tableview.setItems(employees);
    }

    @FXML
    public void onAddEmployee(ActionEvent actionEvent) {
        int EmployeeId = Integer.parseInt(employeeidfield.getText());
        String EmployeeName = namefield.getText();
        String Department = departmentfield.getText();
        String Jobtitle = jobtitledield.getText();
        String StartDate = String.valueOf(startdate.getValue()) != null ? startdate.getValue().toString() : "";
        EmployeeManagement e = new EmployeeManagement(EmployeeId, EmployeeName, Department, Jobtitle, StartDate);
        tableview.getItems().add(e);

        employeeidfield.clear();
        namefield.clear();
        departmentfield.clear();
        jobtitledield.clear();
        startdate.setValue(null);
        additionalinfoarea.clear();
    }

    @FXML
    public void onSubmit(ActionEvent actionEvent) {
        String additionalInfo = additionalinfoarea.getText();
        if (additionalInfo.isEmpty()) {
            showAlert("Error", "Please provide additional information before submitting.", Alert.AlertType.ERROR);
        } else {
            showAlert("Success", "Additional information submitted successfully.", Alert.AlertType.INFORMATION);
            additionalinfoarea.clear();
        }
    }

    private void showAlert(String title, String message, Alert.AlertType alertType) {
        Alert alert = new Alert(alertType);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }
}
