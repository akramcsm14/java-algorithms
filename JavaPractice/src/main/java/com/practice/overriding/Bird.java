package com.practice.overriding;

public class Bird extends Animal {
    Integer x = 5;
    public void print() {
        System.out.println("Child");
    }
/*
    public Integer num() {
        System.out.println("Child");
        return 1;
    }

    public Float num() {
        System.out.println("Child");
        return 1.0f;
    }*/
}
