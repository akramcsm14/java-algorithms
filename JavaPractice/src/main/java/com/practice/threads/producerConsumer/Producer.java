package com.practice.threads.producerConsumer;

import java.time.LocalTime;
import java.util.ArrayList;

public class Producer extends Thread {
    private final int MAX_SIZE = 3;
    private ArrayList<String> list = new ArrayList<>();

    @Override
    public void run() {
        try {
            while (true) {
                produce();
            }
        } catch (Exception e) {

        }
    }

    private synchronized void produce() throws Exception {
        while (list.size() == MAX_SIZE) {
            System.out.println("List size full");
            wait();
            System.out.println("Consumed by consumer and got notification");
        }
        String data = LocalTime.now().toString();
        list.add(data);
        System.out.println("Producer produced data: " + data);
        notify();
    }

    public synchronized String consume() throws Exception {
        while (list.isEmpty()) {
            wait();
        }
        String data = list.get(0);
        list.remove(data);
        notify();
        return data;
    }
}
