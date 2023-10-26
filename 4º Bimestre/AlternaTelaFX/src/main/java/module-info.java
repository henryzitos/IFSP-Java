module com.example.alternatelafx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.alternatelafx to javafx.fxml;
    exports com.example.alternatelafx;
    exports com.example.alternatelafx.controller;
    opens com.example.alternatelafx.controller to javafx.fxml;
}