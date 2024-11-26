package oop.berc_oop_project;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class SystemAdministrator1 {

    @FXML
    private TableColumn<?, ?> passwordCol;

    @FXML
    private TextField passwordField;

    @FXML
    private TableView<?> userTable;

    @FXML
    private TableColumn<?, ?> usernameCol;

    @FXML
    private TextField usernameField;

    @FXML
    private TableColumn<?, ?> usertypeCol;

    @FXML
    private ComboBox<?> usertypeComboBox;

    @FXML
    void onConfirmButtonClick(ActionEvent event) {

    }

    @FXML
    public void onCreateAccountButton(ActionEvent actionEvent) {
    }
}

