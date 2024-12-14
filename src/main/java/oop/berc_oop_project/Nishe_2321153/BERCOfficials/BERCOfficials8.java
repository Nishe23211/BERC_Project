package oop.berc_oop_project.Nishe_2321153.BERCOfficials;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import oop.berc_oop_project.HelloApplication;

import java.io.IOException;

public class BERCOfficials8 {
    @javafx.fxml.FXML
    private TableColumn<ManagementArea, String> topicidcolumn;
    @javafx.fxml.FXML
    private Label discussionboard;
    @javafx.fxml.FXML
    private TableView<ManagementArea> discussiontable;
    @javafx.fxml.FXML
    private TableColumn<ManagementArea, String> guidlinescolumn;
    @javafx.fxml.FXML
    private Label ManagementText;
    @javafx.fxml.FXML
    private TextArea guidlinesarea;
    @javafx.fxml.FXML
    private TableColumn<ManagementArea, String> titlecolumn;
    @javafx.fxml.FXML
    private Label setupnewdiscussionboard;
    @javafx.fxml.FXML
    private TextArea titlerea;
    @javafx.fxml.FXML
    private TextField idfield;

    @FXML
    public void initialize() {
        topicidcolumn.setCellValueFactory(new PropertyValueFactory<>("title"));
        titlecolumn.setCellValueFactory(new PropertyValueFactory<>("description"));
        guidlinescolumn.setCellValueFactory(new PropertyValueFactory<>("guidlines"));
    }

    @javafx.fxml.FXML
    public void onBack(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("BERCOfficialsDashboard.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = (Stage)(((Node) actionEvent.getSource()).getScene().getWindow());
        stage.setScene(scene);
    }

    @javafx.fxml.FXML
    public void onCreateBoard(ActionEvent actionEvent) {
        String topicid = idfield.getText();
        String topictitle = titlerea.getText();
        String guidlines = guidlinesarea.getText();
        ManagementArea m = new ManagementArea(topicid,topictitle,guidlines);


        if (topicid.isEmpty() || topictitle.isEmpty() || guidlines.isEmpty()) {
            ManagementText.setText("Error: All fields must be filled out.");
            return;
        }
        idfield.clear();
        titlerea.clear();
        guidlinesarea.clear();
        ManagementText.setText("Topic added successfully");
        discussiontable.getItems().add(m);
    }

    @javafx.fxml.FXML
    public void onReviewComment(ActionEvent actionEvent) {
        ManagementText.setText("Reviewing comments for selected discussion topic");
    }

    @javafx.fxml.FXML
    public void onPostTopic(ActionEvent actionEvent) {
        ManagementText.setText("Posting the selected topic");
    }
}
