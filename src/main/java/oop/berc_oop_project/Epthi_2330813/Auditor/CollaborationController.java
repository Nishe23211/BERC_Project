package oop.berc_oop_project.Epthi_2330813.Auditor;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class CollaborationController {

    @FXML
    private TextField messageTF;

    @FXML
    private TableView<CollaborationController> messageTV;

    @FXML
    private TableColumn<CollaborationController, String > msgCol;

    @FXML
    private TableColumn<CollaborationController, String> senderCol;

    @FXML
    void sendButtonClick(ActionEvent event) {

    }

}
