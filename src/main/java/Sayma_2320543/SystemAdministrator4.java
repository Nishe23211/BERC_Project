package Sayma_2320543;

import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class SystemAdministrator4 {
    @javafx.fxml.FXML
    private ComboBox<String> typeofbackupComboBox;
    @javafx.fxml.FXML
    private TableColumn<SystemAdministrator4,String> typeofdataCol;
    @javafx.fxml.FXML
    private ComboBox<String> storebackupComboBox;
    @javafx.fxml.FXML
    private TableColumn<SystemAdministrator4,String> typeodbackupCol;
    @javafx.fxml.FXML
    private TableView<SystemAdministrator4> databackupTable;
    @javafx.fxml.FXML
    private ComboBox<String> typeofdataComboBox;
    @javafx.fxml.FXML
    private TableColumn<SystemAdministrator4,String> storebackupCol;

    @javafx.fxml.FXML
    public void onConfirmSetupButtonClick(ActionEvent actionEvent) {
    }

}
