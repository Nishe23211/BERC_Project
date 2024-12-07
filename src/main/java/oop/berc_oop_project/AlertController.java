package oop.berc_oop_project;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class AlertController {

    @FXML
    private TableView<Alert> alertTV;

    @FXML
    private TableColumn<Alert,String > issueCol;

    @FXML
    private TableColumn<Alert, String> nameCol;

}
