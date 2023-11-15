module com.example.graph2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.graph2 to javafx.fxml;
    exports com.example.graph2;
}