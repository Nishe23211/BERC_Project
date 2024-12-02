package oop.berc_oop_project.Nishe_2321153;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

import java.time.LocalDate;

public class BERCOfficials1A {
    @javafx.fxml.FXML
    private Label industrydataandreports;
    @javafx.fxml.FXML
    private TableView<BERCOfficials1A> datatable;
    @javafx.fxml.FXML
    private TableColumn<BERCOfficials1A, String> reporttypecolumn;
    @javafx.fxml.FXML
    private TableColumn<BERCOfficials1A, String> reportnamecolumn;
    @javafx.fxml.FXML
    private TableColumn<BERCOfficials1A, LocalDate> datecolumn;

    @javafx.fxml.FXML
    public void onDownload(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void onView(ActionEvent actionEvent) {
    }
}
