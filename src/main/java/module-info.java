module com.example.spinnertest {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.spinnertest to javafx.fxml;
    exports com.example.spinnertest;
}