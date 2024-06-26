module sample2 {
    requires javafx.controls;
    requires javafx.fxml;

    opens sample2 to javafx.fxml;
    exports sample2;
}