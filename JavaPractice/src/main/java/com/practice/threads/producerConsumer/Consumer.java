package com.practice.threads.producerConsumer;

public class Consumer extends Thread {
    private Producer producer;

    public Consumer(Producer producer) {
        this.producer = producer;
    }

    @Override
    public void run() {

        try {
            while (true) {
                String data = producer.consume();
                System.out.println("Consumer: " + Thread.currentThread().getName() + " data: " + data);
                Thread.sleep(500);
            }
        } catch (Exception e) {

        }
    }
}
