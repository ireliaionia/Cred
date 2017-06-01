package com.github.ireliaonia.cred;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 * Created by vvedeshkin on 6/1/2017.
 */
public class LoginController {
    @FXML
    private TextField password;
    @FXML
    private Label message;
    @FXML
    private Button btnLogin;

    public void initialize (){}


    public  void initLoginManager(final LoginManager loginManager){
        btnLogin.setOnAction(event -> {
            if( password.getText().equals("test")) {loginManager.showMainForm();}
            else message.setText("Wrong password");
        });
    }
}
