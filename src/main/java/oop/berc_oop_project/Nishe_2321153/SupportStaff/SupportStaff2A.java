package oop.berc_oop_project.Nishe_2321153.SupportStaff;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;
import oop.berc_oop_project.HelloApplication;

import java.io.IOException;

public class SupportStaff2A {

    @javafx.fxml.FXML
    private Label solutionText;
    @javafx.fxml.FXML
    private TextArea adminsolutionarea;

    @javafx.fxml.FXML
    public void onBack(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("SupportStaff2.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = (Stage) (((Node) actionEvent.getSource()).getScene().getWindow());
        stage.setScene(scene);
    }

    @javafx.fxml.FXML
    public void onUpdate(ActionEvent actionEvent) {
        String solution = adminsolutionarea.getText();
        if (solution == null || solution.trim().isEmpty()) {
            solutionText.setText("Error: Solution cannot be empty.");
            return;
        }
        solutionText.setText("Solution updated successfully.");
        adminsolutionarea.clear();
    }
}
