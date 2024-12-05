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
    public void onBack(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void onSave(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void onSetTask(ActionEvent actionEvent) {
    }

    @Deprecated
    public void onCancel(ActionEvent actionEvent) {
    }

    @Deprecated
    public void onAssignTo(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("BERCOfficials5.a.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = (Stage)(((Node) actionEvent.getSource()).getScene().getWindow());
        stage.setScene(scene);
    }
}
