package com.wchan.streams.parallelprocessing;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ParallelStreamPipelineExample {

    public static int sequentialSum(List<Integer> integerList) {
        long start = System.currentTimeMillis();
        final Integer result = integerList.stream()
                .reduce(0, (a, b) -> a + b);
        long duration = System.currentTimeMillis() - start;
        System.out.println(duration);
        return result;
    }

    public static int parallelSum(List<Integer> integerList) {
        long start = System.currentTimeMillis();
        final Integer result = integerList.parallelStream()
                .reduce(0, (a, b) -> a + b);    // unboxing Integer to int
        long duration = System.currentTimeMillis() - start;
        System.out.println(duration);
        return result;
    }


    public static void main(String[] args) {

        final List<Integer> integerList = IntStream.rangeClosed(1, 1000)
                .boxed()
                .collect(Collectors.toList());

        sequentialSum(integerList);
        parallelSum(integerList);
    }
}
