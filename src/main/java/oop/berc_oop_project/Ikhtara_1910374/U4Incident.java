package oop.berc_oop_project.Ikhtara_1910374;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import oop.berc_oop_project.HelloApplication;

import java.io.IOException;
import java.time.LocalDate;
import java.util.Locale;

public class U4Incident {

    @FXML
    private TableColumn<Incident, LocalDate> fx_dateTC;

    @FXML
    private TextField fx_incident;

    @FXML
    private DatePicker fx_incidentDate;

    @FXML
    private TableColumn<Incident, String> fx_incidentTC;

    @FXML
    private TableColumn<Incident, String> fx_nameTC;

    @FXML
    private TextField fx_projectName;

    @FXML
    private TableView<Incident> fx_table;

    public void initialize(){

        fx_nameTC.setCellValueFactory(new PropertyValueFactory<>("Project Name"));
        fx_incidentTC.setCellValueFactory(new PropertyValueFactory<>("Incident"));
        fx_dateTC.setCellValueFactory(new PropertyValueFactory<>("Date"));}



    @FXML
    void onGoBack(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Ikhtara_1910374/u4_dashboard.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = (Stage)(((Node) event.getSource()).getScene().getWindow());
        stage.setScene(scene);

    }

    @FXML
    void onReportIncident(ActionEvent event) {

        String projectName = fx_projectName.getText();
        String incident = fx_incident.getText();
        LocalDate incidentDate = this.fx_incidentDate.getValue();

        if (projectName.isBlank() || incident.isBlank() || incidentDate == null){
            return;
        }

        Incident a = new Incident(projectName, incidentDate, incident);
        fx_table.getItems().add(a);

    }

}

