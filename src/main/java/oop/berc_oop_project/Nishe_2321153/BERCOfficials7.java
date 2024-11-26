package oop.berc_oop_project.Nishe_2321153;

import javafx.event.ActionEvent;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;

public class BERCOfficials7 {
    @javafx.fxml.FXML
    private TextArea detailsarea;
    @javafx.fxml.FXML
    private TableColumn<BERCOfficials7, Integer> reportidcolumn;
    @javafx.fxml.FXML
    private TableColumn<BERCOfficials7, String> reporttypecolumn;
    @javafx.fxml.FXML
    private TableView<BERCOfficials7> reporttable;
    @javafx.fxml.FXML
    private TableColumn<BERCOfficials7,Integer> reportdatacolumn;

    @javafx.fxml.FXML
    public void onDocumentNonCompliance(ActionEvent actionEvent) {
    }
}
