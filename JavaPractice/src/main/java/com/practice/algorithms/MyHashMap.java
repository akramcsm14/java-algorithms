package com.practice.algorithms;

import java.util.LinkedList;

public class MyHashMap {

    public static void main(String[] args) {
        String[] keys= {"A", "B", "B", "C", "D"};
        int[] values = {4, 5, 6, 7, 8};
        convert(5, keys, values);
    }

    private static void convert(int n, String s[], int ar[]) {
        LinkedList<MyMap> ll = new LinkedList<MyMap>();
        boolean isKeyAvailable;
        for (int i = 0; i < n; i++) {
            isKeyAvailable = false;
            MyMap tmp = new MyMap(s[i], ar[i]);//missed this and wrote as MyMap tmp;
            for (MyMap tmp2 : ll) {
                if (tmp2.getKey().equals(s[i])) {
                    isKeyAvailable = true;
                    break;
                }
            }
            if (!isKeyAvailable) {
                ll.addLast(tmp);
            }
        }
        for (MyMap myMap : ll) {
            System.out.println(myMap.getKey() + ":" + myMap.getValue());
        }
    }
}


class MyMap {
    private String key;
    private int value;

    MyMap(String key, int value) {
        this.key = key;
        this.value = value;
    }

    String getKey() {
        return this.key;
    }

    int getValue() {
        return this.value;
    }
}