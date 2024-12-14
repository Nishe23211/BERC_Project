package oop.berc_oop_project.Nishe_2321153.BERCOfficials;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import oop.berc_oop_project.HelloApplication;

import java.io.IOException;

public class BERCOfficials4A {
    @javafx.fxml.FXML
    private Label filesreview;
    @javafx.fxml.FXML
    private TextArea contentarea;
    @javafx.fxml.FXML
    private TextArea notesarea;
    @javafx.fxml.FXML
    private TextField namefield;
    @javafx.fxml.FXML
    private Label fileText;

    @javafx.fxml.FXML
    public void onSaveNotes(ActionEvent actionEvent) {
        String fileName = namefield.getText();
        String fileContent = contentarea.getText();
        String notes = notesarea.getText();

        if (fileName.isEmpty() || fileContent.isEmpty() || notes.isEmpty()) {
            fileText.setText("All fields must be filled before saving.");
            fileText.setStyle("-fx-text-fill: red;");
        } else {
            fileText.setText("Notes saved successfully.");
            fileText.setStyle("-fx-text-fill: green;");
        }
    }

    @javafx.fxml.FXML
    public void onCloseFiles(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("BERCOfficials4.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = (Stage)(((Node) actionEvent.getSource()).getScene().getWindow());
        stage.setScene(scene);
    }
}
