package com.wchan.intro;

import java.util.stream.IntStream;

public class ImperativeVsDeclarativeEx1 {

    public static void main(String[] args) {

        /**
         * Imperative Style - how style of programming
         */

        // mutable not thread safe
        // external iteration
        // very verbose
        // stop and start threads manually

        int sum = 0;
        for(int i = 0; i <= 100; i++) {
            sum += i;
        }

        System.out.println("Sum using imperative approach: " + sum);

        /**
         * Declarative Style - what style of programing
         */

        // immutable
        // uses internal interation
        // runs as expected in the multithreaded environment by adding .parallel()
        // we don't care about the implementation, we just call the appropriate functions
        // to get the result we're looking for

        int sum1 = IntStream.rangeClosed(0,100)
                .parallel()
                .sum();

        System.out.println("Sum using declarative approach: " + sum1);
    }
}
