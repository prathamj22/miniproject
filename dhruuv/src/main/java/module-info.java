module com.example.dhruuv {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.dhruuv to javafx.fxml;
    exports com.example.dhruuv;
}