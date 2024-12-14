package oop.berc_oop_project.Nishe_2321153;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import oop.berc_oop_project.HelloApplication;

import java.io.IOException;
import java.time.LocalDate;

public class BERCOfficials4 {
    @javafx.fxml.FXML
    private TableColumn<FileRecord, String> filenamecolumn;
    @javafx.fxml.FXML
    private TextField caseidfield;
    @javafx.fxml.FXML
    private TableColumn<FileRecord, String> fileidcolumn;
    @javafx.fxml.FXML
    private DatePicker dofile;
    @javafx.fxml.FXML
    private TableView<FileRecord> filetable;
    @javafx.fxml.FXML
    private TableColumn<FileRecord, LocalDate> datecolumn;
    @javafx.fxml.FXML
    private TextField namefield;
    @javafx.fxml.FXML
    private Label caseText;
    public void initialize() {
        fileidcolumn.setCellValueFactory(new PropertyValueFactory<>("fileid"));
        filenamecolumn.setCellValueFactory(new PropertyValueFactory<>("filename"));
        datecolumn.setCellValueFactory(new PropertyValueFactory<>("date"));
    }

    @javafx.fxml.FXML
    public void onSearch(ActionEvent actionEvent) {
        String fileid = caseidfield.getText();
        String filename = namefield.getText();
        LocalDate datee = dofile.getValue();
        FileRecord f = new FileRecord(fileid,filename,datee);

        if (fileid.isEmpty() || filename.isEmpty() || datee == null) {
            caseText.setText("Error: All fields must be filled out.");
            return;
        }
        caseidfield.clear();
        namefield.clear();
        dofile.setValue(null);
        filetable.getItems().add(f);
    }

    @javafx.fxml.FXML
    public void onOpenFile(ActionEvent actionEvent) throws IOException {
        FileRecord files = filetable.getSelectionModel().getSelectedItem();

        if (files == null) {
            caseText.setText("Error: No case selected.");
        } else {
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("SupportStaff4.a.fxml"));
            Scene scene = new Scene(fxmlLoader.load());
            Stage stage = (Stage) (((Node) actionEvent.getSource()).getScene().getWindow());
            stage.setScene(scene);
        }
    }

}
