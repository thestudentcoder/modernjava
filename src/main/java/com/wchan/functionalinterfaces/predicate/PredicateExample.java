package com.wchan.functionalinterfaces.predicate;

import java.util.function.Predicate;

public class PredicateExample {

    // Predicate will take some input, perform some operation, and return a Boolean
    // Supports And and Negate operations
    static Predicate<Integer> p1 = (i) -> i % 2 == 0;
    static Predicate<Integer> p2 = (i) -> i % 5 == 0;

    public static void predicateAnd() {
        System.out.println(p1.and(p2).test(10));
        System.out.println(p1.and(p2).test(9));
    }

    public static void predicateOr() {
        System.out.println(p1.or(p2).test(10));     // true
        System.out.println(p1.or(p2).test(8));      // true
    }

    public static void predicateNegate() {
        // Negate is a method which will reverse the result
        System.out.println(p1.or(p2).negate().test(10));    // false
        System.out.println(p1.or(p2).negate().test(8));     // false
    }

    public static void main(String[] args) {

        System.out.println(p1.test(2));
        System.out.println(p1.test(3));
        predicateAnd();
        predicateOr();
        predicateNegate();

    }
}
