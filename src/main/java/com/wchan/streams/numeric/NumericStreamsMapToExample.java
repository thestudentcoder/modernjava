package com.wchan.streams.numeric;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class NumericStreamsMapToExample {

    // mapToObj - convert each element in a numeric stream to some object
    // mapToLong - convert numeric stream to Long stream
    // mapToDouble - convert numeric stream to Double stream

    public static List<Integer> mapToObj() {
        // or map to any custom object
        return IntStream.rangeClosed(1,5).mapToObj(Integer::new)
                .collect(Collectors.toList());
    }

    public static Long maptoLong() {
        return IntStream.rangeClosed(1,5)
                // i value is passed from the IntStream
                .mapToLong(i -> i)  // convert IntStream to LongStream
                .sum();
    }

    public static double mapToDouble() {
        return IntStream.rangeClosed(1,5)
                // i value is passed from the IntStream
                .mapToDouble(i -> i)    // convert IntStream to DoubleStream
                .sum();
    }

    public static void main(String[] args) {
        System.out.println(mapToObj());
        System.out.println(maptoLong());
        System.out.println(mapToDouble());
    }
}
