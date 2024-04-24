module dci.j24e01.fxcounter {
    requires javafx.controls;
    requires javafx.fxml;


    opens dci.j24e01.fxcounter to javafx.fxml;
    exports dci.j24e01.fxcounter;
}