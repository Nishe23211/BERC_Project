package oop.berc_oop_project.Ikhtara_1910374;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.stage.Stage;
import oop.berc_oop_project.HelloApplication;

import java.io.IOException;

public class U3Dashboard {

    @FXML
    private ComboBox<String> companyCombo;

    @FXML
    private TableColumn<Project, String> fx_companyTC;

    @FXML
    private Label fx_idLabel;

    @FXML
    private Label fx_nameLabel;

    @FXML
    private TableColumn<Project, String> fx_nameTC;

    @FXML
    private TableView<Project> fx_table;

    @FXML
    private ComboBox<String> fx_goToCombo;

    public void initialize(){
        fx_goToCombo.getItems().addAll("Disputes", "Events", "License Applications", "Reports", "Tariffs", "Tasks", "Custom Reports");}

    @FXML
    void onFilter(ActionEvent event) {

    }

    @FXML
    void onGoTo(ActionEvent event) throws IOException {

        String go = fx_goToCombo.getValue();

        if (go == null){
            return;
        }

        else if (go.equals("Disputes")){

        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Ikhtara_1910374/u3_dispute.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = (Stage)(((Node) event.getSource()).getScene().getWindow());
        stage.setScene(scene);
        }


        else if (go.equals("Events")){

            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Ikhtara_1910374/u3_eventDash.fxml"));
            Scene scene = new Scene(fxmlLoader.load());
            Stage stage = (Stage)(((Node) event.getSource()).getScene().getWindow());
            stage.setScene(scene);}


        else if (go.equals("License Applications")){

            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Ikhtara_1910374/u3_licenseDash.fxml"));
            Scene scene = new Scene(fxmlLoader.load());
            Stage stage = (Stage)(((Node) event.getSource()).getScene().getWindow());
            stage.setScene(scene);}


        else if (go.equals("Reports")){

            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Ikhtara_1910374/u3_reportDash.fxml"));
            Scene scene = new Scene(fxmlLoader.load());
            Stage stage = (Stage)(((Node) event.getSource()).getScene().getWindow());
            stage.setScene(scene);}


        else if (go.equals("Tariffs")){

            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Ikhtara_1910374/u3_tariffDash.fxml"));
            Scene scene = new Scene(fxmlLoader.load());
            Stage stage = (Stage)(((Node) event.getSource()).getScene().getWindow());
            stage.setScene(scene);}


        else if (go.equals("Tasks")){

            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Ikhtara_1910374/u3_taskDash.fxml"));
            Scene scene = new Scene(fxmlLoader.load());
            Stage stage = (Stage)(((Node) event.getSource()).getScene().getWindow());
            stage.setScene(scene);}


        else if (go.equals("Custom Reports")){

            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Ikhtara_1910374/u3_customReport.fxml"));
            Scene scene = new Scene(fxmlLoader.load());
            Stage stage = (Stage)(((Node) event.getSource()).getScene().getWindow());
            stage.setScene(scene);}


    }

    @FXML
    void onLoadProjects(ActionEvent event) {

    }

    @FXML
    void onReset(ActionEvent event) {

    }

    @FXML
    void onView(ActionEvent event) {

    }

}

