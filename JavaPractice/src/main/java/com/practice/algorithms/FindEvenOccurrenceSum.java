package com.practice.algorithms;

import java.util.HashMap;

public class FindEvenOccurrenceSum {
    public static void main(String[] args) {
        int sum = 0;
        int[] inputArr = {1, 2, 3, 4, 5, 6, 6, 8, 8, 4, 10};
        HashMap<Integer, Integer> myMap = new HashMap<Integer, Integer>();
        for (int a : inputArr) {
            if (myMap.get(a) != null) {
                myMap.put(a, myMap.get(a) + 1);
            } else {
                myMap.put(a, 1);
            }
        }
        for (HashMap.Entry<Integer, Integer> entry : myMap.entrySet()) {
            if (entry.getValue() % 2 == 0) {
                sum += entry.getKey();
            }
        }
        System.out.println(sum);
    }
}
