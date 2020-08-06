package com.practice.Map;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class SortMapByKey {
    // This map stores unsorted values
    static Map<String, Integer> map = new HashMap<>();

    // Function to sort map by Key
    public static void sortbykey() {
        // TreeMap to store values of HashMap
        TreeMap<String, Integer> sorted = new TreeMap<>();

        // Copy all data from hashMap into TreeMap
        sorted.putAll(map);

        // Display the TreeMap which is naturally sorted
        for (Map.Entry<String, Integer> entry : sorted.entrySet())
            System.out.println("Key = " + entry.getKey() +
                    ", Value = " + entry.getValue());
    }

/*
    Comparator<Entry<String, String>> valueComparator = new Comparator<Entry<String,String>>() {
        @Override public int compare(Entry<String, String> e1, Entry<String, String> e2) {
            String v1 = e1.getValue();
            String v2 = e2.getValue();
            return v1.compareTo(v2);
        }
    };

    Read more: https://www.java67.com/2015/01/how-to-sort-hashmap-in-java-based-on.html#ixzz6RxYYpDXl

*/



    // Driver Code
    public static void main(String args[]) {
        // putting values in the Map
        map.put("Jayant", 80);
        map.put("Abhishek", 90);
        map.put("Anushka", 80);
        map.put("Amit", 75);
        map.put("Danish", 40);

        // Calling the function to sortbyKey
        sortbykey();
    }
}
