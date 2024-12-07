package oop.berc_oop_project;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import oop.berc_oop_project.Sayma_2320543.SystemAdministratorU8;

public class SystemAdministrator8 {


    @javafx.fxml.FXML
    private ComboBox<String> typeofinformationComboBox;
    @javafx.fxml.FXML
    private TableColumn<SystemAdministratorU8,String> updateinformationCol;
    @javafx.fxml.FXML
    private TableView<SystemAdministratorU8> informationTable;
    @javafx.fxml.FXML
    private TableColumn<SystemAdministratorU8,String> typeofinformationCol;
    @javafx.fxml.FXML
    private TextField updateinformationField;

    @FXML
    public void initialize() {
        typeofinformationComboBox.getItems().addAll("Tariffs","Reports","Notices");

        typeofinformationCol.setCellValueFactory(new PropertyValueFactory<>("typeofinformation"));
        updateinformationCol.setCellValueFactory(new PropertyValueFactory<>("updateinformation"));

    }


    @javafx.fxml.FXML
    public void onUpdateButtonClick(ActionEvent actionEvent) {
        String typeofinformation = typeofinformationComboBox.getSelectionModel().getSelectedItem();
        String updateinformation = updateinformationField.getText();
        SystemAdministratorU8 s = new SystemAdministratorU8(typeofinformation,updateinformation);
        informationTable.getItems().add(s);
    }
}
