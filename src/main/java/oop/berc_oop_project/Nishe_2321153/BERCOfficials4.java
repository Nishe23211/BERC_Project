package oop.berc_oop_project.Nishe_2321153;

import javafx.event.ActionEvent;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

import java.time.LocalDate;

public class BERCOfficials4 {
    @javafx.fxml.FXML
    private TableColumn<BERCOfficials4, String> filenamecolumn;
    @javafx.fxml.FXML
    private TextField caseidfield;
    @javafx.fxml.FXML
    private TableColumn<BERCOfficials4, Integer> fileidcolumn;
    @javafx.fxml.FXML
    private DatePicker dofile;
    @javafx.fxml.FXML
    private TableView<BERCOfficials4> filetable;
    @javafx.fxml.FXML
    private TableColumn<BERCOfficials4, LocalDate> datecolumn;

    @javafx.fxml.FXML
    public void onSearch(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void onOpenFile(ActionEvent actionEvent) {
    }
}
