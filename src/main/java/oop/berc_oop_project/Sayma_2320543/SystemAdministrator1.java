package oop.berc_oop_project.Sayma_2320543;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

public class SystemAdministrator1 {

    @FXML
    private TableColumn<User1,String> passwordCol;

    @FXML
    private TextField passwordField;
    @FXML
    private TableColumn<User1,String> typeCol;
    @FXML
    private TableColumn<User1,String> user1nameCol;
    @FXML
    private ComboBox<String> typeComboBox;
    @FXML
    private TextField nameField;
    @FXML
    private TableView<User1> user1Table;

    @FXML
    public void initialize() {
        typeComboBox.getItems().addAll("Expert Representative","Policy Maker","Auditor","Legal Expert","Representative");

        typeCol.setCellValueFactory(new PropertyValueFactory<>("type"));
        user1nameCol.setCellValueFactory(new PropertyValueFactory<>("name"));
        passwordCol.setCellValueFactory(new PropertyValueFactory<>("password"));
    }

    @FXML
    public void onConfirmButtonClick(ActionEvent event) {
        String type = typeComboBox.getSelectionModel().getSelectedItem();
        String user1Name = nameField.getText();
        String password = passwordField.getText();
        User1 u = new User1(type,user1Name,password);
        user1Table.getItems().add(u);


    }

}

