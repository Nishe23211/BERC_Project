package oop.berc_oop_project;

import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

import java.security.Timestamp;

public class SupportStaff1 {
    @javafx.fxml.FXML
    private Label systemlogs;
    @javafx.fxml.FXML
    private TableColumn<Integer, SupportStaff1> timestampcolumn;
    @javafx.fxml.FXML
    private ComboBox<String> filterCB;
    @javafx.fxml.FXML
    private TableView<SupportStaff1> tableview;
    @javafx.fxml.FXML
    private TableColumn<Integer, SupportStaff1> logcolumn;
    @javafx.fxml.FXML
    private TableColumn<String, SupportStaff1> incidentcolumn;

    @javafx.fxml.FXML
    public void onFilter(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void onViewLogDetails(ActionEvent actionEvent) {
    }
}
