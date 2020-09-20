package com.wchan.optional;

import java.util.Optional;

public class OptionalPresentExample {

    public static void main(String[] args) {

        // isPresent
        // Checks and return true if the optional contains a value
        Optional<String> optional = Optional.ofNullable("Hello");
        System.out.println(optional.isPresent());

        // ifPresent
        // Checks to see if optional has a value
        // Gives you access to the value via a consumer
        optional.ifPresent(s -> System.out.println(s));

    }
}
