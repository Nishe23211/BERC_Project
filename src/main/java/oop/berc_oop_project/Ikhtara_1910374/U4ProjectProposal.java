package oop.berc_oop_project.Ikhtara_1910374;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import oop.berc_oop_project.HelloApplication;

import java.io.IOException;

public class U4ProjectProposal {

    @FXML
    private TextField fx_companyName;

    @FXML
    private DatePicker fx_dateOfApplication;

    @FXML
    private TextField fx_projectName;

    @FXML
    void onSubmitProposal(ActionEvent event) {

    }

    @FXML
    void onGoBack(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Ikhtara_1910374/u4_dashboard.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = (Stage)(((Node) event.getSource()).getScene().getWindow());
        stage.setScene(scene);

    }

}

