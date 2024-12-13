package oop.berc_oop_project.Epthi_2330813.Consumer;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

public class BillpaymentController {

    @FXML
    private TableColumn<Bill,Double> amountTC;

    @FXML
    private TextField bankaccountTF;

    @FXML
    private TextField cardnoTF;

    @FXML
    private TableView<Bill> consumerTV;

    @FXML
    private TableColumn<Bill, String> duedateTC;

    @FXML
    private TableColumn<Bill, String> paymentstatusTC;

    private  ObservableList<Bill> bills;

    @FXML
    public void initialize() {
        amountTC.setCellValueFactory(new PropertyValueFactory<>("amount"));
        duedateTC.setCellValueFactory(new PropertyValueFactory<>("dueDate"));
        paymentstatusTC.setCellValueFactory(new PropertyValueFactory<>("status"));

        bills = FXCollections.observableArrayList(
                new Bill("B101", 120.50, "2024-12-20", "Unpaid"),
                new Bill("B102", 200.75, "2024-11-15", "Paid"),
                new Bill("B103", 150.00, "2024-12-10", "Unpaid")
        );
        consumerTV.setItems(bills);
    }

    @FXML
    void NonpaymentButtonClick(ActionEvent event) {
        Bill selectedBill = consumerTV.getSelectionModel().getSelectedItem();
        if (selectedBill != null && "Unpaid".equals(selectedBill.getStatus())) {
            selectedBill.setStatus("Paid");
            consumerTV.refresh();
        }
    }
}




