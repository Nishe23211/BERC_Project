module oop.berc_oop_project {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;
    requires jdk.internal.le;


    opens oop.berc_oop_project to javafx.fxml;
    exports oop.berc_oop_project;
    opens oop.berc_oop_project.Ikhtara_1910374 to javafx.fxml;
    exports oop.berc_oop_project.Ikhtara_1910374;
    exports oop.berc_oop_project.Nishe_2321153.SupportStaff;
    opens oop.berc_oop_project.Nishe_2321153 to javafx.fxml;
    exports oop.berc_oop_project.Sayma_2320543;
    opens oop.berc_oop_project.Sayma_2320543 to javafx.fxml;
    exports oop.berc_oop_project.Epthi_2330813.Auditor;
    opens oop.berc_oop_project.Epthi_2330813.Auditor to javafx.fxml;
    exports oop.berc_oop_project.Epthi_2330813.Consumer;
    opens oop.berc_oop_project.Epthi_2330813.Consumer to javafx.fxml;
    exports oop.berc_oop_project.Nishe_2321153.BERCOfficials;
    opens oop.berc_oop_project.Nishe_2321153.BERCOfficials to javafx.fxml;
    opens oop.berc_oop_project.Nishe_2321153.SupportStaff to javafx.fxml;


}