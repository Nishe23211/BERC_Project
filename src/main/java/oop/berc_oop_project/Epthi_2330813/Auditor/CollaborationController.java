package oop.berc_oop_project.Epthi_2330813.Auditor;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import oop.berc_oop_project.HelloApplication;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CollaborationController {

    @FXML
    private TableView<Message> messageTV;

    @FXML
    private TableColumn<Message, String> msgCol;

    @FXML
    private TableColumn<Message, String> senderCol;

    private List<Message> messages = new ArrayList<>();
    @FXML
    private TextField SenderTF;
    @FXML
    private TextField messageTF11;


    @FXML
    public void initialize() {
        msgCol.setCellValueFactory(cellData -> new javafx.beans.property.SimpleStringProperty(cellData.getValue().getMessage()));
        senderCol.setCellValueFactory(cellData -> new javafx.beans.property.SimpleStringProperty(cellData.getValue().getSender()));
        messageTV.getItems().setAll(messages);
    }


    @FXML
    void sendButtonClick(ActionEvent event) {
        String sender = SenderTF.getText();
        String message = messageTF11.getText();

        if (!sender.isEmpty() && !message.isEmpty()) {
            Message newMessage = new Message(sender, message);
            messages.add(newMessage);
            messageTV.getItems().setAll(messages);
            SenderTF.clear();
            messageTF11.clear();
        }
    }
    @FXML
    public void OnbackBC(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("auditdboard.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = (Stage) (((Node) actionEvent.getSource()).getScene().getWindow());
        stage.setScene(scene);
    }
}
