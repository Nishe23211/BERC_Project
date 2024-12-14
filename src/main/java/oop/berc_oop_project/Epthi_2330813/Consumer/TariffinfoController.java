package oop.berc_oop_project.Epthi_2330813.Consumer;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.stage.Stage;
import oop.berc_oop_project.HelloApplication;

import java.io.IOException;

public class TariffinfoController
{
    @javafx.fxml.FXML
    private TableColumn edateCol;
    @javafx.fxml.FXML
    private TableView tariffTV;
    @javafx.fxml.FXML
    private TableColumn prevrateCol;
    @javafx.fxml.FXML
    private TableColumn tariffCol;
    @javafx.fxml.FXML
    private TableColumn rateCol;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void OnbackBC(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("consumer.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = (Stage) (((Node) actionEvent.getSource()).getScene().getWindow());
        stage.setScene(scene);
    }
}