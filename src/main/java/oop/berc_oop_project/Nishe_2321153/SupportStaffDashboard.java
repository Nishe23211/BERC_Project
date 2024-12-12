package oop.berc_oop_project.Nishe_2321153;

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
import java.util.ArrayList;

public class SupportStaffDashboard
{
    @FXML
    private TableColumn<SSDashboard, Integer> caseidcolumn;
    @FXML
    private TableColumn<SSDashboard, String> statuscolumn;
    @FXML
    private ComboBox<String> statusbox;
    @FXML
    private TextField descriptionfield;
    @FXML
    private TextField casefield;
    @FXML
    private TableView<SSDashboard> casetableview;
    @FXML
    private TableColumn<SSDashboard, String> descriptioncolumn;
    @FXML
    private Label supportstaff;
    @FXML
    private Label dashboard;
    @FXML
    private Label dashboardText;
    private ArrayList<SSDashboard> dashb = new ArrayList<>();

    @FXML
    public void initialize() {
        statusbox.getItems().addAll("Open","In Progress","Resolved", "Closed");

        caseidcolumn.setCellValueFactory(new PropertyValueFactory<>("caseid"));
        descriptioncolumn.setCellValueFactory(new PropertyValueFactory<>("issuedescription"));
        statuscolumn.setCellValueFactory(new PropertyValueFactory<>("statusbox"));
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
        String caseid  = casefield.getText();
        String issuedescription = descriptionfield.getText();
        String status = statusbox.getSelectionModel().getSelectedItem();
        SSDashboard b = new SSDashboard(caseid, issuedescription, status);

        if (caseid.isEmpty() || issuedescription.isEmpty() || status == null) {
            dashboardText.setText("Error: All fields must be filled out.");
            return;
        }
        casefield.clear();
        descriptionfield.clear();
        statusbox.setValue(null);
        dashboardText.setText("Case added successfully.");
        casetableview.getItems().add(b);
    }

    @FXML
    public void onLogOut(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("LogInPage.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = (Stage)(((Node) actionEvent.getSource()).getScene().getWindow());
        stage.setScene(scene);
    }

    @FXML
    public void onViewCase(ActionEvent actionEvent) throws IOException {
        SSDashboard selectedCase = casetableview.getSelectionModel().getSelectedItem();

        if (selectedCase == null) {
            dashboardText.setText("Error: No case selected.");
        } else {
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("SupportStaff2.fxml"));
            Scene scene = new Scene(fxmlLoader.load());
            Stage stage = (Stage) (((Node) actionEvent.getSource()).getScene().getWindow());
            stage.setScene(scene);
        }
    }

    public ArrayList<SSDashboard> getDashb() {
        return dashb;
    }

    public void setDashb(ArrayList<SSDashboard> dashb) {
        this.dashb = dashb;
    }
}