package com.example.javafx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    private Stage primaryStage;

    @Override
    public void start(Stage stage) throws Exception {
        this.primaryStage = stage;
        showLoginScene();
        stage.setTitle("E-Commerce");
        stage.show();
    }

    public void showLoginScene() throws Exception {
        FXMLLoader loader = new FXMLLoader(
                getClass().getResource("hello-view.fxml")
        );
        Scene scene = new Scene(loader.load());
        LoginController controller = loader.getController();
        controller.setMainApp(this);
        primaryStage.setScene(scene);
    }

    public void showCatalogScene() throws Exception {
        FXMLLoader loader = new FXMLLoader(
                getClass().getResource("catalog.fxml")
        );
        Scene scene = new Scene(loader.load(), 600, 400);

        CatalogController controller = loader.getController();
        controller.setMainApp(this);

        primaryStage.setScene(scene);

    }

    public  void showPaymentScene() throws Exception {
        FXMLLoader loader = new FXMLLoader(
                getClass().getResource("payment.fxml")
        );
        Scene scene = new Scene(loader.load(), 500, 400);
        PaymentController controller = loader.getController();
        controller.setMainApp(this);
        primaryStage.setScene(scene);
    }

    public void showSuccessScene() throws Exception {
        FXMLLoader loader = new FXMLLoader(
                getClass().getResource("success.fxml")
        );
        Scene scene = new Scene(loader.load(), 400, 300);
        primaryStage.setScene(scene);
    }

    public void showCheckoutScene() throws Exception {
        FXMLLoader loader = new FXMLLoader(
                getClass().getResource("checkout.fxml")
        );
        Scene scene = new Scene(loader.load(), 600, 400);

        CheckoutController controller = loader.getController();
        controller.setMainApp(this);

        primaryStage.setScene(scene);
    }


    public static void main(String[] args) {
        launch();
    }
}
