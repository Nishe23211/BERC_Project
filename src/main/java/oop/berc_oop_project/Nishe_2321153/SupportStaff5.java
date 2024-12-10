package oop.berc_oop_project.Nishe_2321153;

import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class SupportStaff5
{
    @javafx.fxml.FXML
    private Label updatesalary;
    @javafx.fxml.FXML
    private TextField employeenamefield;
    @javafx.fxml.FXML
    private TextField newsalaryfield;
    @javafx.fxml.FXML
    private TextField employeeidfield;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void onSave(ActionEvent actionEvent) {
        String employeeName = employeenamefield.getText();
        String employeeId = employeeidfield.getText();
        String newSalary = newsalaryfield.getText();

        if (employeeName.isEmpty() || employeeId.isEmpty() || newSalary.isEmpty()) {
            showAlert("Error", "All fields must be filled!");
            return;
        }

        try {
            double salary = Double.parseDouble(newSalary);
            if (salary < 0) {
                showAlert("Error", "Salary cannot be negative!");
                return;
            }
            System.out.printf("Salary updated for Employee: %s (ID: %s). New Salary: %.2f%n",
                    employeeName, employeeId, salary);

            showAlert("Success", "Salary updated successfully!");
            employeenamefield.clear();
            employeeidfield.clear();
            newsalaryfield.clear();

        } catch (NumberFormatException e) {
            showAlert("Error", "Invalid salary value. Please enter a valid number!");
        }
    }

    @javafx.fxml.FXML
    public void onCancel(ActionEvent actionEvent) {
        employeenamefield.clear();
        employeeidfield.clear();
        newsalaryfield.clear();
    }

private void showAlert(String title, String message) {
    Alert alert = new Alert(Alert.AlertType.INFORMATION);
    alert.setTitle(title);
    alert.setHeaderText(null);
    alert.setContentText(message);
    alert.showAndWait();
}
}