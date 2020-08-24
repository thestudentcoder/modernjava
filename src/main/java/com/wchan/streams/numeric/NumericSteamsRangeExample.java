package com.wchan.streams.numeric;

import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class NumericSteamsRangeExample {

    public static void main(String[] args) {
        IntStream.rangeClosed(1,50).forEach(i -> System.out.print(i + " "));
        System.out.println("\n");
        IntStream.range(1,50).forEach(i -> System.out.print(i + " "));
        System.out.println("\n");

        LongStream.rangeClosed(1,50).forEach(i -> System.out.print(i + " "));
        System.out.println("\n");
        LongStream.range(1,50).forEach(i -> System.out.print(i + " "));
        System.out.println("\n");

        // For DoubleStream we convert it from IntStream
        IntStream.range(1,50).asDoubleStream().forEach(i -> System.out.print(i + " "));
        System.out.println("\n");
        IntStream.rangeClosed(1,50).asDoubleStream().forEach(i -> System.out.print(i + " "));


    }
}
