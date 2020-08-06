package com.practice.algorithms;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Anagram {
    public static void main(String[] args) {
        List<Character> list1 = Arrays.asList('a', 'b', 'c', 'd', 'e');
        List<Character> list2 = Arrays.asList('a', 'b', 'e', 'd', 'c');
        Collections.sort(list1);
        Collections.sort(list2);
//        list1.sort((character, t1) -> character.compareTo(t1));
//        list2.sort((character, t1) -> character.compareTo(t1));
        System.out.println(list1);
        System.out.println(list2);
        if (list1.equals(list2)) {
            System.out.println("Anagram");
        } else {
            System.out.println("Not Anagram");
        }
    }
}
