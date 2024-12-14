package oop.berc_oop_project.Nishe_2321153.BERCOfficials;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;
import oop.berc_oop_project.HelloApplication;

import java.io.IOException;
import java.time.LocalDate;

public class BERCOfficials5A {
    @javafx.fxml.FXML
    private TextArea descriptionarea;
    @javafx.fxml.FXML
    private TextField tasktitlefield;
    @javafx.fxml.FXML
    private DatePicker duedate;
    @javafx.fxml.FXML
    private Label assigntaskforalert;
    @javafx.fxml.FXML
    private ComboBox<String> assigncombobox;
    @javafx.fxml.FXML
    private Label assignText;

    @javafx.fxml.FXML
    public void onCancel(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("BERCOfficials5.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = (Stage) (((Node) actionEvent.getSource()).getScene().getWindow());
        stage.setScene(scene);
    }

    @javafx.fxml.FXML
    public void onAssignTask(ActionEvent actionEvent) {
        String taskTitle = tasktitlefield.getText();
        String description = descriptionarea.getText();
        LocalDate dueDate = duedate.getValue();
        String assignedTo = assigncombobox.getValue();

        if (taskTitle.isEmpty() || description.isEmpty() || dueDate == null || assignedTo == null) {
            assignText.setText("All fields must be filled before assigning the task.");
        } else if (dueDate.isBefore(LocalDate.now())) {
            assignText.setText("Due date cannot be in the past.");
        } else {
            assignText.setText("Task assigned successfully to " + assignedTo + ".");
        }
    }

    @javafx.fxml.FXML
    public void initialize() {
        assigncombobox.getItems().addAll("Manager", "TeamLeader", "Analyst", "Developer", "Admin");
    }
}
