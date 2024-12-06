package oop.berc_oop_project.Sayma_2320543;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

public class SystemAdministrator2 {

    @javafx.fxml.FXML
    private TableColumn<User2,String> typeCol;
    @javafx.fxml.FXML
    private TableColumn<User2,String> user2nameCol;
    @javafx.fxml.FXML
    private ComboBox<String> typeComboBox;
    @javafx.fxml.FXML
    private TextField nameField;
    @javafx.fxml.FXML
    private TextField passwordField;
    @javafx.fxml.FXML
    private TableColumn<User2,String> passwordCol;
    @javafx.fxml.FXML
    private TableView<User2> user2Table;

    @FXML
    public void initialize() {
        typeComboBox.getItems().addAll("Expert Representative","Policy Maker","Auditor");

        typeCol.setCellValueFactory(new PropertyValueFactory<>("type"));
        user2nameCol.setCellValueFactory(new PropertyValueFactory<>("name"));
        passwordCol.setCellValueFactory(new PropertyValueFactory<>("password"));
    }


    @javafx.fxml.FXML
    public void onAddButtonClick(ActionEvent actionEvent) {
        String type = typeComboBox.getSelectionModel().getSelectedItem();
        String user2Name = nameField.getText();
        String password = passwordField.getText();
        User2 u = new User2(type,user2Name,password);
        user2Table.getItems().add(u);

    }
}
