package oop.berc_oop_project.Nishe_2321153;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.stage.Stage;
import oop.berc_oop_project.HelloApplication;

import java.io.IOException;

public class BERCOfficials2 {
    @javafx.fxml.FXML
    private TableColumn<BERCOfficials2, String> applicantNameColumn;
    @javafx.fxml.FXML
    private TableColumn<BERCOfficials2, String> statuscolumn;
    @javafx.fxml.FXML
    private TableView<BERCOfficials2> applicationTable;
    @javafx.fxml.FXML
    private TableColumn<BERCOfficials2, Integer> applicationIdColumn;
    @javafx.fxml.FXML
    private Label pendingapplicationsandproposals;

    @javafx.fxml.FXML
    public void onReview(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("BERCOfficials2.a.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = (Stage) (((Node) actionEvent.getSource()).getScene().getWindow());
        stage.setScene(scene);
    }
}
