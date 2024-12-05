package oop.berc_oop_project.Nishe_2321153;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;
import oop.berc_oop_project.HelloApplication;

import java.io.IOException;

public class BERCOfficialsDashboard {
    @javafx.fxml.FXML
    private DatePicker date;
    @javafx.fxml.FXML
    private TableColumn<BERCOfficialsDashboard, String> namecolumn;
    @javafx.fxml.FXML
    private TableColumn<BERCOfficialsDashboard, String> statuscolumn;
    @javafx.fxml.FXML
    private TextField namefield;
    @javafx.fxml.FXML
    private TextField statusfield;
    @javafx.fxml.FXML
    private TableColumn<BERCOfficialsDashboard, Integer> idcolumn;
    @javafx.fxml.FXML
    private Label BERC;
    @javafx.fxml.FXML
    private Label dash;
    @javafx.fxml.FXML
    private TableView<BERCOfficialsDashboard> dashtable;
    @javafx.fxml.FXML
    private TableColumn<BERCOfficialsDashboard, Integer> datecolumn;
    @javafx.fxml.FXML
    private TextField idfield;

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
    public void onview(ActionEvent actionEvent) {
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
    }
}
