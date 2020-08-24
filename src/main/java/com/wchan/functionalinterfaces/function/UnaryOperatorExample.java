package com.wchan.functionalinterfaces.function;

import java.util.function.UnaryOperator;

public class UnaryOperatorExample {

    // UnaryOperator takes in one type and returns the same type
    // We would use unary operator when the inputs and outputs are of the same type.
    static UnaryOperator<String> unaryOperator = (s) -> s.concat("default");

    public static void main(String[] args) {

        System.out.println(unaryOperator.apply("java8"));

    }
}
