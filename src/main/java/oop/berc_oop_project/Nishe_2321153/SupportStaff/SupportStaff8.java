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
import java.util.ArrayList;

public class SupportStaff8 {
    @javafx.fxml.FXML
    private Label usermanagement;
    @javafx.fxml.FXML
    private TableView<UserManagement> usertable;
    @javafx.fxml.FXML
    private TableColumn<UserManagement, String> usernamecolumn;
    @javafx.fxml.FXML
    private TableColumn<UserManagement, String> userrolecolumn;
    @javafx.fxml.FXML
    private TextField usernamefield;
    @javafx.fxml.FXML
    private Label userText;
    @javafx.fxml.FXML
    private ComboBox<String> roleCB;
    private ArrayList<UserManagement> management = new ArrayList<>();


    @javafx.fxml.FXML
    public void onEdit(ActionEvent actionEvent) throws IOException {
        UserManagement selectedUser = usertable.getSelectionModel().getSelectedItem();

        if (selectedUser == null) {
            userText.setText("Error: No user selected. Please select a user to edit.");
            return;
        }

        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("SupportStaff8.a.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = (Stage) (((Node) actionEvent.getSource()).getScene().getWindow());
        stage.setScene(scene);
    }

    @javafx.fxml.FXML
    public void onAdd(ActionEvent actionEvent) {
        String username = usernamefield.getText();
        String userrole = roleCB.getSelectionModel().getSelectedItem();
        UserManagement u = new UserManagement(username, userrole);
        usertable.getItems().add(u);

        usernamefield.clear();
        roleCB.setValue("");

    }

    @FXML
    public void initialize() {
        roleCB.getItems().addAll("Admin", "Editor", "Viewer");

        usernamecolumn.setCellValueFactory(new PropertyValueFactory<>("username"));
        userrolecolumn.setCellValueFactory(new PropertyValueFactory<>("userrole"));

    }

    public ArrayList<UserManagement> getManagement() {
        return management;
    }

    public void setManagement(ArrayList<UserManagement> management) {
        this.management = management;
    }

    @FXML
    public void onBack(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("SupportStaffDashboard.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = (Stage) (((Node) actionEvent.getSource()).getScene().getWindow());
        stage.setScene(scene);
    }
}
