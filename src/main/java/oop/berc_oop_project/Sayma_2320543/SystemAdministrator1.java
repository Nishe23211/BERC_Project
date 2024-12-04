package oop.berc_oop_project.Sayma_2320543;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class SystemAdministrator1 {

    @FXML
    private TableColumn<SystemAdministrator1,String> passwordCol;

    @FXML
    private TextField passwordField;

    @FXML
    private TableView<SystemAdministrator1> userTable;

    @FXML
    private TableColumn<SystemAdministrator1,String> usernameCol;

    @FXML
    private TextField usernameField;

    @FXML
    private TableColumn<SystemAdministrator1,String> usertypeCol;

    @FXML
    private ComboBox<String> usertypeComboBox;

    @FXML
    void onConfirmButtonClick(ActionEvent event) {

    }

}

