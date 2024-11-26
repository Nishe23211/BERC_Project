package oop.berc_oop_project;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class SupportStaff3 {
    @javafx.fxml.FXML
    private TableColumn<String, SupportStaff3> namecolumn;
    @javafx.fxml.FXML
    private Label employeemanagement;
    @javafx.fxml.FXML
    private TableColumn<String, SupportStaff3> departmentcolumn;
    @javafx.fxml.FXML
    private TableColumn<Integer, SupportStaff3> idcolumn;
    @javafx.fxml.FXML
    private TableView<SupportStaff3> tableview;
    @javafx.fxml.FXML
    private TableColumn<String, SupportStaff3> jobtitlecolumn;

    @javafx.fxml.FXML
    public void onAddEmployee(ActionEvent actionEvent) {
    }
}
