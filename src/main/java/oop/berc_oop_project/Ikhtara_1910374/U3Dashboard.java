package oop.berc_oop_project.Ikhtara_1910374;
import javafx.scene.control.*;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import oop.berc_oop_project.Project;

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
    void onGoTo(ActionEvent event) {

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

