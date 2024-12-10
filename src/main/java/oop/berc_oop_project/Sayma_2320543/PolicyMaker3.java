package oop.berc_oop_project.Sayma_2320543;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

public class PolicyMaker3 {

    @FXML
    private TableColumn<UserP3,String> feedbackCol;
    @FXML
    private TextField feedbackField;
    @FXML
    private ComboBox<String> reportComboBox;
    @FXML
    private TableColumn<UserP3,String> reportCol;
    @FXML
    private TableView<UserP3> feedbackTable;

    @FXML
    public void initialize() {
        reportComboBox.getItems().addAll("Technical Issues","Service-Related Issues","Policy Issues");

        reportCol.setCellValueFactory(new PropertyValueFactory<>("report"));
        feedbackCol.setCellValueFactory(new PropertyValueFactory<>("feedback"));
    }

    @FXML
    public void onSubmitButtonClick(ActionEvent actionEvent) {
        String report = reportComboBox.getSelectionModel().getSelectedItem();
        String feedback = feedbackField.getText();
        UserP3 u = new UserP3(report,feedback);
        feedbackTable.getItems().add(u);
    }

}
