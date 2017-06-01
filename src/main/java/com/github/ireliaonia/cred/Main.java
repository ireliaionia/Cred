package com.github.ireliaonia.cred;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage stage) throws Exception{
        Scene scene = new Scene(new StackPane());
        LoginManager loginManager = new LoginManager(scene);
        loginManager.showLoginForm();
        stage.setScene(scene);
        stage.show();


    }


    public static void main(String[] args) {
        launch(args);
    }
}
