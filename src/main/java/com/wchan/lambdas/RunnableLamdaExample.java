package com.wchan.lambdas;

public class RunnableLamdaExample {

    public static void main(String[] args) {
        /**
         * Prior to Java 8
         */

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Inside runnable 1");
            }
        };

        new Thread(runnable).start();

        /**
         * Java 8 Lambda
         */

        Runnable runnable1 = () -> System.out.println("Inside runnable labmda");
        new Thread(runnable1).start();

        /**
         * Inline
         */
        new Thread(() -> System.out.println("Inside runnable inline")).start();
    }
}
