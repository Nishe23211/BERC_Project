package oop.berc_oop_project.Epthi_2330813.Auditor;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class AlertController {

    @FXML
    private TableView<Alert> alertTV;

    @FXML
    private TableColumn<Alert,String > issueCol;

    @FXML
    private TableColumn<Alert, String> nameCol;

    public static class Record {
        private StringProperty recordId;
        private StringProperty decisionType;
        private StringProperty date;
        private StringProperty details;

        public Record(String recordId, String decisionType, String date, String details) {
            this.recordId = new SimpleStringProperty(recordId);
            this.decisionType = new SimpleStringProperty(decisionType);
            this.date = new SimpleStringProperty(date);
            this.details = new SimpleStringProperty(details);
        }

        public StringProperty recordIdProperty() {
            return recordId;
        }

        public StringProperty decisionTypeProperty() {
            return decisionType;
        }

        public StringProperty dateProperty() {
            return date;
        }

        public StringProperty detailsProperty() {
            return details;
        }

        public String getRecordId() {
            return recordId.get();
        }

        public String getDecisionType() {
            return decisionType.get();
        }

        public String getDate() {
            return date.get();
        }

        public String getDetails() {
            return details.get();
        }
    }
}
