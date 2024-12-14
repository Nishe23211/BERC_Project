package oop.berc_oop_project.Sayma_2320543;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import oop.berc_oop_project.HelloApplication;

import java.io.IOException;

public class SystemAdministrator6 {
    @javafx.fxml.FXML
    private ComboBox<String> atleastonenumberComboBox;
    @javafx.fxml.FXML
    private TextField passwordField;
    @javafx.fxml.FXML
    private ComboBox<String> minimumlenghtComboBox;
    @javafx.fxml.FXML
    private TextField nameField;

    @FXML
    public void initialize() {
        minimumlenghtComboBox.getItems().addAll("Eight Letter","Nine Letter","Ten Letter");
        atleastonenumberComboBox.getItems().addAll("one","Two","Three");
    }

    @javafx.fxml.FXML
    public void onAddButtonClick(ActionEvent actionEvent) {
        String minimumlength = minimumlenghtComboBox.getSelectionModel().getSelectedItem();
        String atleastonenumber = atleastonenumberComboBox.getSelectionModel().getSelectedItem();
        String name = nameField.getText();
        String password = passwordField.getText();

    }

    @FXML
    public void onBackButtonClick(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("SystemAdministratorDashboard.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = (Stage)(((Node) actionEvent.getSource()).getScene().getWindow());
        stage.setScene(scene);
    }
}
