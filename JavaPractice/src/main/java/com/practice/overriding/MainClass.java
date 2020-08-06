package com.practice.overriding;

public class MainClass {
    public static void main(String[] args) {
        Bird c1 = new Bird();
        Animal p1 = new Animal();
        Animal p2 = new Bird();
        c1.print();
        p1.print();
        p2.print();
//        System.out.println(p2.x);
    }
}
