package com.practice.algorithms;

public class Power {
    static float power(float x, int y) {
        float temp;
        if (y == 0)
            return 1;
        temp = power(x, y / 2);

        if (y % 2 == 0)
            return temp * temp;
        else {
            if (y > 0)
                return x * temp * temp;
            else
                return (temp * temp) / x;
        }
    }

    static float powerNormal(float x, int y) {
        boolean isNegative = false;
        float result = 1;
        if (y == 0) {
            return 1;
        }
        if(y < 0) {
            isNegative = true;
            y = - y;
        }
        for (int i = 0 ; i < y; i++) {
            result = result * x;
        }
        if (isNegative) {
            result = 1/result;
        }
        return result;
    }

    /* Program to test function power */
    public static void main(String[] args) {
        float x = -2;
        int y = 3;
        System.out.printf("%f", power(x, y));
        System.out.printf(" %f", powerNormal(x, y));
        System.out.printf(" %f", Math.pow(x, y));
    }
}
