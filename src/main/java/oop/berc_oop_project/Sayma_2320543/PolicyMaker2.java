package oop.berc_oop_project.Sayma_2320543;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import oop.berc_oop_project.HelloApplication;

import java.io.IOException;

public class PolicyMaker2 {
    @javafx.fxml.FXML
    private TextField newpasswordField;
    @javafx.fxml.FXML
    private TextField resetpasswordField;
    @javafx.fxml.FXML
    private TableColumn<PolicyMaker2,Integer> otpcodeCol;
    @javafx.fxml.FXML
    private TextField entercodeField;
    @javafx.fxml.FXML
    private TableView<PolicyMaker2> otpcodeTable;

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
