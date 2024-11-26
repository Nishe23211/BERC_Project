package oop.berc_oop_project;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class SupportStaff4 {
    @javafx.fxml.FXML
    private TableColumn<String, SupportStaff4> statuscolumn;
    @javafx.fxml.FXML
    private Label tickets;
    @javafx.fxml.FXML
    private TableColumn<Integer, SupportStaff4> idcolumn;
    @javafx.fxml.FXML
    private TableView<SupportStaff4> tickettableview;
    @javafx.fxml.FXML
    private TableColumn<String, SupportStaff4> subcolumn;

    @javafx.fxml.FXML
    public void onViewDetails(ActionEvent actionEvent) {
    }
}
