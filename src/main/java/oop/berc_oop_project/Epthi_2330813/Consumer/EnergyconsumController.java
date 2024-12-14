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

public class EnergyconsumController {

    @FXML
    private TableColumn<tracker, String> costCol;

    @FXML
    private TableColumn<tracker, String> energyCol;

    @FXML
    private TableView<tracker> energyTV;

    @FXML
    private TableColumn<tracker, String> monthCol;

    private ObservableList<tracker> Useage;

    @FXML
    public void initialize() {
        monthCol.setCellValueFactory(new PropertyValueFactory<>("month"));
        energyCol.setCellValueFactory(new PropertyValueFactory<>("energyUsed"));
        costCol.setCellValueFactory(new PropertyValueFactory<>("cost"));

        Useage = FXCollections.observableArrayList(
                new tracker("January", "500 kWh", "$50"),
                new tracker("February", "600 kWh", "$60"),
                new tracker("March", "550 kWh", "$55"),
                new tracker("April", "450 kWh", "$45"),
                new tracker("May", "700 kWh", "$70"),
                new tracker("June", "620 kWh", "$62"),
                new tracker("July", "680 kWh", "$68"),
                new tracker("August", "590 kWh", "$59"),
                new tracker("September", "540 kWh", "$54"),
                new tracker("October", "710 kWh", "$71"),
                new tracker("November", "650 kWh", "$65"),
                new tracker("December", "750 kWh", "$75")
        );

        energyTV.setItems(Useage);
    }

    @FXML
    public void OnbackBC(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("consumer.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = (Stage) (((Node) actionEvent.getSource()).getScene().getWindow());
        stage.setScene(scene);
    }
}
