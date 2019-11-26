package com.practice.csvparsing.model;

public class Output {
    private String orderId;
    private int discountApplied;
    private String discountCode;

    public Output(String orderId, int discountApplied, String discountCode) {
        this.orderId = orderId;
        this.discountApplied = discountApplied;
        this.discountCode = discountCode;
    }

    @Override
    public String toString() {
        return "Output{" +
                "orderId='" + orderId + '\'' +
                ", discountApplied=" + discountApplied +
                ", discountCode='" + discountCode + '\'' +
                '}';
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public int getDiscountApplied() {
        return discountApplied;
    }

    public void setDiscountApplied(int discountApplied) {
        this.discountApplied = discountApplied;
    }

    public String getDiscountCode() {
        return discountCode;
    }

    public void setDiscountCode(String discountCode) {
        this.discountCode = discountCode;
    }
}
