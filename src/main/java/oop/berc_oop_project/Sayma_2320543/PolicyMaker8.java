package oop.berc_oop_project.Sayma_2320543;

import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class PolicyMaker8 {
    @javafx.fxml.FXML
    private TableView<PolicyMaker8> consultationTable;
    @javafx.fxml.FXML
    private TableColumn<PolicyMaker8,String> newpolicyCol;
    @javafx.fxml.FXML
    private TableColumn<PolicyMaker8,String> consultationCol;
    @javafx.fxml.FXML
    private ComboBox<String> typeofconsultationComboBox;
    @javafx.fxml.FXML
    private ComboBox<String> newpolicyComboBox;


    @javafx.fxml.FXML
    public void onAddButtonClick(ActionEvent actionEvent) {
    }
}
