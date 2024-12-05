package oop.berc_oop_project.Nishe_2321153;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.stage.Stage;
import oop.berc_oop_project.HelloApplication;

import java.io.IOException;
import java.time.LocalDate;

public class SupportStaff6 {
    @javafx.fxml.FXML
    private Label calendarorevent;
    @javafx.fxml.FXML
    private TableColumn<SupportStaff6, String> typecolumn;
    @javafx.fxml.FXML
    private TableView<SupportStaff6> eventtableview;
    @javafx.fxml.FXML
    private TableColumn<SupportStaff6, String> titlecolumn;
    @javafx.fxml.FXML
    private TableColumn<SupportStaff6, LocalDate> datecolumn;

    @javafx.fxml.FXML
    public void onScheduleEvent(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("SupportStaff6.a.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = (Stage)(((Node) actionEvent.getSource()).getScene().getWindow());
        stage.setScene(scene);
    }
}
