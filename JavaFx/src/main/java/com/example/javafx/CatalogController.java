package com.example.javafx;

import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class CatalogController {

    // 🔹 reference to Main app (needed for scene switching)
    private HelloApplication mainApp;

    @FXML
    private TableView<CatalogItem> table;

    @FXML
    private TableColumn<CatalogItem, Integer> idColumn;

    @FXML
    private TableColumn<CatalogItem, String> nameColumn;

    @FXML
    private TableColumn<CatalogItem, Double> priceColumn;

    // 🔹 called automatically after FXML loads
    @FXML
    public void initialize() {
        idColumn.setCellValueFactory(new PropertyValueFactory<>("orderItemID"));
        nameColumn.setCellValueFactory(new PropertyValueFactory<>("itemName"));
        priceColumn.setCellValueFactory(new PropertyValueFactory<>("itemPrice"));

        // Sample data
        table.getItems().addAll(
                new CatalogItem(1, "Laptop", 1200.0),
                new CatalogItem(2, "Phone", 800.0),
                new CatalogItem(3, "Headphones", 150.0)
        );
    }

    // 🔹 Main passes itself here
    public void setMainApp(HelloApplication mainApp) {
        this.mainApp = mainApp;
    }

    // 🔹 Button action: Go to Checkout (Scene 3)
    @FXML
    private void goToCheckout() throws Exception {
        mainApp.showCheckoutScene();
    }
}
