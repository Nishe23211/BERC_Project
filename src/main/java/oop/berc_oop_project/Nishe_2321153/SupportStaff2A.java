package oop.berc_oop_project.Nishe_2321153;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;

public class SupportStaff2A {
    @javafx.fxml.FXML
    private TextArea adminsolutionarea;
    @javafx.fxml.FXML
    private Label Solutionupdate;
    @javafx.fxml.FXML
    private Label solutionText;

    @javafx.fxml.FXML
    public void onUpdate(ActionEvent actionEvent) {
        String solution = adminsolutionarea.getText();
        if (solution == null || solution.trim().isEmpty()) {
            solutionText.setText("Error: Solution cannot be empty.");
            return;
        }
        solutionText.setText("Solution updated successfully.");
        adminsolutionarea.clear();
    }
}
