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
import java.time.LocalDate;
import java.util.ArrayList;

public class BERCOfficials2 {
    @javafx.fxml.FXML
    private TableColumn<Applications, String> applicantNameColumn;
    @javafx.fxml.FXML
    private TableColumn<Applications, String> statuscolumn;
    @javafx.fxml.FXML
    private TableView<Applications> applicationTable;
    @javafx.fxml.FXML
    private TableColumn<Applications, Integer> applicationIdColumn;
    @javafx.fxml.FXML
    private Label pendingapplicationsandproposals;
    @javafx.fxml.FXML
    private TextField namefield;
    @javafx.fxml.FXML
    private ComboBox<String> statusCB;
    @javafx.fxml.FXML
    private TextField idfield;
    @javafx.fxml.FXML
    private Label applicantText;
    private ArrayList<Applications> applicant = new ArrayList<>();
    @FXML
    public void initialize() {
        statusCB.getItems().addAll("Pending", "Reviewed", "Approved", "Rejected");

        applicationIdColumn.setCellValueFactory(new PropertyValueFactory<>("applicantid"));
        applicantNameColumn.setCellValueFactory(new PropertyValueFactory<>("applicantname"));
        statuscolumn.setCellValueFactory(new PropertyValueFactory<>("status"));
    }

    @FXML
    public void onReview(ActionEvent actionEvent) throws IOException {
        Applications application = applicationTable.getSelectionModel().getSelectedItem();

        if (application == null) {
            applicantText.setText("Error: No case selected.");
        } else {
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("SupportStaff2.fxml"));
            Scene scene = new Scene(fxmlLoader.load());
            Stage stage = (Stage) (((Node) actionEvent.getSource()).getScene().getWindow());
            stage.setScene(scene);
        }
    }

    @javafx.fxml.FXML
    public void onBack(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("BERCOfficialsDashboard.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = (Stage) (((Node) actionEvent.getSource()).getScene().getWindow());
        stage.setScene(scene);
    }

    @javafx.fxml.FXML
    public void onAdd(ActionEvent actionEvent) {
        int id = Integer.parseInt(idfield.getText());
        String name  = namefield.getText();
        String status = statusCB.getSelectionModel().getSelectedItem();
        Applications d = new Applications(id,name,status);

        if (id == 0 || name.isEmpty() || status == null) {
            applicantText.setText("Error: All fields must be filled out.");
            return;
        }
        namefield.clear();
        idfield.clear();
        statusCB.setValue(null);
        applicantText.setText("File added successfully.");
        applicationTable.getItems().add(d);
    }

}
