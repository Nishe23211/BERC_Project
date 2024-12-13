package oop.berc_oop_project.Sayma_2320543;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import oop.berc_oop_project.HelloApplication;

import java.io.IOException;

public class PolicyMaker6 {
    @javafx.fxml.FXML
    private TextField usernameField;
    @javafx.fxml.FXML
    private TableColumn<Device,String> devicenameCol;
    @javafx.fxml.FXML
    private TableColumn<Device,String> usernameCol;
    @javafx.fxml.FXML
    private ComboBox<String> devicenameComboBox;
    @javafx.fxml.FXML
    private Label DisplayText;
    private ObservableList<Device> deviceList;
    @javafx.fxml.FXML
    private TextField passwordField;
    @javafx.fxml.FXML
    private TableView<Device> deviceTable;
    @javafx.fxml.FXML
    private TableColumn<Device,String> passwordCol;

    @FXML
    public void initialize() {
        devicenameCol.setCellValueFactory(new PropertyValueFactory<>("deviceName"));
        usernameCol.setCellValueFactory(new PropertyValueFactory<>("userName"));
        passwordCol.setCellValueFactory(new PropertyValueFactory<>("password"));

        deviceList = FXCollections.observableArrayList();
        deviceTable.setItems(deviceList);

        devicenameComboBox.setItems(FXCollections.observableArrayList("Device1", "Device2", "Device3", "Device4"));
    }

    @javafx.fxml.FXML
    public void onAddButtonClick(ActionEvent actionEvent) {
        String deviceName = devicenameComboBox.getValue();
        String userName = usernameField.getText();
        String password = passwordField.getText();

        if (deviceName != null && !userName.isEmpty() && !password.isEmpty()) {
            deviceList.add(new Device(deviceName, userName, password));
            DisplayText.setText("Device added successfully.");
        } else {
            DisplayText.setText("Please fill all the fields.");
        }
    }

    @javafx.fxml.FXML
    public void onRecongnizeButtonClick(ActionEvent actionEvent) {
        String selectedDevice = devicenameComboBox.getValue();
        boolean isRecognized = deviceList.stream()
                .anyMatch(device -> device.getDeviceName().equals(selectedDevice));

        if (isRecognized) {
            DisplayText.setText("The device \"" + selectedDevice + "\" is recognized.");
        } else {
            DisplayText.setText("The device \"" + selectedDevice + "\" is not recognized.");
        }
    }

    @FXML
    public void onBackButtonClick(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("PolicyMakerDashboard.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = (Stage)(((Node) actionEvent.getSource()).getScene().getWindow());
        stage.setScene(scene);
    }
}
