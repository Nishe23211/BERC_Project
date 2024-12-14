package oop.berc_oop_project.Epthi_2330813.Consumer;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import javafx.fxml.FXMLLoader;
import java.io.IOException;

public class FaqController {

    @FXML
    private ComboBox<String> typeCB;
    @FXML
    private Label settext;


    @FXML
    public void initialize() {
        typeCB.getItems().addAll("Bill Payments", "Dispute Resolution", "Energy Subsidy Application");
    }


    @FXML
    public void onCategorySelected(ActionEvent event) {
        String selectedCategory = typeCB.getSelectionModel().getSelectedItem();
        if (selectedCategory != null) {
            switch (selectedCategory) {
                case "Bill Payments":
                    settext.setText("To pay your bill, follow these steps: \n1. Log in to your account.\n2. Go to the 'Bill Payment' section.\n3. Select your payment method and proceed.");
                    break;
                case "Dispute Resolution":
                    settext.setText("If you have a dispute, follow these steps: \n1. Go to the 'Dispute Resolution' section.\n2. Fill out the dispute form.\n3. Submit the form for review.");
                    break;
                case "Energy Subsidy Application":
                    settext.setText("To apply for an energy subsidy: \n1. Go to the 'Energy Subsidy' section.\n2. Fill out the application form.\n3. Submit your details for approval.");
                    break;
                default:
                    settext.setText("Select a category to view the instructions.");
                    break;
            }
        }
    }

    @FXML
    public void onBackButtonClick(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("consumer.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = (Stage) (((Node) actionEvent.getSource()).getScene().getWindow());
        stage.setScene(scene);
    }
}
