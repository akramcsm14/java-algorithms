package com.practice.algorithms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Denominations {
    public static void main(String[] args) {
        List<Integer> denominations = new ArrayList<Integer>();
        denominations.add(1);
        denominations.add(2);
        denominations.add(5);
        denominations.add(10);
        denominations.add(20);
        denominations.add(50);
        denominations.add(2000);
        denominations.add(100);
        denominations.add(500);
        calculateMinDenominationsCount(denominations, 1234);
        calculateMinDenominationsCount(denominations, 299);
        calculateMinDenominationsCount(denominations, 5501);
    }
    private static void calculateMinDenominationsCount (List<Integer> deno, int amount) {
        int[] notes = new int[deno.size()];
        int[] occurrence = new int[deno.size()];
        int times;
        Collections.sort(deno, Collections.<Integer>reverseOrder());
        int j = 0;
        for(int i = 0; i < deno.size(); i++) {
            if (amount > 0) {
                if (amount >= deno.get(i)) {
                    times = amount / deno.get(i);
                    amount = amount % deno.get(i);;
                    notes[j] = deno.get(i);
                    occurrence[j++] = times;
                }
            } else {
                break;
            }
        }
        System.out.println("-----------------------");
        for (int i = 0 ; i < j ; i++) {
            System.out.println(notes[i] + ":" +occurrence[i]);
        }
    }
}
