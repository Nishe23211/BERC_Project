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

public class Resolution {

    @FXML
    private TableColumn<Dispute, String> ConsCol;

    @FXML
    private TableColumn<Dispute, String> companyCol;

    @FXML
    private TableColumn<Dispute, String> dateCol1;

    @FXML
    private TableColumn<Dispute, String> disputeCOL;
    @FXML
    private TableView<Dispute> resolutionTV;

    @FXML
    private TableColumn<Dispute, String> statusCol;

    private final ObservableList<Dispute> disputes = FXCollections.observableArrayList();

    @FXML
    public void initialize() {

        ConsCol.setCellValueFactory(new PropertyValueFactory<>("consumerName"));
        companyCol.setCellValueFactory(new PropertyValueFactory<>("companyName"));
        disputeCOL.setCellValueFactory(new PropertyValueFactory<>("disputeId"));
        dateCol1.setCellValueFactory(new PropertyValueFactory<>("date"));
        statusCol.setCellValueFactory(new PropertyValueFactory<>("status"));

        disputes.addAll(
                new Dispute("D001", "EnergyCom A", "Shakila Islam", "Resolved", "2024-12-01"),
                new Dispute("D002", "EnergyCom B", "Ekramul ", "Pending", "2024-12-03"),
                new Dispute("D003", "EnergyCom C", "Imamul", "Under Review", "2024-12-05")
        );

        resolutionTV.setItems(disputes);
    }

    @FXML
    public void OnbackBC(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("auditdboard.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = (Stage) (((Node) actionEvent.getSource()).getScene().getWindow());
        stage.setScene(scene);
    }
}
