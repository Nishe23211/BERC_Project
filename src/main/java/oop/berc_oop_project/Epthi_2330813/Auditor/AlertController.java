package oop.berc_oop_project.Epthi_2330813.Auditor;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import oop.berc_oop_project.HelloApplication;

import java.io.IOException;

public class AlertController {

    @FXML
    private TableView<Alertitem> alertTV;

    @FXML
    private TableColumn<Alertitem, String> issueCol;

    @FXML
    private TableColumn<Alertitem, String> nameCol;

    private ObservableList<Alertitem> alerts;

    @FXML
    public void initialize() {
        nameCol.setCellValueFactory(new PropertyValueFactory<>("companyName"));
        issueCol.setCellValueFactory(new PropertyValueFactory<>("issueType"));


        alerts = FXCollections.observableArrayList(
                new Alertitem("Company X", "Missed Tariff Deadline"),
                new Alertitem("Company Y", "Non-Compliance with Safety Standards"),
                new Alertitem("Company Z", "Pending License Renewal")
        );

        alertTV.setItems(alerts);
    }


    @FXML
    public void OnbackBC(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("auditdboard.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = (Stage) (((Node) actionEvent.getSource()).getScene().getWindow());
        stage.setScene(scene);
    }
}
