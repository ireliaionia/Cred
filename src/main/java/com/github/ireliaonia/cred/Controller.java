 package com.github.ireliaonia.cred;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;



public class Controller {

    @FXML
    private Button b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12, b13, b14, b15, b16, b17, b18, btnLogout;
    @FXML
    private TextField answer, answer2, answer3;
    @FXML
    private Button copyb1, copyb2, copyb3;
    private LoginManager loginManager;
    @FXML
    public void initialize(){
        b1.addEventHandler(MouseEvent.MOUSE_CLICKED, event -> {

            answer.setText("URL");
            answer2.setText("Login");
            answer3.setText("Password");
        });
        b2.addEventHandler(MouseEvent.MOUSE_CLICKED, event -> {

            answer.setText("URL");
                answer2.setText("Login");
                answer3.setText("Password");
        });
        b3.addEventHandler(MouseEvent.MOUSE_CLICKED, event -> {

            answer.setText("URL");
                answer2.setText("Login");
                answer3.setText("Password");
        });
        b4.addEventHandler(MouseEvent.MOUSE_CLICKED, event -> {

            answer.setText("URL");
                answer2.setText("Login");
                answer3.setText("Password");
        });
        b5.addEventHandler(MouseEvent.MOUSE_CLICKED, event -> {

            answer.setText("URL");
                answer2.setText("Login");
                answer3.setText("Password");
        });
        b6.addEventHandler(MouseEvent.MOUSE_CLICKED, event -> {

            answer.setText("URL");
                answer2.setText("Login");
                answer3.setText("Password");
        });
        b7.addEventHandler(MouseEvent.MOUSE_CLICKED, event -> {

            answer.setText("URL");
                answer2.setText("Login");
                answer3.setText("Password");
        });
        b8.addEventHandler(MouseEvent.MOUSE_CLICKED, event -> {

            answer.setText("URL");
                answer2.setText("Login");
                answer3.setText("Password");
        });
        b9.addEventHandler(MouseEvent.MOUSE_CLICKED, event -> {

            answer.setText("URL");
                answer2.setText("Login");
                answer3.setText("Password");
        });
        b10.addEventHandler(MouseEvent.MOUSE_CLICKED, event -> {

            answer.setText("URL");
                answer2.setText("Login");
                answer3.setText("Password");
        });
        b11.addEventHandler(MouseEvent.MOUSE_CLICKED, event -> {

            answer.setText("URL");
                answer2.setText("Login");
                answer3.setText("Password");
        });
        b12.addEventHandler(MouseEvent.MOUSE_CLICKED, event -> {

            answer.setText("URL");
                answer2.setText("Login");
                answer3.setText("Password");
        });
        b13.addEventHandler(MouseEvent.MOUSE_CLICKED, event -> {

            answer.setText("URL");
                answer2.setText("Login");
                answer3.setText("Password");
        });
        b14.addEventHandler(MouseEvent.MOUSE_CLICKED, event -> {

            answer.setText("URL");
                answer2.setText("Login");
                answer3.setText("Password");
        });
        b15.addEventHandler(MouseEvent.MOUSE_CLICKED, event -> {

            answer.setText("URL");
                answer2.setText("Login");
                answer3.setText("Password");
        });
        b16.addEventHandler(MouseEvent.MOUSE_CLICKED, event -> {

            answer.setText("URL");
                answer2.setText("Login");
                answer3.setText("Password");
        });
        b17.addEventHandler(MouseEvent.MOUSE_CLICKED, event -> {

            answer.setText("URL");
                answer2.setText("Login");
                answer3.setText("Password");
        });
        b18.addEventHandler(MouseEvent.MOUSE_CLICKED, event -> {

            answer.setText("URL");
                answer2.setText("Login");
                answer3.setText("Password");
        });

        copyb1.addEventHandler(MouseEvent.MOUSE_CLICKED, event -> {

            answer.selectAll();
            answer.copy();
        });
        copyb2.addEventHandler(MouseEvent.MOUSE_CLICKED, event -> {

            answer2.selectAll();
            answer2.copy();
        });
        copyb3.addEventHandler(MouseEvent.MOUSE_CLICKED, event -> {

            answer3.selectAll();
            answer3.copy();
        });
        btnLogout.addEventHandler(MouseEvent.MOUSE_CLICKED, event -> loginManager.logout());
    }
    public void init(final LoginManager loginManager)
    {
        this.loginManager = loginManager;
    }
}
