module oop.berc_oop_project {
    requires javafx.controls;
    requires javafx.fxml;


    opens oop.berc_oop_project to javafx.fxml;
    exports oop.berc_oop_project;
    exports oop.berc_oop_project.Nishe_2321153;
    opens oop.berc_oop_project.Nishe_2321153 to javafx.fxml;
}