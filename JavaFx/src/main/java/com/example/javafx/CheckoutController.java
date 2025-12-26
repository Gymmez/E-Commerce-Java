package com.example.javafx;

import javafx.fxml.FXML;

public class CheckoutController {


    private HelloApplication mainApp;

    public void setMainApp(HelloApplication mainApp) {
        this.mainApp = mainApp;
    }

    @FXML
    private void goToPayment() throws Exception {
        mainApp.showPaymentScene();
    }
}
