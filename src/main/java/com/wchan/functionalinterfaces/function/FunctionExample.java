package com.wchan.functionalinterfaces.function;

import java.util.function.Function;

public class FunctionExample {

    // Function takes in an input and gives an output
    // two default methods: compose and andThen

    static Function<String, String> function = name -> name.toUpperCase();
    static Function<String, String> addSomeString = name -> name.toUpperCase().concat("default");


    public static void main(String[] args) {
        System.out.println(function.apply("java8"));
        System.out.println(function.andThen(addSomeString).apply("java8"));
        // executes the first function passed into compose
        System.out.println(function.compose(addSomeString).apply("java8"));
    }
}
