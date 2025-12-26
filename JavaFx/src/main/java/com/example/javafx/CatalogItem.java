package com.example.javafx;

public class CatalogItem {
    private int orderItemID;
    private String itemName;
    private double itemPrice;

    public CatalogItem(int orderItemID, String itemName, double itemPrice) {
        this.orderItemID = orderItemID;
        this.itemName = itemName;
        this.itemPrice = itemPrice;
    }

    public int getOrderItemID() {
        return orderItemID;
    }

    public String getItemName() {
        return itemName;
    }

    public double getItemPrice() {
        return itemPrice;
    }
}
