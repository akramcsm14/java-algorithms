package com.practice.csvparsing;

import com.practice.csvparsing.model.Discount;
import com.practice.csvparsing.model.Order;
import com.practice.csvparsing.model.Output;

import java.util.ArrayList;
import java.util.List;

public class CsvParsing {

    public static void main(String args[]) {
        Converter converter = new Converter();
        List<Discount> discountArrayList = converter.makeDiscountObjects();
        List<Order> orderArrayList = converter.makeOrderObjects();
        List<Output> outputs = new ArrayList<Output>();
        List<Discount> discounts;
//        for (Discount discount:
//                discountArrayList) {
//            System.out.println(discount.toString());
//        }

        for (Order order:
                orderArrayList) {
//            System.out.println(order.toString());
            discounts = availableDiscountForOrder(discountArrayList, order);
//            for (Discount discount:
//                    discounts) {
//                System.out.println(discount.toString());
//            }
            Output output;
            if (discounts.size() > 0) {
                if (discounts.get(0).getMaxDiscount() != 0) {
                    output = new Output(order.getOrderId(), discounts.get(0).getMaxDiscount(), discounts.get(0).getDiscountCode());
                } else {
                    output =  new Output(order.getOrderId(), discounts.get(0).getDiscount(), discounts.get(0).getDiscountCode());
                }
            } else {
                output = new Output(order.getOrderId(), 0, "");
            }
            outputs.add(output);
        }

        for (Output output:
             outputs) {
            System.out.println(output.toString());
        }
    }

    private static List<Discount> availableDiscountForOrder(List<Discount> discountArrayList, Order order) {
        List<Discount> discounts = new ArrayList<Discount>();
        List<Discount> discounts2 = new ArrayList<Discount>();
        List<Discount> discounts3 = new ArrayList<Discount>();
        //Filtering Order by time slot
        for (Discount discount:
                discountArrayList) {
            if (isOrderedInTimePeriod(order.getOrderTime(), discount.getStartTime(), discount.getEndTime())) {
                discounts.add(discount);
            }
        }
//        System.out.println("Filtered: "+ discounts.size());
//        for (Discount discount:
//                discounts) {
//            System.out.println(discount.toString());
//        }
        //Filter by minimum amount
        for (Discount discount:
                discounts) {
            //System.out.println(discount.getMinimumBillAmount() +":"+order.getBillAmount());
            if (discount.getMinimumBillAmount() <= order.getBillAmount()) {
                discounts2.add(discount);
            }
        }
//        for (Discount discount:
//                discounts2) {
//            System.out.println(discount.toString());
//        }
        //Filter By Payment Method
        for (Discount discount:
                discounts2) {
            if (discount.getPaymentMethod().equals("")) {
                discounts3.add(discount);
            } else if (discount.getPaymentMethod().equals(order.getPaymentMethod())) {
                discounts3.add(discount);
            }
        }
        //Choose best Discount for the order
        return discounts3;
    }

    private static boolean isOrderedInTimePeriod(Float orderTime, Float startTime, Float endTime) {
        return orderTime >= startTime && orderTime <= endTime;
    }

}
