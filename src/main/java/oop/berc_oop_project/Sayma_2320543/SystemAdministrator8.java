package oop.berc_oop_project.Sayma_2320543;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import oop.berc_oop_project.HelloApplication;

import java.io.IOException;

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

    @FXML
    public void onBackButtonClick(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("SystemAdministratorDashboard.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = (Stage)(((Node) actionEvent.getSource()).getScene().getWindow());
        stage.setScene(scene);
    }
}
