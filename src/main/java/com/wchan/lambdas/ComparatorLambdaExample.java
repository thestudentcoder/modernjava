package com.wchan.lambdas;

import java.util.Comparator;

public class ComparatorLambdaExample {

    public static void main(String[] args) {

        // Comparable interface has a compare method that can compare two objects of any type.
        // The idea is to write your own logic on how you want to compare the inputs in your implementation.

        /**
         * Preior to Java 8
         */
        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);  // 0 -> o1 == o2, 1 -> o1 > o2, -1 -> o1 < o2
            }
        };

        System.out.println("Result of the comparator is: "+  comparator.compare(3,2));

        /**
         * Java 8 Lambdas
         */
        Comparator<Integer> comparatorLambda = (o1,o2) -> o1.compareTo(o2);

        System.out.println(comparatorLambda.compare(3,2));
    }
}
