package oop.berc_oop_project;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.IOException;

public class PolicyMaker2 {
    @javafx.fxml.FXML
    private TextField newpasswordField;
    @javafx.fxml.FXML
    private TextField resetpasswordField;
    @javafx.fxml.FXML
    private TableColumn<String,String> otpcodeCol;
    @javafx.fxml.FXML
    private TextField entercodeField;
    @javafx.fxml.FXML
    private TableView<String> otpcodeTable;






    @javafx.fxml.FXML
    public void onSentOtpCodeButtonClick(ActionEvent actionEvent) {

    }




    @javafx.fxml.FXML
    public void onAddButtonClick(ActionEvent actionEvent) {


    }

    @javafx.fxml.FXML
    public void onBackButtonClick(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("PolicyMakerDashboard.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = (Stage)(((Node) actionEvent.getSource()).getScene().getWindow());
        stage.setScene(scene);
    }

}





