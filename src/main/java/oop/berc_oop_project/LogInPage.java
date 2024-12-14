package oop.berc_oop_project;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class LogInPage {
    @FXML
    private TextField usernameField;
    @FXML
    private Label settext;
    @FXML
    private PasswordField passwordFiled;
    @FXML
    private ComboBox<String> typeCB;

    private Stage stage;
    private Scene scene;

    @FXML
    public void initialize(){
        // Add 8 user types to ComboBox
        typeCB.getItems().addAll(
                "Auditor",
                "Consumer",
                "Legal Expert",
                "Representative",
                "SystemAdministrator",
                "PolicyMaker",
                "SupportStaff",
                "BERCOfficials"
        );
    }

    @FXML
    public void onLogInButtonClick(ActionEvent actionEvent) {
        String username = usernameField.getText();
        String password = passwordFiled.getText();
        String userType = typeCB.getValue();

        if (username.isEmpty() || password.isEmpty() || userType == null) {
            settext.setText("All fields are required.");
            return;
        }
        if (validateCredentials(username, password, userType)) {
            try {
                FXMLLoader fxmlLoader;
                switch (userType) {
                    case "Auditor":
                        fxmlLoader = new FXMLLoader(getClass().getResource("auditdboard.fxml"));
                        break;
                    case "Consumer":
                        fxmlLoader = new FXMLLoader(getClass().getResource("consumer.fxml"));
                        break;
                    case "Legal Expert":
                        fxmlLoader = new FXMLLoader(getClass().getResource("legal_expert_dashboard.fxml"));
                        break;
                    case "Representative":
                        fxmlLoader = new FXMLLoader(getClass().getResource("representative_dashboard.fxml"));
                        break;
                    case "SystemAdministrator":
                        fxmlLoader = new FXMLLoader(getClass().getResource("SystemAdministratorDashboard.fxml"));
                        break;
                    case "PolicyMaker":
                        fxmlLoader = new FXMLLoader(getClass().getResource("PolicyMakerDashboard.fxml"));
                        break;
                    case "SupportStaff":
                        fxmlLoader = new FXMLLoader(getClass().getResource("SupportStaffDashboard.fxml"));
                        break;
                    case "BERCOfficials":
                        fxmlLoader = new FXMLLoader(getClass().getResource("BERCOfficialsDashboard.fxml"));
                        break;
                    default:
                        settext.setText("Invalid user type selected.");
                        return;
                }
                scene = new Scene(fxmlLoader.load());
                stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
                stage.setScene(scene);
                stage.show();
            } catch (IOException e) {
                settext.setText("Error loading dashboard. Please try again.");
                e.printStackTrace();
            }
        } else {
            settext.setText("Invalid username or password.");
        }
    }

    private boolean validateCredentials(String username, String password, String userType) {
        if (userType.equals("Auditor") && username.equals("auditor") && password.equals("pass123")) {
            return true;
        } else if (userType.equals("Consumer") && username.equals("consumer") && password.equals("pass123")) {
            return true;
        } else if (userType.equals("Legal Expert") && username.equals("legal") && password.equals("pass123")) {
            return true;
        } else if (userType.equals("Representative") && username.equals("representative") && password.equals("pass123")) {
            return true;
        } else if (userType.equals("SystemAdministrator") && username.equals("system") && password.equals("admin123")) {
            return true;
        } else if (userType.equals("PolicyMaker") && username.equals("Policy") && password.equals("manager123")) {
            return true;
        } else if (userType.equals("SupportStaff") && username.equals("Support Staff") && password.equals("support123")) {
            return true;
        } else if (userType.equals("BERCOfficials") && username.equals("BERCOfficials") && password.equals("berc123")) {
            return true;
        }
        return false;
    }
}
