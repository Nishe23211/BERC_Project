package oop.berc_oop_project.Sayma_2320543;

import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

public class PolicyMaker7
{
    @javafx.fxml.FXML
    private TextField policyidField;
    @javafx.fxml.FXML
    private TableColumn<UserP7,String> applicationCol;
    @javafx.fxml.FXML
    private ComboBox<String> policyreformationfilenameComboBox;
    @javafx.fxml.FXML
    private TableView<UserP7> policyapplicationTable;
    @javafx.fxml.FXML
    private TableColumn<UserP7,String> policyreformationfilenameCol;
    @javafx.fxml.FXML
    private TableColumn<UserP7,String> policyidCol;
    @javafx.fxml.FXML
    private TextField applicationField;

    @javafx.fxml.FXML
    public void initialize() {
        policyreformationfilenameComboBox.getItems().addAll("Electricity Tariff Policy","Renewable Energy Development Guidelines","Power Sector Reform");

        policyreformationfilenameCol.setCellValueFactory(new PropertyValueFactory<>("policyreformationfilename"));
        policyidCol.setCellValueFactory(new PropertyValueFactory<>("policyid"));
        applicationCol.setCellValueFactory(new PropertyValueFactory<>("application"));
    }

    @javafx.fxml.FXML
    public void onAddButtonClick(ActionEvent actionEvent) {
        String policyreformationfilename = policyreformationfilenameComboBox.getSelectionModel().getSelectedItem();
        String policyid = policyidField.getText();
        String application = applicationField.getText();
        UserP7 u = new UserP7(policyreformationfilename,policyid,application);
        policyapplicationTable.getItems().add(u);
    }
}