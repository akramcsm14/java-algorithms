package com.practice.algorithms;

public class FindStairs {
    public static void main(String[] args) {
        int noOfBlocks = 30;
        int stairs = countStairs(noOfBlocks);
        System.out.println(stairs);
    }

    private static int countStairs(int availableBricks) {
        int noOfStairs = 0;
        int bricksNeeded = 1;
        while (availableBricks >= bricksNeeded) {
            availableBricks = availableBricks - bricksNeeded;
            bricksNeeded++;
            noOfStairs++;
        }
        return noOfStairs;
    }
}
