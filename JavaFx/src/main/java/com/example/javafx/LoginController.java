package com.example.javafx;


import javafx.fxml.FXML;

public class LoginController {

    private HelloApplication mainApp;

    public void setMainApp(HelloApplication mainApp) {
        this.mainApp = mainApp;
    }

    @FXML
    private void handleLogin() throws Exception {
        mainApp.showCatalogScene();
    }

}
