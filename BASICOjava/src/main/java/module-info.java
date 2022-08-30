module com.example.basicojava {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.basicojava to javafx.fxml;
    exports com.example.basicojava;
}