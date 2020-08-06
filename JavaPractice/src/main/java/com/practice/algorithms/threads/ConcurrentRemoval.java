package com.practice.algorithms.threads;

import java.util.ArrayList;
import java.util.Arrays;

public class ConcurrentRemoval {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 24, -1, 8, -3, 0));
        for (Integer i : list) {
            if (i < 0) {
                list.remove(i);  //ConcurrentModificationException
            }
        }

        System.out.println(list);
        for (int i = list.size() - 1; i >= 0; i--) {
            Integer item = list.get(i);
            if (item < 0) {
//                list.remove(item);
            }
        }
        System.out.println(list);
    }
}
