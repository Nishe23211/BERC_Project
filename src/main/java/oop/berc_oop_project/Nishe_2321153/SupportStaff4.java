package oop.berc_oop_project.Nishe_2321153;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.util.ArrayList;

public class SupportStaff4 {
    @FXML
    private TableColumn<Ticket, String> statuscolumn;
    @FXML
    private Label tickets;
    @FXML
    private TableColumn<Ticket, Integer> idcolumn;
    @FXML
    private TableView<Ticket> tickettableview;
    @FXML
    private TableColumn<Ticket, String> subcolumn;
    @FXML
    private TextArea detailsarea;
    @FXML
    private Label ticketdetails;
    @FXML
    private TextArea replytouserarea;
    @FXML
    private ComboBox<String> assigntoteambox;

    private ObservableList<Ticket> Tickets = FXCollections.observableArrayList();
    @FXML
    private ComboBox<String> statusCB;
    @FXML
    private TextField subjectfield;
    @FXML
    private TextField idfield;

    @FXML
    public void initialize() {
        idcolumn.setCellValueFactory(new PropertyValueFactory<>("id"));
        subcolumn.setCellValueFactory(new PropertyValueFactory<>("subject"));
        statuscolumn.setCellValueFactory(new PropertyValueFactory<>("status"));

        statusCB.setItems(FXCollections.observableArrayList("Pending", "In Progress", "Completed"));
        assigntoteambox.setItems(FXCollections.observableArrayList("Tech Team", "Admin Team", "Finance Team"));

    }

    @FXML
    public void onReply(ActionEvent actionEvent) {
        Ticket selectedTicket = tickettableview.getSelectionModel().getSelectedItem();
        String reply = replytouserarea.getText();

        if (selectedTicket != null && !reply.isEmpty()) {
            selectedTicket.setStatus("Replied");
            tickettableview.refresh();
            showAlert("Success", "Reply sent to the user.", Alert.AlertType.INFORMATION);
        } else {
            showAlert("Error", "Please select a ticket and write a reply.", Alert.AlertType.ERROR);
        }
    }

    @FXML
    public void onUpdateStatus(ActionEvent actionEvent) {
        Ticket selectedTicket = tickettableview.getSelectionModel().getSelectedItem();

        if (selectedTicket != null) {
            selectedTicket.setStatus("Updated");
            tickettableview.refresh();
            showAlert("Success", "Ticket status updated.", Alert.AlertType.INFORMATION);
        } else {
            showAlert("Error", "Please select a ticket to update.", Alert.AlertType.ERROR);
        }
    }

    @FXML
    public void onAssign(ActionEvent actionEvent) {
        Ticket selectedTicket = tickettableview.getSelectionModel().getSelectedItem();
        String selectedTeam = assigntoteambox.getValue();

        if (selectedTicket != null && selectedTeam != null) {
            selectedTicket.setStatus("Assigned to " + selectedTeam);
            tickettableview.refresh();
            showAlert("Success", "Ticket assigned to " + selectedTeam, Alert.AlertType.INFORMATION);
        } else {
            showAlert("Error", "Please select a ticket and a team.", Alert.AlertType.ERROR);
        }
    }

    @FXML
    public void onViewDetails(ActionEvent actionEvent) {
        Ticket selectedTicket = tickettableview.getSelectionModel().getSelectedItem();
        if (selectedTicket != null) {
            detailsarea.setText("Ticket ID: " + selectedTicket.getId() +
                    "\nSubject: " + selectedTicket.getSubject() +
                    "\nStatus: " + selectedTicket.getStatus());
        } else {
            detailsarea.setText("No ticket selected!");
        }
    }

    @FXML
    public void onAdd(ActionEvent actionEvent) {
        int Id = Integer.parseInt(idfield.getText());
        String Subject = subjectfield.getText();
        String Status = statusCB.getValue();
        Ticket t = new Ticket(Id, Subject, Status);
        tickettableview.getItems().add(t);

        idfield.clear();
        statusCB.setValue("");
    }

    private void showAlert(String title, String message, Alert.AlertType alertType) {
        Alert alert = new Alert(alertType);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }

    public ObservableList<Ticket> getTickets() {
        return Tickets;
    }

    public void setTickets(ObservableList<Ticket> tickets) {
        Tickets = tickets;
    }
}
