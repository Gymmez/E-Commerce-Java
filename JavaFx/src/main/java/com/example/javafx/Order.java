package com.example.javafx;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private String orderID;
    private List<CatalogItem> orderItems;
    private double price;

    public Order(String orderID) {
        this.orderID = orderID;
        this.orderItems = new ArrayList<>();
        this.price = 0.0;
    }

    // Getters
    public String getOrderID() {
        return orderID;
    }

    public List<CatalogItem> getOrderItems() {
        return orderItems;
    }

    public double getPrice() {
        return price;
    }

    public void addItem(CatalogItem item) {
        orderItems.add(item);
        recalculatePrice();
    }

    // Display all items
    public void displayOrderItems() {
        for (CatalogItem item : orderItems) {
            System.out.println(item);
        }
    }

    // Recalculate total price
    private void recalculatePrice() {
        double total = 0;
        for (CatalogItem item : orderItems) {
            total += item.getItemPrice();
        }
        this.price = total;
    }

    // Convert Order to JSON
    public String toPostJson(int ordercustomerID) {
        StringBuilder itemsJson = new StringBuilder();
        itemsJson.append("[");
        for (int i = 0; i < orderItems.size(); i++) {
            itemsJson.append(orderItems.get(i).toJson());
            if (i < orderItems.size() - 1) itemsJson.append(",");
        }
        itemsJson.append("]");

        return """
            {
                "ordercustomerID": "%d",
                "orderItems": %s
            }
            """.formatted(ordercustomerID, itemsJson);
    }

    @Override
    public String toString() {
        return "Order{orderID='" + orderID + "', price=" + price + ", items=" + orderItems + "}";
    }
}
