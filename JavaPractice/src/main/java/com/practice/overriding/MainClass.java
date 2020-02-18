package com.practice.overriding;

public class MainClass {
    public static void main(String[] args) {
        Child c1 = new Child();
        Parent p1 = new Parent();
        Parent p2 = new Child();
        c1.print();
        p1.print();
        p2.print();
    }
}
