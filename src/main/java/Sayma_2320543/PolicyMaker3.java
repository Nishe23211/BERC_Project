package Sayma_2320543;

import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class PolicyMaker3 {
    @javafx.fxml.FXML
    private TableColumn<PolicyMaker3,String> feedbackCol;
    @javafx.fxml.FXML
    private TextField feedbackFiled;
    @javafx.fxml.FXML
    private ComboBox<String> reportComboBox;
    @javafx.fxml.FXML
    private TableColumn<PolicyMaker3,String> reportCol;
    @javafx.fxml.FXML
    private TableView<PolicyMaker3> feedbackTable;

    @javafx.fxml.FXML
    public void onSubmitButtonClick(ActionEvent actionEvent) {
    }
}
