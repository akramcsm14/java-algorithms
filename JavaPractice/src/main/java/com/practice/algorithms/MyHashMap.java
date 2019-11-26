package com.practice.algorithms;

import java.util.LinkedList;

public class MyHashMap{

    public static void main(String args[]) {
        String keys[] = {"A", "B", "B", "C", "D"};
        int values[] = {4, 5, 6, 7, 8};
        convert(5, keys, values);
    }

    private static void convert (int n, String s[], int ar[]) {
        LinkedList<MyMap> ll = new LinkedList<MyMap>();
        boolean isKeyAvailable;
        for (int i = 0; i < n; i++) {
            isKeyAvailable = false;
            MyMap tmp = new MyMap(s[i], ar[i]);//missed this and wrote as MyMap tmp;
            for (int j = 0; j < ll.size(); j++) {
                MyMap tmp2 = ll.get(j); //and was writing tmp = ll.get(j);
                if (tmp2.getKey().equals(s[i])) {
                    isKeyAvailable = true;
                    break;
                }
            }
            if (!isKeyAvailable) {
                ll.addLast(tmp);
            }
        }
        for (int j = 0; j < ll.size(); j++) {
            System.out.println(ll.get(j).getKey()+":"+ll.get(j).getValue());
        }
    }
}


class MyMap{
    private String key;
    private int value;

    public MyMap(String key, int value) {
        this.key = key;
        this.value = value;
    }

    public String getKey() {
        return this.key;
    }

    public int getValue() {
        return this.value;
    }
}