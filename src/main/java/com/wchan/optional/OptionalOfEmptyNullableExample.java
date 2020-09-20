package com.wchan.optional;

import java.util.Optional;

public class OptionalOfEmptyNullableExample {

    public static Optional<String> ofNullable() {
        // If you are not certain this would be a string all the time
        // then you would use Optional.ofNullable
        Optional<String> stringOptional = Optional.ofNullable("Hello");
        // This will give you an empty Optional object
        Optional<String> stringOptional2 = Optional.ofNullable("null");
        return stringOptional2;
    }

    public static Optional<String> of() {
        // of method expects you to always pass in a valid value as input.
        Optional<String> stringOptional = Optional.of("Hello");
        // This will give you a null pointer exception.
//        Optional<String> stringOptional2 = Optional.of(null);
        return stringOptional;
    }

    public static Optional<String> empty() {
        // Gives empty object as result
        return Optional.empty();
    }


    public static void main(String[] args) {
        System.out.println(ofNullable().get());
        System.out.println(of());
    }
}
