package oop.berc_oop_project.Sayma_2320543;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import oop.berc_oop_project.HelloApplication;

import java.io.IOException;

public class SystemAdministrator7 {

    @javafx.fxml.FXML
    private ComboBox<String> useraccountComboBox;
    @javafx.fxml.FXML
    private Label DisplayText;
    @javafx.fxml.FXML
    private ComboBox<String> taskComboBox;
    @javafx.fxml.FXML
    private TableColumn<SystemAdministratorU7,String> useraccountCol;
    @javafx.fxml.FXML
    private TableColumn<SystemAdministratorU7,String> typeoftaskCol;
    @javafx.fxml.FXML
    private TableView<SystemAdministratorU7> taskTable;

    @FXML
    public void initialize() {
        useraccountComboBox.getItems().addAll("sayma232","nishe123","ikhtara543","epthi789");
        taskComboBox.getItems().addAll("Expert Representative","Policy Maker","Auditor");

        useraccountCol.setCellValueFactory(new PropertyValueFactory<>("useraccount"));
        typeoftaskCol.setCellValueFactory(new PropertyValueFactory<>("typeoftask"));

    }

    @javafx.fxml.FXML
    public void ontaskdetailsButtonClick(ActionEvent actionEvent) {
        String selectedUser = useraccountComboBox.getValue();
        String selectedTask = taskComboBox.getValue();
        if (selectedUser != null && selectedTask != null) {
            DisplayText.setText("Task added" + selectedUser + " with task: " + selectedTask);
        } else if (selectedUser == null) {
            DisplayText.setText("Please select a user.");
        } else {
            DisplayText.setText("Please select a task.");
        }
    }

    @javafx.fxml.FXML
    public void onAddButtonClick(ActionEvent actionEvent) {
        String useraccount = useraccountComboBox.getSelectionModel().getSelectedItem();
        String typeoftask = taskComboBox.getSelectionModel().getSelectedItem();
        SystemAdministratorU7 s = new SystemAdministratorU7(useraccount,typeoftask);
        taskTable.getItems().add(s);
    }

    @javafx.fxml.FXML
    public void onBackButtonClick(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("SystemAdministratorDashboard.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = (Stage)(((Node) actionEvent.getSource()).getScene().getWindow());
        stage.setScene(scene);
    }
}
