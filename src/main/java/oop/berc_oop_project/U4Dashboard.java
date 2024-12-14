package oop.berc_oop_project;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import oop.berc_oop_project.Ikhtara_1910374.Project;

public class U4Dashboard {

    @FXML
    private ComboBox<String> fx_companyCombo;

    @FXML
    private TableColumn<Project, String> fx_companyName;

    @FXML
    private ComboBox<String> fx_project1Combo;

    @FXML
    private ComboBox<String> fx_project2Combo;

    @FXML
    private TableColumn<Project, String> fx_projectName;

    @FXML
    private TableView<Project> fx_table;

    @FXML
    private Label fx_useridLabel;

    @FXML
    private Label fx_usernameLabel;

    @FXML
    void onFilter(ActionEvent event) {

    }

    @FXML
    void onProposeCollab(ActionEvent event) {

    }

    @FXML
    void onProposeProject(ActionEvent event) {

    }

    @FXML
    void onReset(ActionEvent event) {

    }

    @FXML
    void onView(ActionEvent event) {

    }

}

