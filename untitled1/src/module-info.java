module untitled1 {
    requires javafx.controls;
    requires javafx.fxml;

    opens sample to javafx.fxml;
    opens sample2 to javafx.fxml;
    exports sample;
    exports sample2;
}