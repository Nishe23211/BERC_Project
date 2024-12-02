package oop.berc_oop_project;

import javafx.event.ActionEvent;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class Billpay
{
    @javafx.fxml.FXML
    private TableColumn amountTC;
    @javafx.fxml.FXML
    private TableColumn paymentstatusTC;
    @javafx.fxml.FXML
    private TextField bankaccountTF;
    @javafx.fxml.FXML
    private TableColumn duedateTC;
    @javafx.fxml.FXML
    private TextField cardnoTF;
    @javafx.fxml.FXML
    private TableView consumerTV;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void OnActionmakepaymentButtonClick(ActionEvent actionEvent) {
    }
}