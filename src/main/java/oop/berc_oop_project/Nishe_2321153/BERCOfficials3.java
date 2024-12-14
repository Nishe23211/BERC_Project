package oop.berc_oop_project.Nishe_2321153;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import javax.sound.sampled.Line;
import java.util.ArrayList;

public class BERCOfficials3 {
    @javafx.fxml.FXML
    private Label casedetails;
    @javafx.fxml.FXML
    private TableColumn<Case, Integer> caseidcolumn;
    @javafx.fxml.FXML
    private TableView<Case> casetable;
    @javafx.fxml.FXML
    private TextField casenamefield;
    @javafx.fxml.FXML
    private TextArea evidancesubmittedarea;
    @javafx.fxml.FXML
    private TextArea backgroundinfoarea;
    @javafx.fxml.FXML
    private TableColumn<Case, String> statuscolumn;
    @javafx.fxml.FXML
    private TableColumn<Case, String> casenamecolumn;
    @javafx.fxml.FXML
    private TextField caseidfield;
    @javafx.fxml.FXML
    private Label disputeresolutionandcases;
    @javafx.fxml.FXML
    private TextArea notesarea;
    @javafx.fxml.FXML
    private TextArea actionsarea;
    @javafx.fxml.FXML
    private ComboBox<String> statusCB;
    @javafx.fxml.FXML
    private Label caseText;
    private final ArrayList<Case> cases = new ArrayList<>();


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
    public void initialize() {
        statusCB.getItems().addAll("Pending", "Resolved", "In Progress");

        caseidcolumn.setCellValueFactory(new PropertyValueFactory<>("caseId"));
        casenamecolumn.setCellValueFactory(new PropertyValueFactory<>("caseName"));
        statuscolumn.setCellValueFactory(new PropertyValueFactory<>("status"));
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
