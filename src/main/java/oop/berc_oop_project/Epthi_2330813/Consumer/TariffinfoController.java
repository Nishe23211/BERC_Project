package oop.berc_oop_project.Epthi_2330813.Consumer;

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

public class TariffinfoController {

    @FXML
    private TableColumn<TariffUpdate, String> edateCol;

    @FXML
    private TableColumn<TariffUpdate, String> prevrateCol;

    @FXML
    private TableColumn<TariffUpdate, String> rateCol;

    @FXML
    private TableColumn<TariffUpdate, String> tariffCol;

    @FXML
    private TableView<TariffUpdate> tariffTV;

    private ObservableList<TariffUpdate> Update;

    @FXML
    public void initialize() {
        tariffCol.setCellValueFactory(new PropertyValueFactory<>("tariffType"));
        rateCol.setCellValueFactory(new PropertyValueFactory<>("currentRate"));
        prevrateCol.setCellValueFactory(new PropertyValueFactory<>("prevRate"));
        edateCol.setCellValueFactory(new PropertyValueFactory<>("date"));

        Update = FXCollections.observableArrayList(
                new TariffUpdate("Residential", "$0.10", "$0.08", "01/01/2024"),
                new TariffUpdate("Commercial", "$0.15", "$0.12", "01/01/2024"),
                new TariffUpdate("Industrial", "$0.20", "$0.18", "01/01/2024"),
                new TariffUpdate("Residential", "$0.11", "$0.10", "01/02/2024"),
                new TariffUpdate("Commercial", "$0.16", "$0.14", "01/02/2024"),
                new TariffUpdate("Industrial", "$0.21", "$0.19", "01/02/2024")
        );

        tariffTV.setItems(Update);
    }

    @FXML
    public void OnbackBC(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("consumer.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = (Stage) (((Node) actionEvent.getSource()).getScene().getWindow());
        stage.setScene(scene);
    }
}
