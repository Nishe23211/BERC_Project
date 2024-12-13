package oop.berc_oop_project.Epthi_2330813.Consumer;



import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;

public class PublicinfoController {

    @FXML
    private ComboBox<String> publicinfoComboBox;
    private PublicInfoData publicInfoData = new PublicInfoData();
    @FXML
    private TextArea infoTF;

    @FXML
    public void initialize() {
        publicinfoComboBox.getItems().addAll("Energy Policies", "Consumer Rights");
        publicinfoComboBox.setOnAction(event -> {

            String selectedCategory = publicinfoComboBox.getValue();
            if ("Energy Policies".equals(selectedCategory)) {
                infoTF.setText(publicInfoData.getEnergyPolicies());
            } else if ("Consumer Rights".equals(selectedCategory)) {
                infoTF.setText(publicInfoData.getConsumerRights());
            }
        });
    }

}
