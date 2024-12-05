package oop.berc_oop_project.Nishe_2321153;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.stage.Stage;
import oop.berc_oop_project.HelloApplication;

import java.io.IOException;
import java.time.LocalDate;

public class SupportStaff1 {

    @javafx.fxml.FXML
    private Label systemlogs;
    @javafx.fxml.FXML
    private TableColumn<SupportStaff1, LocalDate> timestampcolumn;
    @javafx.fxml.FXML
    private ComboBox<String> filterCB;
    @javafx.fxml.FXML
    private TableView<SupportStaff1> tableview;
    @javafx.fxml.FXML
    private TableColumn<SupportStaff1, String> logcolumn;
    @javafx.fxml.FXML
    private TableColumn<SupportStaff1, String> incidentcolumn;

    @javafx.fxml.FXML
    public void onFilter(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void onViewLogDetails(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("SupportStaff1.a.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = (Stage)(((Node) actionEvent.getSource()).getScene().getWindow());
        stage.setScene(scene);
    }

    @Deprecated
    public void onViewReport(ActionEvent actionEvent) {
    }
}
