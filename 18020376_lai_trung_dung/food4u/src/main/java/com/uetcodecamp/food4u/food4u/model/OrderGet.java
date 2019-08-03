package com.uetcodecamp.food4u.food4u.model;

public class OrderGet {
    private int txnId;
    private String restaurantName;
    private int amount;
    private String status;

    public int getTxnId() {
        return txnId;
    }

    public void setTxnId(int txnId) {
        this.txnId = txnId;
    }

    public String getRestaurantName() {
        return restaurantName;
    }

    public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public OrderGet(int txnId, String restaurantName, int amount, String status) {
        this.txnId = txnId;
        this.restaurantName = restaurantName;
        this.amount = amount;
        this.status = status;
    }
    public OrderGet() {}
}
