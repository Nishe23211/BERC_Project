package oop.berc_oop_project.Nishe_2321153.SupportStaff;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import oop.berc_oop_project.HelloApplication;

import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;

public class SupportStaff6 {
    @javafx.fxml.FXML
    private Label calendarorevent;
    @javafx.fxml.FXML
    private TableColumn<Events, String> typecolumn;
    @javafx.fxml.FXML
    private TableView<Events> eventtableview;
    @javafx.fxml.FXML
    private TableColumn<Events, String> titlecolumn;
    @javafx.fxml.FXML
    private TableColumn<Events, LocalDate> datecolumn;
    @javafx.fxml.FXML
    private Label eventText;
    @javafx.fxml.FXML
    private TextField tiitlefield;
    @javafx.fxml.FXML
    private ComboBox<String> typeCB;
    @javafx.fxml.FXML
    private DatePicker doe;
    private final ArrayList<Events> event = new ArrayList<>();

    @FXML
    public void initialize() {
        typeCB.getItems().addAll("Meeting", "Deadline", "Conference", "Training");

        titlecolumn.setCellValueFactory(new PropertyValueFactory<>("eventTitle"));
        typecolumn.setCellValueFactory(new PropertyValueFactory<>("eventTypebox"));
        datecolumn.setCellValueFactory(new PropertyValueFactory<>("doe"));
    }

    @javafx.fxml.FXML
    public void onScheduleEvent(ActionEvent actionEvent) throws IOException {
        Events events = eventtableview.getSelectionModel().getSelectedItem();

        if (events == null) {
            eventText.setText("No events to schedule");
        } else {
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("SupportStaff6.a.fxml"));
            Scene scene = new Scene(fxmlLoader.load());
            Stage stage = (Stage) (((Node) actionEvent.getSource()).getScene().getWindow());
            stage.setScene(scene);
        }
    }

    @javafx.fxml.FXML
    public void onAdd(ActionEvent actionEvent) {
        String EventTitle = tiitlefield.getText();
        String EventType = typeCB.getSelectionModel().getSelectedItem();
        LocalDate Date = doe.getValue();
        Events u = new Events(EventTitle,EventType,Date);

        if (EventTitle == null || EventTitle.isEmpty() || EventType == null || Date == null) {
            eventText.setText("Error: All fields must be filled out.");
            return;
        }
        tiitlefield.clear();
        typeCB.setValue("");
        doe.setValue(null);
        eventtableview.getItems().add(u);
    }

    @FXML
    public void onBack(ActionEvent actionEvent) throws IOException {FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("SupportStaffDashboard.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = (Stage) (((Node) actionEvent.getSource()).getScene().getWindow());
        stage.setScene(scene);

    }
}
