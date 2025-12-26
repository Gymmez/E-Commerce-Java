package com.example.javafx;

import javafx.fxml.FXML;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;

public class PaymentController {
    private HelloApplication mainApp;

    @FXML
    private RadioButton cashRadio;

    @FXML
    private RadioButton visaRadio;

    @FXML
    private VBox visaBox;

    @FXML
    private TextField cardNameField;

    @FXML
    private TextField cardNumberField;

    @FXML
    private TextField amountField;

    public void setMainApp(HelloApplication mainApp) {
        this.mainApp = mainApp;
    }

    @FXML
    public void initialize() {
        cashRadio.setOnAction(e -> visaBox.setVisible(false));
        visaRadio.setOnAction(e -> visaBox.setVisible(true));
    }

    @FXML
    private void handlePay() throws Exception {
        // Later you can validate inputs here
        mainApp.showSuccessScene();
    }
}
