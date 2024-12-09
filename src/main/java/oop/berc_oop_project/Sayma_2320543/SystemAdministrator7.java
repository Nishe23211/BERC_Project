package oop.berc_oop_project.Sayma_2320543;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class SystemAdministrator7 {
    @javafx.fxml.FXML
    private ComboBox<String> useraccountComboBox;
    @javafx.fxml.FXML
    private Label DisplayText;
    @javafx.fxml.FXML
    private ComboBox<String> taskComboBox;
    @javafx.fxml.FXML
    private TableColumn<SystemAdministratorU7,String> useraccountCol;
    @javafx.fxml.FXML
    private TableView<SystemAdministratorU7> taskTable;
    @javafx.fxml.FXML
    private TableColumn<SystemAdministratorU7,String> typeoftaskCol;

    @FXML
    public void initialize() {
        useraccountComboBox.getItems().addAll(" sayma232","nishe123","ikhtara543","epthi789");
        taskComboBox.getItems().addAll("Policy Maker","Support Staff","Legal Experts","Auditor");

        useraccountCol.setCellValueFactory(new PropertyValueFactory<>("useraccount"));
        typeoftaskCol.setCellValueFactory(new PropertyValueFactory<>("typeoftask"));

    }

    @javafx.fxml.FXML
    public void ontaskdetailsButtonClick(ActionEvent actionEvent) {
        DisplayText.setText("policy maker task,support staff task,legal experts task,auditor task");

    }

    @javafx.fxml.FXML
    public void onAddButtonClick(ActionEvent actionEvent) {
        String useraccount = useraccountComboBox.getSelectionModel().getSelectedItem();
        String typeoftask = taskComboBox.getSelectionModel().getSelectedItem();
        SystemAdministratorU7 s = new SystemAdministratorU7(useraccount,typeoftask);
        taskTable.getItems().add(s);


    }

}
