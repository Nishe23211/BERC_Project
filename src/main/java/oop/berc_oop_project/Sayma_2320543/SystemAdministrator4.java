package oop.berc_oop_project.Sayma_2320543;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class SystemAdministrator4 {


    @FXML
    private TableColumn<SystemAdministratorU4,String> typeofdataCol;
    @FXML
    private TableColumn<SystemAdministratorU4,String> typeofbackupCol;
    @FXML
    private ComboBox<String> typeofbackupComboBox;
    @FXML
    private TableView<SystemAdministratorU4> databackupTable;
    @FXML
    private ComboBox<String> StorebackupComboBox;
    @FXML
    private ComboBox<String> typeofdataComboBox;
    @FXML
    private TableColumn<SystemAdministratorU4,String> storebackupCol;

    @FXML
    public void initialize() {
        typeofdataComboBox.getItems().addAll(" Regulatory Data","Technical Data","Financial Data","Operational Data"," Stakeholder Data");
        typeofbackupComboBox.getItems().addAll("Full","Incremental","Differential");
        StorebackupComboBox.getItems().addAll("Locally","Off-Site","In the Cloud");


        typeofdataCol.setCellValueFactory(new PropertyValueFactory<>("typeofdata"));
        typeofbackupCol.setCellValueFactory(new PropertyValueFactory<>("typeofbackup"));
        storebackupCol.setCellValueFactory(new PropertyValueFactory<>("storebackup"));
    }

    @FXML
    public void onConfirmSetupButtonClick(ActionEvent actionEvent) {
        String typeofdata = typeofdataComboBox.getSelectionModel().getSelectedItem();
        String typeofbackup = typeofbackupComboBox.getSelectionModel().getSelectedItem();
        String storebackup = StorebackupComboBox.getSelectionModel().getSelectedItem();
        SystemAdministratorU4 s = new SystemAdministratorU4(typeofdata,typeofbackup,storebackup);
        databackupTable.getItems().add(s);
    }
}
