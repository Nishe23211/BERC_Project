package oop.berc_oop_project.Nishe_2321153;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;
import oop.berc_oop_project.HelloApplication;

import java.io.IOException;

public class SupportStaff2 {
    @javafx.fxml.FXML
    private Label casedetails;
    @javafx.fxml.FXML
    private TextArea detailsarea;
    @javafx.fxml.FXML
    private Label caseText;

    @javafx.fxml.FXML
    public void onResolve(ActionEvent actionEvent) throws IOException {
        String caseDetails = detailsarea.getText();

        if (caseDetails.isEmpty()) {
            caseText.setText("Error: No case details provided.");
        } else {
            detailsarea.clear();

            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("SupportStaff2.a.fxml"));
            Scene scene = new Scene(fxmlLoader.load());
            Stage stage = (Stage) (((Node) actionEvent.getSource()).getScene().getWindow());
            stage.setScene(scene);
        }
    }
}
