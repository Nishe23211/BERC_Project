package oop.berc_oop_project.Epthi_2330813.Auditor;

import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class Resolution {

    @FXML
    private TableColumn<Resolution, String > ConsCol;

    @FXML
    private TableColumn<Resolution, String> companyCol;

    @FXML
    private TableColumn<Resolution, String> dateCol1;

    @FXML
    private TableColumn<Resolution, String> disputeCOL;

    @FXML
    private TableView<Resolution> resolutionTV;

    @FXML
    private TableColumn<Resolution, String> statusCol;

    @FXML
    private ComboBox<String> viewCB;

}
