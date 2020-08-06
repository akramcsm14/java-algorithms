package com.practice.algorithms;

import java.util.TreeMap;

public class Key implements Comparable<Key> {
    private String key = "hello";

    @Override
    public int compareTo(Key key) {
        return this.key.compareTo(key.key);
    }
}

class TreeMapExpl {

    public static void main(String[] args) {
        TreeMap<Key, Integer> myTree = new TreeMap<>();
        myTree.put(new Key(), 1);
        myTree.put(new Key(), 2);
        System.out.println(myTree.values());
        //Sort binary array
        int[] arr = {1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0};
        for (int i = 0, j = arr.length - 1; i < j; ) {
            while (arr[i] == 0 && i < j)
                i++;
            while (arr[j] == 1 && i < j)
                j--;
            if (arr[i] != arr[j] && i < j) {
                arr[i] = 0;
                arr[j] = 1;
                i++;
                j--;
            }
        }
        for (int i : arr) {
            System.out.print(i + ", ");
        }
        System.out.println();
        int[] arr2 = {1, 2, 2, 2, 2, 2, 2, 4, 4, 4, 4, 4, 5, 5, 5, 6, 7, 7, 8, 9};
        System.out.println(findFirstOccurranceInSortedArray(arr2, 7));
        System.out.println(findLastOccurranceInSortedArray(arr2, 7));

    }

    public static int findLastOccurranceInSortedArray(int[] arr, int key) {
        int start = 0;
        int end = arr.length - 1;
        int index = -1;
        int pivot;
        while (start <= end) {
            pivot = (start + end) / 2;
            if (key == arr[pivot]) {
                index = pivot;
                start = pivot + 1;
            } else if (key > arr[pivot]) {
                start = pivot + 1;
            } else {
                end = pivot - 1;
            }
        }
        return index;
    }

    public static int findFirstOccurranceInSortedArray(int[] arr, int key) {
        int start = 0;
        int end = arr.length - 1;
        int index = -1;
        int pivot;
        while (start <= end) {
            pivot = (start + end) / 2;
            if (key == arr[pivot]) {
                index = pivot;
                end = pivot - 1;
            } else if (key > arr[pivot]) {
                start = pivot + 1;
            } else {
                end = pivot - 1;
            }
        }
        return index;
    }
}