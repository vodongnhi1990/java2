package site.nhivo.controllers;

import java.io.IOException;
import javafx.fxml.FXML;
import site.nhivo.App;

public class SecondaryController {

    @FXML
    private void switchToPrimary() throws IOException {
        App.setRoot("login");
    }
}