package oop.berc_oop_project.Nishe_2321153;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;
import oop.berc_oop_project.HelloApplication;

import java.io.IOException;
import java.time.LocalDate;

public class BERCOfficials8 {
    @javafx.fxml.FXML
    private TextArea descriptionarea;
    @javafx.fxml.FXML
    private TableColumn<ManagementArea, Integer> topicidcolumn;
    @javafx.fxml.FXML
    private Label discussionboard;
    @javafx.fxml.FXML
    private TableView<ManagementArea> discussiontable;
    @javafx.fxml.FXML
    private TextField titlefield;
    @javafx.fxml.FXML
    private TextArea guidlinesarea;
    @javafx.fxml.FXML
    private TableColumn<ManagementArea, String> titlecolumn;
    @javafx.fxml.FXML
    private Label setupnewdiscussionboard;
    @javafx.fxml.FXML
    private TableColumn<ManagementArea, String> commentcolumn;
    @javafx.fxml.FXML
    private Label ManagementText;

    @javafx.fxml.FXML
    public void onCreateBoard(ActionEvent actionEvent) {
        String title  = titlefield.getText();
        String description = descriptionarea.getText();
        String guidlines = guidlinesarea.getText();
        ManagementArea d = new ManagementArea(title,description,guidlines);

        if (title.isEmpty() || description.isEmpty() || guidlines.isEmpty()) {
            ManagementText.setText("Error: All fields must be filled out.");
            return;
        }
        titlefield.clear();
        descriptionarea.clear();
        guidlinesarea.clear();

        ManagementText.setText("File added successfully.");
        discussiontable.getItems().add(d);
    }

    @javafx.fxml.FXML
    public void onPostTopic(ActionEvent actionEvent) {
        ManagementText.setText("Posting the selected topic.");
    }

    @javafx.fxml.FXML
    public void onReviewComment(ActionEvent actionEvent) {
        ManagementText.setText("Reviewing comments for selected discussion topic.");
    }

    @javafx.fxml.FXML
    public void onBack(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("BERCOfficialsDashboard.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = (Stage)(((Node) actionEvent.getSource()).getScene().getWindow());
        stage.setScene(scene);
    }
}
