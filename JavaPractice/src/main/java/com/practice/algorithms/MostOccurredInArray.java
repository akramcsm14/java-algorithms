package com.practice.algorithms;

import java.util.HashMap;
import java.util.Map;

public class MostOccurredInArray {
    public static void main(String[] args) {
        int[] input = {1, 2, 3, 4, 5, 0, 1, 2, 0, 2, 0};
        int maxKey = -1, maxValue = -1;
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int number : input) {
            if (map.get(number) == null) {
                map.put(number, 1);
            } else {
                map.put(number, map.get(number) + 1);
            }
        }
        for (Map.Entry<Integer, Integer> integerIntegerEntry : map.entrySet()) {
            Map.Entry elem = (Map.Entry) integerIntegerEntry;
            if (Integer.parseInt(elem.getValue().toString()) > maxValue) {
                maxValue = Integer.parseInt(elem.getValue().toString());
                maxKey = Integer.parseInt(elem.getKey().toString());
            }
        }
        if (maxKey != -1) {
            System.out.println("Max occurred element: " + maxKey);
            System.out.println(maxKey + " occurred " + maxValue + " times...");
        }
    }
}
