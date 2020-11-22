module site.nhivo {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires sqlite.jdbc;

    opens site.nhivo.controllers to javafx.fxml;
    exports site.nhivo;
}