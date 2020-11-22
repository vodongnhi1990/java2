package site.nhivo.controllers;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import site.nhivo.App;
import site.nhivo.db.DbEmployee;

public class LoginController {

    public TextField txtId;
    public Button btnLogn;
    public PasswordField txtPass;

    @FXML
    private void switchToSecondary() throws IOException {
        App.setRoot("secondary");
    }

    public void onLogin(ActionEvent actionEvent) throws IOException {
        //Xu ly login
        int id = Integer.parseInt(txtId.getText());
        String pass = txtPass.getText();

        //goi csdl de xu ly
        if (DbEmployee.login(id,pass)){
            App.setRoot("secondary");
        }else {
            System.out.println("Fail");
        }
    }
}
