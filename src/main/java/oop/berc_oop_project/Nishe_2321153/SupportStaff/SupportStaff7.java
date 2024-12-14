package oop.berc_oop_project.Nishe_2321153.SupportStaff;

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

public class SupportStaff7 {
    @javafx.fxml.FXML
    private TableColumn<Files, String> filetypecolumn;
    @javafx.fxml.FXML
    private TableColumn<Files, String> filenamecolumn;
    @javafx.fxml.FXML
    private Label files;
    @javafx.fxml.FXML
    private TableColumn<Files, String> fileaccesscolumn;
    @javafx.fxml.FXML
    private TableView<Files> filestableview;
    @javafx.fxml.FXML
    private CheckBox viewonlybox;
    @javafx.fxml.FXML
    private Label permissions;
    @javafx.fxml.FXML
    private CheckBox editbox;
    @javafx.fxml.FXML
    private Label filepermissions;
    @javafx.fxml.FXML
    private TextField filenamefield;
    @javafx.fxml.FXML
    private CheckBox downloadbox;
    private ArrayList<Files> fileList = new ArrayList<>();
    @FXML
    private TextField filetypefield;
    @FXML
    private ComboBox<String> accessCB;
    @FXML
    private Label fileText;

    @FXML
    private void initialize() {
        filenamecolumn.setCellValueFactory(new PropertyValueFactory<>("filename"));
        filetypecolumn.setCellValueFactory(new PropertyValueFactory<>("filetype"));
        fileaccesscolumn.setCellValueFactory(new PropertyValueFactory<>("fileaccess"));

        accessCB.getItems().addAll("Read","Write", "Execute");

    }

    @javafx.fxml.FXML
    public void onRestrictFile(ActionEvent actionEvent) {
        Files selectedFile = filestableview.getSelectionModel().getSelectedItem();
        if (selectedFile == null) {
            fileText.setText("Please select a file to restrict!");
            return;
        }

        fileList.remove(selectedFile);
    }

    @javafx.fxml.FXML
    public void onSave(ActionEvent actionEvent) {
        String fileName = filenamefield.getText();
        String fileType = filetypefield.getText();
        StringBuilder fileAccess = new StringBuilder();

        if (viewonlybox.isSelected()) {
            fileAccess.append("View Only, ");
        }
        if (downloadbox.isSelected()) {
            fileAccess.append("Download, ");
        }
        if (editbox.isSelected()) {
            fileAccess.append("Edit, ");
        }

        if (!fileAccess.isEmpty()) {
            fileAccess.setLength(fileAccess.length() - 2);
        } else {
            fileAccess.append("No Access");
        }

        if (fileName.isEmpty() || fileType.isEmpty()) {
            fileText.setText("File Name and File Type cannot be empty!");
            return;
        }
        fileList.add(new Files(fileName, fileType, fileAccess.toString()));

        filenamefield.clear();
        filetypefield.clear();
        viewonlybox.setSelected(false);
        downloadbox.setSelected(false);
        editbox.setSelected(false);
    }
    @FXML
    public void onAdd(ActionEvent actionEvent) {
        String filename = filenamefield.getText();
        String filetype = filetypefield.getText();
        String fileaccess = accessCB.getValue();
        Files f = new Files( filename, filetype, fileaccess);
        filestableview.getItems().add(f);

        filenamefield.clear();
        filetypefield.clear();
        accessCB.setValue("");
    }

    @FXML
    public void onBack(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("SupportStaffDashboard.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = (Stage) (((Node) actionEvent.getSource()).getScene().getWindow());
        stage.setScene(scene);
    }
}
