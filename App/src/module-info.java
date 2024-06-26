module App {
    requires javafx.fxml;
    requires javafx.controls;

    opens noteapp to javafx.fxml;
    opens noteapp.controllers to javafx.fxml;
    exports noteapp.controllers;
    exports noteapp;
}