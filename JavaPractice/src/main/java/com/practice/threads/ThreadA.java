package com.practice.threads;

import java.util.concurrent.atomic.AtomicInteger;

public class ThreadA extends Thread {
    private AtomicInteger currentValue = new AtomicInteger(0);
    private String name;
    static Object lock = new Object();

    protected ThreadA(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        synchronized (lock) {
            for (int i = 0; i < 10; i++) {
                if (name.equals("A")) {
                    try {
                        sleep(100L);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    currentValue.set(i);
                    System.out.println(name + " : " + i);
                } else if (currentValue.get() < i && name.equals("B")) {
                    System.out.println(name + " : " + i);
                } else if (currentValue.get() >= i) {
                    try {
                        System.out.println("lock: " + name);
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println(name);
                lock.notifyAll();
            }
        }
    }

    public static void main(String[] args) {
        ThreadA t1 = new ThreadA("A");
        ThreadA t2 = new ThreadA("B");
        t2.start();
        t1.start();
    }
}
