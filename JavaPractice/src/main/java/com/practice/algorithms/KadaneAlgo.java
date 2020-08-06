package com.practice.algorithms;

import static java.lang.Integer.max;

public class KadaneAlgo {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, -5, -7, 13, -10};
        int maxSum = numbers[0];
        int finalMax = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            maxSum = maxSum + numbers[i];
            if (maxSum < 0) {
                maxSum = 0;
            }
            finalMax = max(finalMax, maxSum);
        }
        System.out.println(finalMax);
    }
}
