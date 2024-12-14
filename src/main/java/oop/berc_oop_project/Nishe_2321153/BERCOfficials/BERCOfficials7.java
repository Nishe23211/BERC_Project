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

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class BERCOfficials7 {
    @javafx.fxml.FXML
    private TextArea detailsarea;
    @javafx.fxml.FXML
    private TableColumn<ComplianceReports, String> reportidcolumn;
    @javafx.fxml.FXML
    private TableColumn<ComplianceReports, String> reporttypecolumn;
    @javafx.fxml.FXML
    private TableView<ComplianceReports> reporttable;
    @javafx.fxml.FXML
    private TableColumn<ComplianceReports, String> reportdatacolumn;
    @javafx.fxml.FXML
    private Label documentnoncompliance;
    @javafx.fxml.FXML
    private TextArea noncompliancedetailsarea;
    @javafx.fxml.FXML
    private ComboBox<String> typeCB;
    @javafx.fxml.FXML
    private ComboBox<String> dataCB;
    @javafx.fxml.FXML
    private TextField idfield;
    @javafx.fxml.FXML
    private Label reportsText;
    @FXML
    public void initialize() {
        typeCB.getItems().addAll("Financial", "Technical", "Operational");
        dataCB.getItems().addAll("Quarter1 2024", "Quarter2 2024", "Quarter3 2024");

        reportidcolumn.setCellValueFactory(new PropertyValueFactory<>("reportid"));
        reporttypecolumn.setCellValueFactory(new PropertyValueFactory<>("reporttype"));
        reportdatacolumn.setCellValueFactory(new PropertyValueFactory<>("reportdata"));
    }

    @javafx.fxml.FXML
    public void onDocumentNonCompliance(ActionEvent actionEvent) {
        String selectedReport = reporttable.getSelectionModel().getSelectedItem() != null
                ? reporttable.getSelectionModel().getSelectedItem().toString()
                : "No report selected";

        noncompliancedetailsarea.setText("Selected Report:\n" + selectedReport);
    }

    @javafx.fxml.FXML
    public void onSave(ActionEvent actionEvent) throws IOException {
        ObjectOutputStream cr = null;
        try{
        cr = new ObjectOutputStream(new FileOutputStream("ComplianceReport"));
        for (ComplianceReports u : reporttable.getItems()) {
            cr.writeObject(u);
        }
        reportsText.setText("Successfully saved details.");
    } catch(IOException e) {
        reportsText.setText("Could not save the details");
        e.printStackTrace();
    }
    finally {
            try{
                if (cr != null) cr.close();
            } catch (IOException e){
                e.printStackTrace();
            }
        }
    }
    @javafx.fxml.FXML
    public void onView(ActionEvent actionEvent) {
        ComplianceReports selectedReport = reporttable.getSelectionModel().getSelectedItem();
        if (selectedReport != null) {
            detailsarea.setText("Report ID: " + selectedReport.getReportid() +
                    "\nReport Type: " + selectedReport.getReporttype() +
                    "\nReport Data: " + selectedReport.getReportdata());
        } else {
            detailsarea.setText("Report is not selected!");
        }
    }

    @javafx.fxml.FXML
    public void onAdd(ActionEvent actionEvent) {
        String id = idfield.getText();
        String type = typeCB.getSelectionModel().getSelectedItem();
        String data = dataCB.getSelectionModel().getSelectedItem();

        ComplianceReports d = new ComplianceReports(id,type,data);

        if (id.isEmpty() || type == null || data == null) {
            reportsText.setText("Error: All fields must be filled out.");
            return;
        }
        idfield.clear();
        typeCB.setValue(null);
        dataCB.setValue(null);
        reportsText.setText("Report added successfully.");
        reporttable.getItems().add(d);
    }

    @FXML
    public void onBack(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("BERCOfficialsDashboard.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = (Stage) (((Node) actionEvent.getSource()).getScene().getWindow());
        stage.setScene(scene);
    }
}
