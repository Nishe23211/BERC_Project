package oop.berc_oop_project;

import javafx.event.ActionEvent;
import javafx.scene.control.*;

public class SupportStaffDashboard {
    @javafx.fxml.FXML
    private Label supportstaff;
    @javafx.fxml.FXML
    private Label dashboard;
    @javafx.fxml.FXML
    private TableColumn<Integer, SupportStaffDashboard> caseidcolumn;
    @javafx.fxml.FXML
    private TableColumn<String, SupportStaffDashboard> statuscolumn;
    @javafx.fxml.FXML
    private ComboBox<String> statusbox;
    @javafx.fxml.FXML
    private TextField descriptionfield;
    @javafx.fxml.FXML
    private TextField casefield;
    @javafx.fxml.FXML
    private TableView<SupportStaffDashboard> casetableview;
    @javafx.fxml.FXML
    private TableColumn<String, SupportStaffDashboard> descriptioncolumn;

    @javafx.fxml.FXML
    public void onUserManagement(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void onTickets(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void onEvents(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void onLogOut(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void onSystemLogs(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void onEmployeeManagement(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void onFiles(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void onAdd(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void onViewCase(ActionEvent actionEvent) {
    }
}
