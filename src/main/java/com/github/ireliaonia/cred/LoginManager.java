package com.github.ireliaonia.cred;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

import java.io.IOException;

/**
 * Created by vvedeshkin on 6/1/2017.
 */
public class LoginManager {
    private Scene scene;


    public LoginManager (Scene scene){
        this.scene = scene;
    }

    public void showLoginForm()
    {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/loginForm.fxml"));
            scene.setRoot(loader.load());
            LoginController controller = loader.<LoginController>getController();
            controller.initLoginManager(this);

        }catch (IOException ex){
            //TODO: add logger here
        }
    }
    public void showMainForm()
    {
     try {
         FXMLLoader loader = new FXMLLoader(getClass().getResource("/mainForm.fxml"));
         scene.setRoot(loader.load());
         Controller controller = loader.<Controller>getController();
         controller.init(this);

     }catch (IOException ex)
     {
         //TODO: add logger here
     }
    }

    public void logout() {
        showLoginForm();
    }
}
