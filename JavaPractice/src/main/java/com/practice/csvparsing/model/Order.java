package com.practice.csvparsing.model;

public class Order {
    private String orderId;
    private int billAmount;
    private Float orderTime;
    private String paymentMethod;

    public Order(String orderId, int billAmount, Float orderTime, String paymentMethod) {
        this.orderId = orderId;
        this.billAmount = billAmount;
        this.orderTime = orderTime;
        this.paymentMethod = paymentMethod;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId='" + orderId + '\'' +
                ", billAmount=" + billAmount +
                ", orderTime=" + orderTime +
                ", paymentMethod='" + paymentMethod + '\'' +
                '}';
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public int getBillAmount() {
        return billAmount;
    }

    public void setBillAmount(int billAmount) {
        this.billAmount = billAmount;
    }

    public Float getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(Float orderTime) {
        this.orderTime = orderTime;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }
}
