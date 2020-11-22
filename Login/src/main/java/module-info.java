module site.nhivo {
    requires javafx.controls;
    requires javafx.fxml;

    opens site.nhivo to javafx.fxml;
    exports site.nhivo;
}