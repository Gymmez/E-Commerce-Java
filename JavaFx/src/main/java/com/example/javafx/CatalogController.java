package com.example.javafx;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class CatalogController {

    private HelloApplication mainApp;

    @FXML
    private TableView<CatalogItem> table;

    @FXML
    private TableColumn<CatalogItem, Integer> idColumn;

    @FXML
    private TableColumn<CatalogItem, String> nameColumn;

    @FXML
    private TableColumn<CatalogItem, Double> priceColumn;

    @FXML
    public void initialize() {
        idColumn.setCellValueFactory(new PropertyValueFactory<>("orderItemID"));
        nameColumn.setCellValueFactory(new PropertyValueFactory<>("itemName"));
        priceColumn.setCellValueFactory(new PropertyValueFactory<>("itemPrice"));

        table.getItems().addAll(
                new CatalogItem(1, "Laptop", 1200.0),
                new CatalogItem(2, "Phone", 800.0),
                new CatalogItem(3, "Headphones", 150.0)
        );
    }

    public void setMainApp(HelloApplication mainApp) {
        this.mainApp = mainApp;
    }

    // 🛒 ADD TO CART
    @FXML
    private void addToCart() {
        CatalogItem selectedItem = table.getSelectionModel().getSelectedItem();

        if (selectedItem == null) {
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setTitle("No Item Selected");
            alert.setHeaderText(null);
            alert.setContentText("Please select an item to add to cart.");
            alert.showAndWait();
            return;
        }

        // Add item to order
        mainApp.getCurrentOrder().addItem(selectedItem);

        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Added to Cart");
        alert.setHeaderText(null);
        alert.setContentText(selectedItem.getItemName() + " added to cart!");
        alert.showAndWait();
    }

    // ➡ Go to Checkout
    @FXML
    private void goToCheckout() throws Exception {
        mainApp.showCheckoutScene();
    }
}
