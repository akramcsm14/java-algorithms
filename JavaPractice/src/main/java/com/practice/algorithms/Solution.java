package com.practice.algorithms;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int n, m, k;
        Scanner myInput = new Scanner(System.in);
        n = myInput.nextInt();
        m = myInput.nextInt();
        k = myInput.nextInt();
        int pos;
        //check m, k should be less than n
        if (m > n || k > n) {
            System.out.println("M or K can not be greater than N");
        }
        int[] A = new int[n];
        int[] B = new int[n];
        for (int i = 0; i < m; i++) {
            pos = myInput.nextInt();
            if (pos <= n) {
                A[pos - 1] = 1;
            }
        }
        for (int i = 0; i < k; i++) {
            pos = myInput.nextInt();
            B[i] = pos;
        }
        for (int i = 0; i < n; i++) {
            System.out.println(A[B[i] - 1]);
        }
    }
}