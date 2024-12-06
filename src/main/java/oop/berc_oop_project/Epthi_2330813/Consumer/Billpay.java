package oop.berc_oop_project.Epthi_2330813.Consumer;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class Billpay {

    @FXML
    private TableColumn<Billpay,String > amountTC;

    @FXML
    private TextField bankaccountTF;

    @FXML
    private TextField cardnoTF;

    @FXML
    private TableView<Billpay> consumerTV;

    @FXML
    private TableColumn<Billpay,String> duedateTC;

    @FXML
    private TableColumn<Billpay,String> paymentstatusTC;



    @FXML
    public void NonpaymentButtonClick(ActionEvent actionEvent) {
    }
}
