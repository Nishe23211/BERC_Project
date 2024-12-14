package oop.berc_oop_project.Epthi_2330813.Consumer;



import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;
import oop.berc_oop_project.HelloApplication;

import java.io.IOException;

public class PublicinfoController {

    @FXML
    private ComboBox<String> publicinfoComboBox;

    private PublicInfoData publicInfoData = new PublicInfoData();
    @FXML
    private TextArea infoTF;

    @FXML
    public void initialize() {
        publicinfoComboBox.getItems().addAll("Energy Policies", "Consumer Rights");
        publicinfoComboBox.setOnAction(event -> {

            String selectedCategory = publicinfoComboBox.getValue();
            if ("Energy Policies".equals(selectedCategory)) {
                infoTF.setText(publicInfoData.getEnergyPolicies());
            } else if ("Consumer Rights".equals(selectedCategory)) {
                infoTF.setText(publicInfoData.getConsumerRights());
            }
        });
    }

    @FXML
    public void OnbackBC(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("consumer.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = (Stage) (((Node) actionEvent.getSource()).getScene().getWindow());
        stage.setScene(scene);
    }
}
