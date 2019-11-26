/**
 * Copyright (c)  Ekagga Technology & Services Pvt Ltd
 * All rights reserved.
 * Created by Washim <akramcsm14@gmail.com>
 */
package com.practice.algorithms;

public class ReverseWords {
    public static void main(String args[]) {
        String result = reverseWordsTraditional("-  I love my   India       ");
        String result1 = reverseWords("-  I love my   India       ");
        System.out.println(result);
        System.out.println(result1);
    }

    private static String reverseWords(String src) {
        StringBuilder stringBuilderTemp = new StringBuilder();
        StringBuilder stringBuilder = new StringBuilder();
        for(int i = src.length()-1; i >= 0; i--) {
            if (src.charAt(i) != ' ') {
                stringBuilderTemp.append(src.charAt(i));
            }
            else {
//                System.out.println(stringBuilderTemp.length());
                if (stringBuilderTemp.length() == 0) {
                    stringBuilder.append(" ");
                }
                if (stringBuilderTemp.length() > 0) {
                    stringBuilder.append(stringBuilderTemp.reverse().toString()).append(" ");
                    stringBuilderTemp.setLength(0);
                }
            }
        }
        stringBuilder.append(stringBuilderTemp.reverse().toString());
        return stringBuilder.toString();
    }

    private static String reverseWordsTraditional(String src) {
        StringBuilder stringBuilder = new StringBuilder();
        String[] temp = src.split(" ");
        for(int i = temp.length-1; i >= 0; i--) {
            stringBuilder = stringBuilder.append(temp[i]).append(" ");
        }
        return stringBuilder.toString().trim();
    }
}
