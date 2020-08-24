package com.wchan.streams.numeric;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class NumericStreamsBoxingUnboxingExample {

    public static List<Integer> boxing() {
        return IntStream.rangeClosed(1,10)
                // int
                .boxed()
                // Integer
                .collect(Collectors.toList());
    }

    public static int unboxing(List<Integer> integerList) {
        // wrapper to primitive
        return integerList.stream()
                // Wrapper Integer values
                .mapToInt(Integer::intValue)
                .sum();
    }

    public static void main(String[] args) {
        System.out.println(boxing());

        List<Integer> list = Arrays.asList(1,2,3,4,5);
        System.out.println(unboxing(list));
    }
}
