package oop.berc_oop_project.Nishe_2321153.SupportStaff;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;
import oop.berc_oop_project.HelloApplication;

import java.io.IOException;

public class SupportStaff6A {
    @javafx.fxml.FXML
    private TextArea eventdescriptionarea;
    @javafx.fxml.FXML
    private ListView<String> listview;
    @javafx.fxml.FXML
    private Label addattendees;
    @javafx.fxml.FXML
    private Label attendeesText;
    private ObservableList<String> attendeesList;
    @FXML
    private TextField attendeesfield;
    @FXML
    public void initialize() {
        attendeesList = FXCollections.observableArrayList();
        listview.setItems(attendeesList);
    }
    @FXML
    public void onSave(ActionEvent actionEvent) {
        String eventDescription = eventdescriptionarea.getText().trim();

        if (eventDescription.isEmpty()) {
            attendeesText.setText("Event description cannot be empty.");
            return;
        }
        if (attendeesList.isEmpty()) {
            attendeesText.setText("No attendees added.");
            return;
        }
        attendeesText.setText("Description saved successfully with " + attendeesList.size() + " attendees.");
    }

    @FXML
    public void onAdd(ActionEvent actionEvent) {
        String attendeeName = attendeesfield.getText().trim();

        if (attendeeName.isEmpty()) {
            attendeesText.setText("Attendee name cannot be empty.");
            return;
        }

        if (attendeesList.contains(attendeeName)) {
            attendeesText.setText("Attendee already exists.");
            return;
        }

        attendeesList.add(attendeeName);
        attendeesfield.clear();
    }

    @FXML
    public void onDescription(ActionEvent actionEvent) {
        attendeesText.setText("Fill in the event description.");
        eventdescriptionarea.requestFocus();
    }

    @FXML
    public void onBack(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("SupportStaff6.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = (Stage) (((Node) actionEvent.getSource()).getScene().getWindow());
        stage.setScene(scene);
    }
}
