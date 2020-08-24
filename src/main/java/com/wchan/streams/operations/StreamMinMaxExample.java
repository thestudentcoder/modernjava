package com.wchan.streams.operations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamMinMaxExample {

    // Find the min and max value using the Reduce function
    // we should avoid assigning a default value for this
    // because empty list will return 0 which is not correct
    public static int findMaxValue(List<Integer> integerList) {
        return integerList.stream()
                .reduce(0, (a,b) -> a > b? a : b);
    }

    public static Optional<Integer> findMaxValueOptional(List<Integer> integerList) {
        return integerList.stream()
                .reduce((a,b) -> a > b? a : b);
    }

    public static Optional<Integer> findMinValueOptional(List<Integer> integerList) {
        return integerList.stream()
                .reduce((a,b) -> a < b? a : b);
    }

    public static void main(String[] args) {

        List<Integer> integerList = Arrays.asList(6,7,8,9,10);
        List<Integer> emptyList = new ArrayList<>();
        System.out.println(findMaxValueOptional(integerList).get());
        System.out.println(findMaxValueOptional(emptyList));
        System.out.println(findMinValueOptional(integerList).get());
    }
}
