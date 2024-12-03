package Sayma_2320543;

import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class SystemAdministrator2 {
    @javafx.fxml.FXML
    private TextField usernameField;
    @javafx.fxml.FXML
    private TableColumn<SystemAdministrator2,String> usernameCol;
    @javafx.fxml.FXML
    private TextField passwordField;
    @javafx.fxml.FXML
    private TableColumn<SystemAdministrator2,String> roleCol;
    @javafx.fxml.FXML
    private TableView<SystemAdministrator2> userroleTable;
    @javafx.fxml.FXML
    private TableColumn<SystemAdministrator2,String> passwordCol;
    @javafx.fxml.FXML
    private ComboBox<String> roletypeComboBox;

    @javafx.fxml.FXML
    public void onAddButtonClick(ActionEvent actionEvent) {
    }

}
