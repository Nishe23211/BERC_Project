package oop.berc_oop_project.Ikhtara_1910374;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import oop.berc_oop_project.HelloApplication;

import java.io.IOException;
import java.time.LocalDate;

public class U3EventDash {

    @FXML
    private DatePicker fx_date;

    @FXML
    private TableColumn<Event, LocalDate> fx_dateTC;

    @FXML
    private TextField fx_name;

    @FXML
    private TableView<Event> fx_table;

    @FXML
    private TableColumn<Event, String> fx_topicTC;

    @FXML
    private TextField fx_venue;

    @FXML
    private TableColumn<Event, String> fx_venueTC;

    public void initialize(){

        fx_topicTC.setCellValueFactory(new PropertyValueFactory<>("Topic"));
        fx_venueTC.setCellValueFactory(new PropertyValueFactory<>("Venue"));
        fx_dateTC.setCellValueFactory(new PropertyValueFactory<>("Date"));}

    @FXML
    void onAddEvent(ActionEvent event) {
        String name = fx_name.getText();
        String venue = fx_venue.getText();
        LocalDate date = this.fx_date.getValue();

        if (name.isBlank() || venue == null || date == null){
            return;
        }

        Event a = new Event(name, venue, date);
        fx_table.getItems().add(a);

    }

    @FXML
    void onGoBack(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Ikhtara_1910374/u3_dashboard.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = (Stage)(((Node) event.getSource()).getScene().getWindow());
        stage.setScene(scene);

    }

}
