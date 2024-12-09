package oop.berc_oop_project;

import javafx.event.ActionEvent;
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
    @javafx.fxml.FXML
    private TextField usernameField;
    @javafx.fxml.FXML
    private Label settext;
    @javafx.fxml.FXML
    private PasswordField passwordFiled;
    @javafx.fxml.FXML
    private ComboBox<String> typeCB;

    private Stage stage;
    private Scene scene;

    @javafx.fxml.FXML
    public void onLogInButtonClick(ActionEvent actionEvent) {
        String username = usernameField.getText();
        String password = passwordFiled.getText();
        String userType = typeCB.getValue();

        // Perform basic validation
        if (username.isEmpty() || password.isEmpty() || userType == null) {
            settext.setText("All fields are required.");
            return;
        }

        // Check credentials (Dummy validation for demonstration)
        if (validateCredentials(username, password, userType)) {
            try {
                // Load the appropriate dashboard based on user type
                FXMLLoader fxmlLoader;
                if (userType.equals("Auditor")) {
                    fxmlLoader = new FXMLLoader(getClass().getResource("auditor_dashboard.fxml"));
                } else if (userType.equals("Consumer")) {
                    fxmlLoader = new FXMLLoader(getClass().getResource("consumerboard.fxml"));
                } else {
                    settext.setText("Invalid user type selected.");
                    return;
                }

                // Switch scene
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
        // Replace with actual credential validation logic (e.g., database query)
        if (userType.equals("Auditor") && username.equals("auditor") && password.equals("pass123")) {
            return true;
        } else if (userType.equals("Consumer") && username.equals("consumer") && password.equals("pass123")) {
            return true;
        }
        return false;
    }
}
