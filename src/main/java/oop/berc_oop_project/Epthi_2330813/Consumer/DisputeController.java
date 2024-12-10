package oop.berc_oop_project.Epthi_2330813.Consumer;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.stage.Stage;
import oop.berc_oop_project.HelloApplication;

import java.io.IOException;

public class DisputeController
{
    @javafx.fxml.FXML
    private TableColumn datefieldTC;
    @javafx.fxml.FXML
    private TableView DisputeTB;
    @javafx.fxml.FXML
    private TableColumn complainidTC;
    @javafx.fxml.FXML
    private TableColumn currentstatusTC;

    @javafx.fxml.FXML
    public void initialize() {
    }

    public static class DboradController {

        @FXML
        private Label setlabeltext;

        @FXML
        void onBillPaymentButtonClick(ActionEvent actionEvent) throws IOException {
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("billpay.fxml"));
            Scene scene = new Scene(fxmlLoader.load());
            Stage stage = (Stage) (((Node) actionEvent.getSource()).getScene().getWindow());
            stage.setScene(scene);


        }

        @FXML
        void onComplainButtonClick(ActionEvent actionEvent) throws IOException {
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("complain.fxml"));
            Scene scene = new Scene(fxmlLoader.load());
            Stage stage = (Stage) (((Node) actionEvent.getSource()).getScene().getWindow());
            stage.setScene(scene);
        }

        @FXML
        void onDisputestatustButtonClick(ActionEvent actionEvent) throws IOException {
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("dispute.fxml"));
            Scene scene = new Scene(fxmlLoader.load());
            Stage stage = (Stage) (((Node) actionEvent.getSource()).getScene().getWindow());
            stage.setScene(scene);
        }

        @FXML
        void onEnergyButtonClick(ActionEvent actionEvent) throws IOException {
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("energyconsum.fxml"));
            Scene scene = new Scene(fxmlLoader.load());
            Stage stage = (Stage) (((Node) actionEvent.getSource()).getScene().getWindow());
            stage.setScene(scene);
        }

        @FXML
        void onEnergysubsidyApplicationButtonClick(ActionEvent actionEvent) throws IOException {
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("energyapplication.fxml"));
            Scene scene = new Scene(fxmlLoader.load());
            Stage stage = (Stage) (((Node) actionEvent.getSource()).getScene().getWindow());
            stage.setScene(scene);

        }

        @FXML
        void onFaqSectionButtonClick(ActionEvent actionEvent) throws IOException {
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("faq.fxml"));
            Scene scene = new Scene(fxmlLoader.load());
            Stage stage = (Stage) (((Node) actionEvent.getSource()).getScene().getWindow());
            stage.setScene(scene);

        }

        @FXML
        void onPublicinformationButtonClick(ActionEvent actionEvent) throws IOException {
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("publicinfo.fxml"));
            Scene scene = new Scene(fxmlLoader.load());
            Stage stage = (Stage) (((Node) actionEvent.getSource()).getScene().getWindow());
            stage.setScene(scene);
        }

        @FXML
        void onTariffButtonClick(ActionEvent actionEvent) throws IOException {
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("tariffinfo.fxml"));
            Scene scene = new Scene(fxmlLoader.load());
            Stage stage = (Stage) (((Node) actionEvent.getSource()).getScene().getWindow());
            stage.setScene(scene);
        }

        @FXML
        void onlogoutButtonClick(ActionEvent actionEvent) throws IOException {
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("LogInPage.fxml"));
            Scene scene = new Scene(fxmlLoader.load());
            Stage stage = (Stage) (((Node) actionEvent.getSource()).getScene().getWindow());
            stage.setScene(scene);

        }

        @FXML
        public void initialize() {
            setlabeltext.setText("Welcome to the Dashboard!");
        }


    }
}