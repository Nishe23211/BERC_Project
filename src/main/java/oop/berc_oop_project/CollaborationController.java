package oop.berc_oop_project;

import javafx.event.ActionEvent;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class CollaborationController
{
    @javafx.fxml.FXML
    private TableColumn senderCol;
    @javafx.fxml.FXML
    private TextField messageTF;
    @javafx.fxml.FXML
    private TableView messageTV;
    @javafx.fxml.FXML
    private TableColumn msgCol;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void onsendButtonClick(ActionEvent actionEvent) {
    }
}