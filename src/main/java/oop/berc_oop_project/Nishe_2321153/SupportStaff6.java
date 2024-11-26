package oop.berc_oop_project.Nishe_2321153;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

import java.time.LocalDate;

public class SupportStaff6 {
    @javafx.fxml.FXML
    private Label calendarorevent;
    @javafx.fxml.FXML
    private TableColumn<SupportStaff6, String> typecolumn;
    @javafx.fxml.FXML
    private TableView<SupportStaff6> eventtableview;
    @javafx.fxml.FXML
    private TableColumn<SupportStaff6, String> titlecolumn;
    @javafx.fxml.FXML
    private TableColumn<SupportStaff6, LocalDate> datecolumn;

    @javafx.fxml.FXML
    public void onScheduleEvent(ActionEvent actionEvent) {
    }
}
