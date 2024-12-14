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

public class BERCOfficials2A {
    @javafx.fxml.FXML
    private Label applicationdetails;
    @javafx.fxml.FXML
    private TextField namefield;
    @javafx.fxml.FXML
    private TextField statusfield;
    @javafx.fxml.FXML
    private TextArea notesarea;
    @javafx.fxml.FXML
    private TextArea submitteddocumentarea;
    @javafx.fxml.FXML
    private TextField idfield;
    @javafx.fxml.FXML
    private Label applicantText;

    @javafx.fxml.FXML
    public void onReject(ActionEvent actionEvent) {
        String id = idfield.getText();

        if (id.isEmpty()) {
            applicantText.setText("Please enter a valid application ID to reject.");
            return;
        }
        applicantText.setText("Application ID " + id + " rejected successfully.");
        clearFields();
    }
    private void clearFields() {
    }

    @javafx.fxml.FXML
    public void onBack(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("BERCOfficials2.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = (Stage) (((Node) actionEvent.getSource()).getScene().getWindow());
        stage.setScene(scene);
    }

    @javafx.fxml.FXML
    public void onRequestClarification(ActionEvent actionEvent) {
        String name = namefield.getText();
        String id = idfield.getText();
        String documents = submitteddocumentarea.getText();

        if (name.isEmpty() || id.isEmpty() || documents.isEmpty()) {
            applicantText.setText("Please ensure all fields are filled before requesting clarification.");
            return;
        }
        applicantText.setText("Clarification requested for application ID: " + id);
    }

    @javafx.fxml.FXML
    public void onApprove(ActionEvent actionEvent) {
        String id = idfield.getText();

        if (id.isEmpty()) {
            applicantText.setText("Please enter a valid application ID to approve.");
            return;
        }

        applicantText.setText("Application ID " + id + " approved successfully.");
        clearFields();
    }
}
