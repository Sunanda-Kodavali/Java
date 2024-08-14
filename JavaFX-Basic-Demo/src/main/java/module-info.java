module org.example.javafxbasicdemo {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.javafxbasicdemo to javafx.fxml;
    exports org.example.javafxbasicdemo;
}