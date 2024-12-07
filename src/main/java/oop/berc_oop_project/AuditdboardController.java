package oop.berc_oop_project;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;

public class AuditdboardController {

    @FXML
    private Label setlabeltext;

    @FXML
    private Label settext;

    @FXML
    void alertButtonClick(ActionEvent actionEvent)throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("alert.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = (Stage)(((Node) actionEvent.getSource()).getScene().getWindow());
        stage.setScene(scene);

    }

    @FXML
    void complianceButtonClick(ActionEvent event) {

    }

    @FXML
    void evidenceButtonClick(ActionEvent event) {

    }

    @FXML
    void logoutButtonClick(ActionEvent event) {

    }

    @FXML
    void onDisputeButtonClick(ActionEvent event) {

    }

    @FXML
    void performanceButtonClick(ActionEvent event) {

    }

    @FXML
    void regulatoryButtonClick(ActionEvent actionEvent)throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("regulatory.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = (Stage)(((Node) actionEvent.getSource()).getScene().getWindow());
        stage.setScene(scene);

    }

    @FXML
    void trainingButtonClick(ActionEvent event) {

    }

}
