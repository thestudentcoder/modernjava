package com.wchan.functionalinterfaces.function;

import java.util.Comparator;
import java.util.function.BinaryOperator;

public class BinaryOperatorExample {

    // BinaryOperator takes 2 parameters of the same type and returns the same type.
    // 2 additional static methods: minBy and maxBy that both accept a comparator
    static Comparator<Integer> comparator = (a,b) -> a.compareTo(b);

    public static void main(String[] args) {
        BinaryOperator<Integer> binaryOperator = (a,b) -> a * b;
        System.out.println(binaryOperator.apply(2,3));

        BinaryOperator<Integer> maxBy = BinaryOperator.maxBy(comparator);
        System.out.println(maxBy.apply(2,3));   // return largest value

        BinaryOperator<Integer> minBy = BinaryOperator.minBy(comparator);
        System.out.println(minBy.apply(2,3));   // return largest value
    }
}
