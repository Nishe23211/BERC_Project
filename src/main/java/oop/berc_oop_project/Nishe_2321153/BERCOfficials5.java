package oop.berc_oop_project.Nishe_2321153;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import oop.berc_oop_project.HelloApplication;

import java.io.IOException;
import java.time.LocalDate;

public class BERCOfficials5 {

    @javafx.fxml.FXML
    private DatePicker Dateofalert;
    @javafx.fxml.FXML
    private TextArea contentarea;
    @javafx.fxml.FXML
    private TextField alerttypefield;
    @javafx.fxml.FXML
    private Label alertdetails;
    @javafx.fxml.FXML
    private TextField alertidfield;
    @javafx.fxml.FXML
    private Label alertText;

    @javafx.fxml.FXML
    public void onBack(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("BERCOfficialsDashboard.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = (Stage)(((Node) actionEvent.getSource()).getScene().getWindow());
        stage.setScene(scene);
    }
    @javafx.fxml.FXML
    public void onSave(ActionEvent actionEvent) {
        String alertId = alertidfield.getText();
        String alertType = alerttypefield.getText();
        LocalDate alertDate = Dateofalert.getValue();
        String content = contentarea.getText();

        if (alertId.isEmpty() || alertType.isEmpty() || alertDate == null || content.isEmpty()) {
            alertText.setText("All fields must be filled.");
            alertText.setStyle("-fx-text-fill: red;");
        } else {
            alertText.setText("Alert saved successfully.");
            alertText.setStyle("-fx-text-fill: green;");
        }
    }
    @javafx.fxml.FXML
    public void onSetTask(ActionEvent actionEvent) throws IOException {
        alertText.setText("Task has been set for the alert.");
        alertText.setStyle("-fx-text-fill: blue;");
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("BERCOfficials5.a.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = (Stage)(((Node) actionEvent.getSource()).getScene().getWindow());
        stage.setScene(scene);
    }
}
