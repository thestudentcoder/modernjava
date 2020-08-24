package com.wchan.streams.factorymethods;

import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class StreamsOfGenerateIterateExample {

    // There are various ways of creating streams.
    // Of() creates a stream of values passed to it
    // iterate(), generate() are used to create infinite streams
    // generate takes a supplier

    // Use these methods whenever you need an on-demand Stream.

    public static void main(String[] args) {

        // Creating a string using of()
        Stream<String> stringStream = Stream.of("Jon", "Shepard");
        Stream.iterate(1, x -> x * 2)
                .limit(10)
                .forEach(System.out::println);  // continues until it overflows int

        Supplier<Integer> supplier = new Random()::nextInt;
        Stream.generate(supplier)
                .limit(10)
                .forEach(System.out::println);


    }
}
