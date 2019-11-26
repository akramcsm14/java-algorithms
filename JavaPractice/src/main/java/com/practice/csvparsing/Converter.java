package com.practice.csvparsing;

import com.opencsv.CSVReader;
import com.practice.csvparsing.model.Discount;
import com.practice.csvparsing.model.Order;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Converter {

    public static List<Discount> makeDiscountObjects() {
        String csvFile = "/home/ekagga/Desktop/discounts.csv";
        List<Discount> discountArrayList = new ArrayList<Discount>();
        CSVReader reader = null;
        int discount, minimumBillAmount, maxDiscount;
        try {
            reader = new CSVReader(new FileReader(csvFile));
            String[] line;
            int i = 0;
            while ((line = reader.readNext()) != null) {
                if (i != 0) {
                    Float arr[] = to24HoursFromPair(line[5]);
                    discount = Integer.parseInt(line[2]);
                    if (line[3].equals("")) {
                        minimumBillAmount = 0;
                    } else {
                        minimumBillAmount = Integer.parseInt(line[3]);
                    }
                    if (line[4].equals("")) {
                        maxDiscount = 0;
                    } else {
                        maxDiscount = Integer.parseInt(line[4]);
                    }
                    Discount discountObj = new Discount(line[0], line[1], discount, minimumBillAmount, maxDiscount,
                            arr[0], arr[1], line[6]);
                    discountArrayList.add(discountObj);
                }
                i++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return discountArrayList;
    }

    public static List<Order> makeOrderObjects() {
        String csvFile = "/home/<user>/Desktop/orders.csv";
        List<Order> orderArrayList = new ArrayList<Order>();
        CSVReader reader = null;
        try {
            reader = new CSVReader(new FileReader(csvFile));
            String[] line;
            int i = 0;
            while ((line = reader.readNext()) != null) {
                if (i != 0) {
                    Float timeOfOrder = to24Hour(line[2]);
                    Order orderObj = new Order(line[0], Integer.parseInt(line[1]), timeOfOrder, line[3]);
                    orderArrayList.add(orderObj);
                }
                i++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return orderArrayList;
    }

    private static float to24Hour(String timeOfDay) {
        if (timeOfDay.contains("PM")) {
            return Float.parseFloat(timeOfDay.replace("PM", "")) + 12;
        } else {
            return Float.parseFloat(timeOfDay.replace("AM", ""));
        }
    }

    private static Float[] to24HoursFromPair(String timeOfDay) {
        String timeOfDayArr[] = timeOfDay.split("-");
        String startTime = timeOfDayArr[0];
        String endTime = timeOfDayArr[1];
        Float result[] = new Float[2];
        if (startTime.contains("PM")) {
            result[0] = Float.parseFloat(startTime.replace("PM", "")) + 12;
        } else {
            result[0] = Float.parseFloat(startTime.replace("AM", ""));
        }
        if (endTime.contains("PM")) {
            result[1] = Float.parseFloat(endTime.replace("PM", "")) + 12;
        } else {
            result[1] = Float.parseFloat(endTime.replace("AM", ""));
        }
        return result;
    }
}
