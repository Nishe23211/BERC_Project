package oop.berc_oop_project.Nishe_2321153.SupportStaff;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import oop.berc_oop_project.HelloApplication;

import java.io.IOException;

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
    private Label ticketText;

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
            ticketText.setText("Reply sent to the user.");
        } else {
            ticketText.setText("Please select a ticket and write a reply.");
        }
    }

    @FXML
    public void onUpdateStatus(ActionEvent actionEvent) {
        Ticket selectedTicket = tickettableview.getSelectionModel().getSelectedItem();

        if (selectedTicket != null) {
            selectedTicket.setStatus("Updated");
            tickettableview.refresh();
            ticketText.setText("Ticket status updated.");
        } else {
            ticketText.setText("Please select a ticket to update.");
        }
    }

    @FXML
    public void onAssign(ActionEvent actionEvent) {
        Ticket selectedTicket = tickettableview.getSelectionModel().getSelectedItem();
        String selectedTeam = assigntoteambox.getValue();

        if (selectedTicket != null && selectedTeam != null) {
            selectedTicket.setStatus("Assigned to " + selectedTeam);
            tickettableview.refresh();
            ticketText.setText("Ticket assigned to " + selectedTeam);
        } else {
            ticketText.setText("Please select a ticket and a team.");
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
    public ObservableList<Ticket> getTickets() {
        return Tickets;
    }

    public void setTickets(ObservableList<Ticket> tickets) {
        Tickets = tickets;
    }

    @FXML
    public void onBack(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("SupportStaffDashboard.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = (Stage) (((Node) actionEvent.getSource()).getScene().getWindow());
        stage.setScene(scene);
    }
}
