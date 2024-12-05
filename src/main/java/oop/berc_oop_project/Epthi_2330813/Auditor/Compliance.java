package oop.berc_oop_project.Epthi_2330813.Auditor;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class Compliance {

    @FXML
    private TableColumn<Compliance, String> companyCOL;

    @FXML
    private TableColumn<Compliance, String> compliCol;

    @FXML
    private TableColumn<Compliance, String> dateCol;

    @FXML
    private TableView<Compliance> reportTV;

    @FXML
    void FilterButtonClick(ActionEvent event) {

    }

}
