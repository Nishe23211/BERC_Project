package oop.berc_oop_project.Nishe_2321153;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import oop.berc_oop_project.HelloApplication;
import oop.berc_oop_project.Sayma_2320543.User1;

import java.io.IOException;

public class SupportStaffDashboard
{
    @FXML
    private TableColumn<SupportStaffDashboard, Integer> caseidcolumn;
    @FXML
    private TableColumn<SupportStaffDashboard, String> statuscolumn;
    @FXML
    private ComboBox<String> statusbox;
    @FXML
    private TextField descriptionfield;
    @FXML
    private TextField casefield;
    @FXML
    private TableView<SupportStaffDashboard> casetableview;
    @FXML
    private TableColumn<SupportStaffDashboard, String> descriptioncolumn;
    @FXML
    private Label supportstaff;
    @FXML
    private Label dashboard;

    @FXML
    public void initialize() {
        statusbox.getItems().addAll("Open","In Progress","Resolved", "Closed");

        caseidcolumn.setCellValueFactory(new PropertyValueFactory<>("Case Id"));
        descriptioncolumn.setCellValueFactory(new PropertyValueFactory<>("Issue Description"));
        statuscolumn.setCellValueFactory(new PropertyValueFactory<>("Status"));
    }

    @FXML
    public void onUserManagement(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("SupportStaff8.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = (Stage)(((Node) actionEvent.getSource()).getScene().getWindow());
        stage.setScene(scene);
    }

    @FXML
    public void onTickets(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("SupportStaff6.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = (Stage)(((Node) actionEvent.getSource()).getScene().getWindow());
        stage.setScene(scene);
    }

    @FXML
    public void onEvents(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("SupportStaff4.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = (Stage)(((Node) actionEvent.getSource()).getScene().getWindow());
        stage.setScene(scene);
    }

    @FXML
    public void onSystemLogs(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("SupportStaff1.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = (Stage)(((Node) actionEvent.getSource()).getScene().getWindow());
        stage.setScene(scene);
    }

    @FXML
    public void onEmployeeManagement(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("SupportStaff3.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = (Stage)(((Node) actionEvent.getSource()).getScene().getWindow());
        stage.setScene(scene);
    }

    @FXML
    public void onFiles(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("SupportStaff7.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = (Stage)(((Node) actionEvent.getSource()).getScene().getWindow());
        stage.setScene(scene);
    }

    @FXML
    public void onAdd(ActionEvent actionEvent) {
        int caseid  = Integer.parseInt(casefield.getText());
        String issuedescription = descriptionfield.getText();
        String status = statusbox.getSelectionModel().getSelectedItem();
        SSDashboard b = new SSDashboard(caseid, issuedescription, status);
        casetableview.getItems().add(b);
    }

    @FXML
    public void onViewCase(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("SupportStaff2.fxml"));
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