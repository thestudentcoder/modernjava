package com.wchan.lambdas;

import java.util.function.Consumer;

public class LambdaVariable {

    // No restrictions for class or instance variables we are allowed to modify
    static int value = 5;

    public static void main(String[] args) {

        // As long as n is not reassigned it is effectively final and we can use it inside the lambda
        // for local variables the value cannot be changed
        int n = 2;

        Consumer<Integer> consumer = i -> System.out.println(++value);
    }
}
