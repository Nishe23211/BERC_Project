package oop.berc_oop_project.Sayma_2320543;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.stage.Stage;
import oop.berc_oop_project.HelloApplication;

import java.io.IOException;

public class SystemAdministratorDashboard {
    @javafx.fxml.FXML
    public void onInformationButtonClick(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("SystemAdministrator8.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = (Stage)(((Node) actionEvent.getSource()).getScene().getWindow());
        stage.setScene(scene);
    }

    @javafx.fxml.FXML
    public void onRoleButtonClick(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("SystemAdministrator2.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = (Stage)(((Node) actionEvent.getSource()).getScene().getWindow());
        stage.setScene(scene);
    }

    @javafx.fxml.FXML
    public void onPerformanceButtonClick(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("SystemAdministrator3.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = (Stage)(((Node) actionEvent.getSource()).getScene().getWindow());
        stage.setScene(scene);
    }

    @javafx.fxml.FXML
    public void onSecurityButtonClick(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("SystemAdministrator6.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = (Stage)(((Node) actionEvent.getSource()).getScene().getWindow());
        stage.setScene(scene);
    }

    @javafx.fxml.FXML
    public void onTaskButtonClick(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("SystemAdministrator7.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = (Stage)(((Node) actionEvent.getSource()).getScene().getWindow());
        stage.setScene(scene);
    }

    @javafx.fxml.FXML
    public void onCreateAccountButtonClick(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("SystemAdministrator1.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = (Stage)(((Node) actionEvent.getSource()).getScene().getWindow());
        stage.setScene(scene);
    }

    @javafx.fxml.FXML
    public void onDataButtonClick(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("SystemAdministrator4.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = (Stage)(((Node) actionEvent.getSource()).getScene().getWindow());
        stage.setScene(scene);
    }

    @javafx.fxml.FXML
    public void onFileButtonClick(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("SystemAdministrator5.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = (Stage)(((Node) actionEvent.getSource()).getScene().getWindow());
        stage.setScene(scene);
    }

    @javafx.fxml.FXML
    public void onLogOutButtonClick(ActionEvent actionEvent) {
    }


}
