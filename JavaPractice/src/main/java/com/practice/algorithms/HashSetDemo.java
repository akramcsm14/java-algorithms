package com.practice.algorithms;

public class HashSetDemo {
    public static void main(String args[])
    {
        String string = "new Date(ISODate().getTime() - 20*60*60*24*1000)},";
        int i = string.indexOf("ISODate()");
        int j = string.indexOf(")},");
        String str = string.substring(i, j);
        String[] arr = str.split("-");
        System.out.println(i+":"+j+": "+str+" : "+arr[1].trim());
        String[] arr2 = arr[1].trim().split("\\*");
        long res = 1;
        for (String str2:arr2) {
            res = res * Long.parseLong(str2);
            System.out.println(str2);
        }
        System.out.println(res);
    }
}