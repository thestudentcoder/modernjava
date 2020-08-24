package com.wchan.streams.numeric;

import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.OptionalLong;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class NumericStreamsAggregateExample {

    public static void main(String[] args) {

        final int sum = IntStream.rangeClosed(1, 50).sum();
        System.out.println(sum);

        final OptionalInt max = IntStream.rangeClosed(1, 50).max();
        System.out.println(max.getAsInt());

        final OptionalLong min = LongStream.rangeClosed(50, 100).min();
        System.out.println(min.getAsLong());

        final OptionalDouble average = IntStream.rangeClosed(1, 50).average();
        System.out.println(average.getAsDouble());
    }
}
