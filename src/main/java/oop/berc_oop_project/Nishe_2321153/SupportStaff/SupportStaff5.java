package oop.berc_oop_project.Nishe_2321153.SupportStaff;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import oop.berc_oop_project.HelloApplication;

import java.io.IOException;

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
    private Label salaryText;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void onSave(ActionEvent actionEvent) {
        String employeeName = employeenamefield.getText();
        String employeeId = employeeidfield.getText();
        String newSalary = newsalaryfield.getText();

        if (employeeName.isEmpty() || employeeId.isEmpty() || newSalary.isEmpty()) {
            salaryText.setText("All fields must be filled!");
            return;
        }

        try {
            double salary = Double.parseDouble(newSalary);
            if (salary < 0) {
                salaryText.setText("Salary cannot be negative!");
                return;
            }
            System.out.printf("Salary updated for Employee: %s (ID: %s). New Salary: %.2f%n",
                    employeeName, employeeId, salary);

            salaryText.setText("Salary updated successfully!");
            employeenamefield.clear();
            employeeidfield.clear();
            newsalaryfield.clear();

        } catch (NumberFormatException e) {
            salaryText.setText("Invalid salary value. Please enter a valid number!");
        }
    }

    @javafx.fxml.FXML
    public void onCancel(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("SupportStaffDashboard.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = (Stage) (((Node) actionEvent.getSource()).getScene().getWindow());
        stage.setScene(scene);
    }
}