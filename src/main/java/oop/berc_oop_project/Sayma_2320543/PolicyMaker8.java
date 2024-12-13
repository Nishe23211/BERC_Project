package oop.berc_oop_project.Sayma_2320543;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import oop.berc_oop_project.HelloApplication;

import java.io.IOException;

public class PolicyMaker8 {

    @FXML
    private TableView<ConsultationU8> consultationTable;
    @FXML
    private ComboBox<String> typeofconsultationComboBox;
    @FXML
    private TableColumn<ConsultationU8,String> policyCol;
    @FXML
    private TableColumn<ConsultationU8,String> typeofconsultationCol;
    @FXML
    private ComboBox<String> policyComboBox;

    @FXML
    public void initialize() {
        policyComboBox.getItems().addAll(" Policy1","Policy2","Policy3");
        typeofconsultationComboBox.getItems().addAll("Yes","No");

        policyCol.setCellValueFactory(new PropertyValueFactory<>("policy"));
        typeofconsultationCol.setCellValueFactory(new PropertyValueFactory<>("typeofconsultation"));

    }

    @FXML
    public void onAddButtonClick(ActionEvent actionEvent) {
        String policy = policyComboBox.getSelectionModel().getSelectedItem();
        String typeofconsultation = typeofconsultationComboBox.getSelectionModel().getSelectedItem();
       ConsultationU8 s = new ConsultationU8(policy,typeofconsultation);
        consultationTable.getItems().add(s);
    }

    @FXML
    public void onBackButtonClick(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("PolicyMakerDashboard.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = (Stage)(((Node) actionEvent.getSource()).getScene().getWindow());
        stage.setScene(scene);
    }
}
