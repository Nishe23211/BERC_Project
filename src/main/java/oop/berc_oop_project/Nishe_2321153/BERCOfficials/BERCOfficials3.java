package oop.berc_oop_project.Nishe_2321153.BERCOfficials;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import oop.berc_oop_project.HelloApplication;

import java.io.IOException;
import java.util.ArrayList;

public class BERCOfficials3 {
    @javafx.fxml.FXML
    private TableColumn<Case,String> caseidcolumn;
    @javafx.fxml.FXML
    private TableView<Case> casetable;
    @javafx.fxml.FXML
    private TableColumn<Case,String> statuscolumn;
    @javafx.fxml.FXML
    private TableColumn<Case,String> casenamecolumn;
    @javafx.fxml.FXML
    private TextField caseidfield;
    @javafx.fxml.FXML
    private TextField casenamefield;
    @javafx.fxml.FXML
    private TextArea evidancesubmittedarea;
    @javafx.fxml.FXML
    private TextArea notesarea;
    @javafx.fxml.FXML
    private ComboBox<String> statusCB;
    @javafx.fxml.FXML
    private Label caseText;
    @javafx.fxml.FXML
    private TextArea backgroundinfoarea;
    @javafx.fxml.FXML
    private TextArea actionsarea;
    private final ArrayList<Case> cases = new ArrayList<>();

    @FXML
    public void initialize() {
        statusCB.getItems().addAll("Pending", "Resolved", "In Progress");

        caseidcolumn.setCellValueFactory(new PropertyValueFactory<>("caseId"));
        casenamecolumn.setCellValueFactory(new PropertyValueFactory<>("caseName"));
        statuscolumn.setCellValueFactory(new PropertyValueFactory<>("status"));
    }

    @javafx.fxml.FXML
    public void onBack(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("BERCOfficialsDashboard.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = (Stage) (((Node) actionEvent.getSource()).getScene().getWindow());
        stage.setScene(scene);
    }

    @javafx.fxml.FXML
    public void onProvideDecision(ActionEvent actionEvent) {
        String decisionNotes = notesarea.getText();
        String decisionActions = actionsarea.getText();
        String decisionEvidence = evidancesubmittedarea.getText();
        String decisionBackground = backgroundinfoarea.getText();
        String status = statusCB.getValue();

        caseText.setText("Decision provided: " + decisionBackground +
                "\nEvidence: " +decisionEvidence +
                "\nPrevious Decision: " +decisionActions +
                "\nNotes: " +decisionNotes );

    }

    @javafx.fxml.FXML
    public void onViewCase(ActionEvent actionEvent) {
        Case selectedCase = casetable.getSelectionModel().getSelectedItem();
        if (selectedCase != null) {
            backgroundinfoarea.setText("Case Name: " + selectedCase.getCaseName() +
                    "\nCase ID: " + selectedCase.getCaseId() +
                    "\nStatus: " + selectedCase.getStatus());
        } else {
            backgroundinfoarea.setText("Case Not Found!");
        }
    }

    @FXML
    public void onAdd(ActionEvent actionEvent) {
        String caseid  = caseidfield.getText();
        String casename = casenamefield.getText();
        String status = statusCB.getSelectionModel().getSelectedItem();
        Case c = new Case(caseid, casename, status);

        if (caseid.isEmpty() || casename.isEmpty() || status == null) {
            caseText.setText("Error: All fields must be filled out.");
            return;
        }
        caseidfield.clear();
        casenamefield.clear();
        statusCB.setValue(null);
        caseText.setText("Case added successfully.");
        casetable.getItems().add(c);
    }
}
