package oop.berc_oop_project.Ikhtara_1910374;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import oop.berc_oop_project.HelloApplication;

import java.io.IOException;
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


    public void initialize(){
        fx_userCombo.getItems().addAll("Legal Expert", "Representative");

        fx_taskTC.setCellValueFactory(new PropertyValueFactory<>("Task"));
        fx_userTC.setCellValueFactory(new PropertyValueFactory<>("User"));
        fx_deadlineTC.setCellValueFactory(new PropertyValueFactory<>("Deadline"));

    }


    @FXML
    void onAssignTask(ActionEvent event) {
        String task = fx_task.getText();
        String user = fx_userCombo.getValue();
        LocalDate deadline = this.fx_deadline.getValue();

        if (task.isBlank() || user == null || deadline == null){
            return;}

        Task a = new Task(task, user, deadline);
        fx_table.getItems().add(a);


    }



    @FXML
    void onGoBack(ActionEvent event) throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Ikhtara_1910374/u3_dashboard.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = (Stage)(((Node) event.getSource()).getScene().getWindow());
        stage.setScene(scene);

    }


}

