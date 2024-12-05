package oop.berc_oop_project.Epthi_2330813.Auditor;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class RegulatoryController {

    @FXML
    private TableColumn<RegulatoryController,String> datailsTC;

    @FXML
    private DatePicker dateDB;

    @FXML
    private TableColumn<RegulatoryController,String> dateTC;

    @FXML
    private ComboBox<String> descionCB;

    @FXML
    private TableColumn<RegulatoryController,String> descionTC;

    @FXML
    private TableColumn<RegulatoryController,String> recordTC;

    @FXML
    private TableView<RegulatoryController> regulatoryTV;

    @FXML
    private Label settext;

    @FXML
    void applyfilterButtonClick(ActionEvent event) {

    }

}
