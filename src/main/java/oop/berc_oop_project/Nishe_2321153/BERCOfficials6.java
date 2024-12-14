package oop.berc_oop_project.Nishe_2321153;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import oop.berc_oop_project.HelloApplication;

import java.io.File;
import java.io.IOException;

public class BERCOfficials6
{
    @javafx.fxml.FXML
    private Label postdraftofregulatory;
    @javafx.fxml.FXML
    private TextArea descriptionarea;
    @javafx.fxml.FXML
    private ComboBox<String> titleCB;
    @javafx.fxml.FXML
    private ListView<String> listview;
    @javafx.fxml.FXML
    private Label publicfeedback;
    @javafx.fxml.FXML
    private TextArea feedbacksummaryarea;
    @javafx.fxml.FXML
    private Label draftText;

    @javafx.fxml.FXML
    public void initialize() {
        titleCB.getItems().addAll(
                "Renewable Energy Guidelines",
                "Electricity Tariff Policy",
                "Environmental Impact Regulation",
                "Consumer Protection Act",
                "Energy Efficiency Standards",
                "Market Competition Framework",
                "Safety Compliance Regulations",
                "Rural Electrification Policy");
        draftText.setText("Draft updated successfully.");
    }

    @javafx.fxml.FXML
    public void onBack(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("BERCOfficialsDashboard.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = (Stage)(((Node) actionEvent.getSource()).getScene().getWindow());
        stage.setScene(scene);
    }

    @javafx.fxml.FXML
    public void onUploadDraft(ActionEvent actionEvent) {
        String draftTitle = descriptionarea.getText();
        if (draftTitle == null || draftTitle.isEmpty()) {
            draftText.setText("Please enter a draft title in the description field.");
            return;
        }
        listview.getItems().add(draftTitle);
        draftText.setText("Draft uploaded: " + draftTitle);
    }

    @javafx.fxml.FXML
    public void onUpdate(ActionEvent actionEvent) {
        String title = titleCB.getValue();
        String description = descriptionarea.getText();
        String feedbackSummary = feedbacksummaryarea.getText();

        if (title == null || title.isEmpty()) {
            draftText.setText("Please select a title.");
            return;
        }

        if (description.isEmpty() || feedbackSummary.isEmpty()) {
            draftText.setText("Please fill in all fields.");
            return;
        }
        draftText.setText("Draft updated successfully.");
    }
}