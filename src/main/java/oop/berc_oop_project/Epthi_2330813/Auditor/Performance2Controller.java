package oop.berc_oop_project.Epthi_2330813.Auditor;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class Performance2Controller {

    @FXML
    private TableView<Energy> PerfoTV;

    @FXML
    private TableColumn<Energy,Integer > comCol;

    @FXML
    private TableColumn<Energy,String > companyCol;

    @FXML
    private TableColumn<Energy,Double > energyCol;

    @FXML
    private TableColumn <Energy,String >revCol1;

    private final ObservableList<Energy> energyList = FXCollections.observableArrayList();

        @FXML
        public void initialize() {
            companyCol.setCellValueFactory(new PropertyValueFactory<>("companyName"));
            comCol.setCellValueFactory(new PropertyValueFactory<>("complaintsCount"));
            energyCol.setCellValueFactory(new PropertyValueFactory<>("energyLoss"));
            revCol1.setCellValueFactory(new PropertyValueFactory<>("revenue"));

            // Add sample data
            energyList.addAll(
                    new Energy("EnergyCom A", 15.5, 15, "Underperforming"),
                    new Energy("EnergyCom B", 8.3, 10, "Moderate"),
                    new Energy("EnergyCom C", 20.0, 15, "Excellent")
            );


            PerfoTV.setItems(energyList);
        }

    @FXML
    public void refreshButtonClick(ActionEvent actionEvent) {
    }
}


