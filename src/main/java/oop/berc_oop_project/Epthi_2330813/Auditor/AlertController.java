package oop.berc_oop_project.Epthi_2330813.Auditor;

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
