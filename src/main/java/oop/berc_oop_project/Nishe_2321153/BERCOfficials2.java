package oop.berc_oop_project.Nishe_2321153;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class BERCOfficials2 {
    @javafx.fxml.FXML
    private TableColumn<BERCOfficials2, String> applicantNameColumn;
    @javafx.fxml.FXML
    private TableColumn<BERCOfficials2, String> statuscolumn;
    @javafx.fxml.FXML
    private TableView<BERCOfficials2> applicationTable;
    @javafx.fxml.FXML
    private TableColumn<BERCOfficials2, Integer> applicationIdColumn;
    @javafx.fxml.FXML
    private Label pendingapplicationsandproposals;

    @javafx.fxml.FXML
    public void onReview(ActionEvent actionEvent) {
    }
}
