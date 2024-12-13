package oop.berc_oop_project.Nishe_2321153;

import javafx.event.ActionEvent;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class SupportStaff8A {
    @javafx.fxml.FXML
    private Label departmentaccess;
    @javafx.fxml.FXML
    private TextField usernamefield;
    @javafx.fxml.FXML
    private Label managepermissions;
    @javafx.fxml.FXML
    private Label userText;
    @javafx.fxml.FXML
    private CheckBox salesbox;
    @javafx.fxml.FXML
    private CheckBox restrict;
    @javafx.fxml.FXML
    private CheckBox itbox;
    @javafx.fxml.FXML
    private Label username;
    @javafx.fxml.FXML
    private CheckBox hrbox;

    @javafx.fxml.FXML
    public void onSave(ActionEvent actionEvent) {
        String username = usernamefield.getText();
        StringBuilder message = new StringBuilder();

        message.append("User: ").append(username).append(" has access to: ");
        if (restrict.isSelected()) {
            message.append("(Restricted Access)");
        } else {
            if (salesbox.isSelected()) message.append("Sales, ");
            if (hrbox.isSelected()) message.append("HR, ");
            if (itbox.isSelected()) message.append("IT ");
        }

        if (!salesbox.isSelected() && !hrbox.isSelected() && !itbox.isSelected() && !restrict.isSelected()) {
            message.append("No permissions granted.");
        }
        if (message.toString().endsWith(", ")) {
            message.setLength(message.length() - 2);
        }
        userText.setText(message.toString());
    }
}
