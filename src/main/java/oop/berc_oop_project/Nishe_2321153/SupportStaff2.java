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
    private TextArea solutionarea;

    @javafx.fxml.FXML
    public void onResolve(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void onEscalate(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("SupportStaff2.a.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = (Stage)(((Node) actionEvent.getSource()).getScene().getWindow());
        stage.setScene(scene);
    }
}
