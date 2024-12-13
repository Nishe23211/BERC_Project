package oop.berc_oop_project.Epthi_2330813.Consumer;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class DisputeController {

    @FXML
    private TableView<Goal3> DisputeTB;

    @FXML
    private TableColumn<Goal3,String > complainidTC;

    @FXML
    private TableColumn<Goal3,String> currentstatusTC;

    @FXML
    private TableColumn<Goal3,String> datefieldTC;

    private ObservableList<Goal3> disputes;

    @FXML
    public void initialize() {
        complainidTC.setCellValueFactory(new PropertyValueFactory<>("disputeId"));
        currentstatusTC.setCellValueFactory(new PropertyValueFactory<>("date"));
        datefieldTC.setCellValueFactory(new PropertyValueFactory<>("status"));

        disputes = FXCollections.observableArrayList(
                new Goal3("D001", "2024-11-01", "Resolved"),
                new Goal3("D002", "2024-12-05", "Under Review"),
                new Goal3("D003", "2024-10-15", "Pending")
        );
        DisputeTB.setItems(disputes);
    }


}
