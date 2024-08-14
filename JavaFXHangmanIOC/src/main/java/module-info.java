module dci.j24e01.javafxhangmanioc {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;
    requires javafx.media;


    opens dci.j24e01.javafxhangmanioc to javafx.fxml;
    exports dci.j24e01.javafxhangmanioc;
}