package com.wchan.streams.operations;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamsLimitSkipExample {

    public static Optional<Integer> limit(List<Integer> integers) {
        // Limit method will only process first two elements in the stream
        return integers.stream()
                .limit(2)
                .reduce((a,b) -> a + b);
    }

    public static Optional<Integer> skip(List<Integer> integers) {
        // Skip method will skip first three elements and process the remaining elements
        return integers.stream()
                .skip(3)
                .reduce((a,b) -> a + b);
    }


    public static void main(String[] args) {

        List<Integer> integers = Arrays.asList(6,7,8,9,10);
        System.out.println(limit(integers).get());
        System.out.println(skip(integers).get());
    }
}
