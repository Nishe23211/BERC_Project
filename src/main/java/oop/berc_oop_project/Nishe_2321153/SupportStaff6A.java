package oop.berc_oop_project.Nishe_2321153;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

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
}
