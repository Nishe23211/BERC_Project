package oop.berc_oop_project.Nishe_2321153;

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
import java.util.ArrayList;

public class SupportStaff1 {

    @javafx.fxml.FXML
    private ComboBox<String> filterCB;
    @javafx.fxml.FXML
    private TableView<SupportStaffU1> tableview;
    @javafx.fxml.FXML
    private TableColumn<SupportStaffU1, Integer> logcolumn;
    @javafx.fxml.FXML
    private TableColumn<SupportStaffU1, String> incidentcolumn;
    @FXML
    private Label systemlogs;
    @FXML
    private TextField logidfield;

    private ArrayList<SupportStaffU1> userList = new ArrayList<>();

    @FXML
    public void initialize() {
        filterCB.getItems().addAll("Server Errors","Network issue");

        logcolumn.setCellValueFactory(new PropertyValueFactory<>("LogId"));
        incidentcolumn.setCellValueFactory(new PropertyValueFactory<>("IncidentType"));
    }

    @FXML
    public void onFilter(ActionEvent actionEvent) {
        int LogId = Integer.parseInt(logidfield.getText());
        String IncidentType = filterCB.getValue();
        SupportStaffU1 s = new SupportStaffU1(LogId, IncidentType);
        tableview.getItems().add(s);

        logidfield.clear();
        filterCB.setValue("");

    }

    @javafx.fxml.FXML
    public void onViewLogDetails(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("SupportStaff1.a.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = (Stage)(((Node) actionEvent.getSource()).getScene().getWindow());
        stage.setScene(scene);
    }

    public ArrayList<SupportStaffU1> getUserList() {
        return userList;
    }

    public void setUserList(ArrayList<SupportStaffU1> userList) {
        this.userList = userList;
    }
}
