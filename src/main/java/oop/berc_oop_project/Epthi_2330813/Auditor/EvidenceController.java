package oop.berc_oop_project.Epthi_2330813.Auditor;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.stage.Stage;
import oop.berc_oop_project.HelloApplication;

import java.io.IOException;

public class EvidenceController {

    @FXML
    private TableColumn<EvidenceController, String> description;

    @FXML
    private TableView<EvidenceController> evidenceTV;

    @FXML
    private TableColumn<EvidenceController, String> nameCol;

    @FXML
    void addButtonClick(ActionEvent event) {

    }

    @FXML
    void deleteButtonClick(ActionEvent event) {

    }

    @FXML
    public void OnbackBC(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("auditdboard.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = (Stage) (((Node) actionEvent.getSource()).getScene().getWindow());
        stage.setScene(scene);
    }
}
