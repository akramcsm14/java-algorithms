package com.practice.csvparsing.model;

public class Discount {
    private String discountCode;
    private String discountType;
    private int discount;
    private int minimumBillAmount;
    private int maxDiscount;
    private Float startTime;  //24H
    private Float endTime;    //24H
    private String paymentMethod;

    public Discount(String discountCode, String discountType, int discount, int minimumBillAmount, int maxDiscount,
                    Float startTime, Float endTime, String paymentMethod) {
        this.discountCode = discountCode;
        this.discountType = discountType;
        this.discount = discount;
        this.minimumBillAmount = minimumBillAmount;
        this.maxDiscount = maxDiscount;
        this.startTime = startTime;
        this.endTime = endTime;
        this.paymentMethod = paymentMethod;
    }

    @Override
    public String toString() {
        return "Discount{" +
                "discountCode='" + discountCode + '\'' +
                ", discountType='" + discountType + '\'' +
                ", discount=" + discount +
                ", minimumBillAmount=" + minimumBillAmount +
                ", maxDiscount=" + maxDiscount +
                ", startTime=" + startTime +
                ", endTime=" + endTime +
                ", paymentMethod='" + paymentMethod + '\'' +
                '}';
    }

    public String getDiscountCode() {
        return discountCode;
    }

    public void setDiscountCode(String discountCode) {
        this.discountCode = discountCode;
    }

    public String getDiscountType() {
        return discountType;
    }

    public void setDiscountType(String discountType) {
        this.discountType = discountType;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public int getMinimumBillAmount() {
        return minimumBillAmount;
    }

    public void setMinimumBillAmount(int minimumBillAmount) {
        this.minimumBillAmount = minimumBillAmount;
    }

    public int getMaxDiscount() {
        return maxDiscount;
    }

    public void setMaxDiscount(int maxDiscount) {
        this.maxDiscount = maxDiscount;
    }

    public Float getStartTime() {
        return startTime;
    }

    public void setStartTime(Float startTime) {
        this.startTime = startTime;
    }

    public Float getEndTime() {
        return endTime;
    }

    public void setEndTime(Float endTime) {
        this.endTime = endTime;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }
}
