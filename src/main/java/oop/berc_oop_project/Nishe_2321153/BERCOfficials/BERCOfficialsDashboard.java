package oop.berc_oop_project.Nishe_2321153.BERCOfficials;

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
import java.time.LocalDate;

public class BERCOfficialsDashboard {
    @javafx.fxml.FXML
    private DatePicker date;
    @javafx.fxml.FXML
    private TableColumn<BERCDashboard, String> namecolumn;
    @javafx.fxml.FXML
    private TableColumn<BERCDashboard, String> statuscolumn;
    @javafx.fxml.FXML
    private TextField namefield;
    @javafx.fxml.FXML
    private TableColumn<BERCDashboard, String> idcolumn;
    @javafx.fxml.FXML
    private Label BERC;
    @javafx.fxml.FXML
    private Label dash;
    @javafx.fxml.FXML
    private TableView<BERCDashboard> dashtable;
    @javafx.fxml.FXML
    private TableColumn<BERCDashboard, LocalDate> datecolumn;
    @javafx.fxml.FXML
    private TextField idfield;
    @javafx.fxml.FXML
    private ComboBox<String> statusBox;
    @javafx.fxml.FXML
    private Label dashText;

    @FXML
    public void initialize() {
        statusBox.getItems().addAll("Pending", "Approved", "Rejected");

        namecolumn.setCellValueFactory(new PropertyValueFactory<>("name"));
        idcolumn.setCellValueFactory(new PropertyValueFactory<>("id"));
        statuscolumn.setCellValueFactory(new PropertyValueFactory<>("status"));
        datecolumn.setCellValueFactory(new PropertyValueFactory<>("date"));
    }

    @javafx.fxml.FXML
    public void onPendingList(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("BERCOfficials2.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = (Stage)(((Node) actionEvent.getSource()).getScene().getWindow());
        stage.setScene(scene);
    }

    @javafx.fxml.FXML
    public void onSecureSystem(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("BERCOfficials1.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = (Stage)(((Node) actionEvent.getSource()).getScene().getWindow());
        stage.setScene(scene);
    }

    @javafx.fxml.FXML
    public void onview(ActionEvent actionEvent) throws IOException {
        BERCDashboard selectedCase = dashtable.getSelectionModel().getSelectedItem();

        if (selectedCase == null) {
            dashText.setText("Error: No File is selected.");
        } else {
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("BERCOfficials4.fxml"));
            Scene scene = new Scene(fxmlLoader.load());
            Stage stage = (Stage) (((Node) actionEvent.getSource()).getScene().getWindow());
            stage.setScene(scene);
        }
    }

    @javafx.fxml.FXML
    public void onDisputeResolution(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("BERCOfficials3.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = (Stage)(((Node) actionEvent.getSource()).getScene().getWindow());
        stage.setScene(scene);
    }

    @javafx.fxml.FXML
    public void onAdd(ActionEvent actionEvent) {
        String name  = namefield.getText();
        String id = idfield.getText();
        String status = statusBox.getSelectionModel().getSelectedItem();
        LocalDate datee = date.getValue();
        BERCDashboard d = new BERCDashboard(name,id,status,datee);

        if (name.isEmpty() || id.isEmpty() || status == null || datee == null) {
            dashText.setText("Error: All fields must be filled out.");
            return;
        }
        namefield.clear();
        idfield.clear();
        statusBox.setValue(null);
        date.setValue(null);
        dashText.setText("File added successfully.");
        dashtable.getItems().add(d);
    }

    @FXML
    public void onComplianceReports(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("BERCOfficials7.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = (Stage)(((Node) actionEvent.getSource()).getScene().getWindow());
        stage.setScene(scene);
    }

    @FXML
    public void onCurrentConsultation(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("BERCOfficials6.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = (Stage)(((Node) actionEvent.getSource()).getScene().getWindow());
        stage.setScene(scene);
    }

    @FXML
    public void onManagementArea(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("BERCOfficials8.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = (Stage)(((Node) actionEvent.getSource()).getScene().getWindow());
        stage.setScene(scene);
    }

    @FXML
    public void onUpdate(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("BERCOfficials5.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = (Stage)(((Node) actionEvent.getSource()).getScene().getWindow());
        stage.setScene(scene);
    }

    @FXML
    public void onLogOut(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("LogInPage.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = (Stage)(((Node) actionEvent.getSource()).getScene().getWindow());
        stage.setScene(scene);
    }
}
