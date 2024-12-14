package oop.berc_oop_project.Ikhtara_1910374;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

import java.time.LocalDate;

public class U3TaskDash {

    @FXML
    private DatePicker fx_deadline;

    @FXML
    private TableColumn<Task, LocalDate> fx_deadlineTC;

    @FXML
    private TableView<Task> fx_table;

    @FXML
    private TextField fx_task;

    @FXML
    private TableColumn<Task, String> fx_taskTC;

    @FXML
    private ComboBox<String> fx_userCombo;

    @FXML
    private TableColumn<Task, String> fx_userTC;

    @FXML
    void onAssignTask(ActionEvent event) {

    }

    @FXML
    void onGoBack(ActionEvent event) {

    }

}

