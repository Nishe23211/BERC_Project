package oop.berc_oop_project.Nishe_2321153;

import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class SupportStaff1 {
    @javafx.fxml.FXML
    private Label systemlogs;
    @javafx.fxml.FXML
    private TableColumn<SupportStaff1, Integer> timestampcolumn;
    @javafx.fxml.FXML
    private ComboBox<String> filterCB;
    @javafx.fxml.FXML
    private TableView<SupportStaff1> tableview;
    @javafx.fxml.FXML
    private TableColumn<SupportStaff1, Integer> logcolumn;
    @javafx.fxml.FXML
    private TableColumn<SupportStaff1, String> incidentcolumn;

    @javafx.fxml.FXML
    public void onFilter(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void onViewLogDetails(ActionEvent actionEvent) {
    }
}
