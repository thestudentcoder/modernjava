package com.wchan.methodreferences;

import java.util.function.Function;

public class FunctionMethodReferenceExample {

    // We can use method references is the lambda expression is calling the method directly

    static Function<String, String> toUpperCaseLambda = (s) -> s.toUpperCase();
    static Function<String, String> toUpperCaseMethodReference = String::toUpperCase;

    public static void main(String[] args) {
        toUpperCaseLambda.apply("java8");
        toUpperCaseMethodReference.apply("java8");
    }
}
