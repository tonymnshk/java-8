package com.learnJava.lamdas;

public class RunnableLamdaExample {
    public static void main(String[] args) {
        /**
         * prior Java 8
         */

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Inside Runnable 1");
            }
        };

        runnable.run();
        //new Thread(runnable).start();

        // java 8 lamda

        // () -> {};

        Runnable runnableLamda = () -> {
            System.out.println("Inside Runnable 2");
        };

        new Thread(runnableLamda).start();

        Runnable runnableLamda1 = () -> System.out.println("Inside Runnable 3");

        new Thread(runnableLamda1).start();

        new Thread(() -> System.out.println("Inside Runnable 4")).start();
    }
}
