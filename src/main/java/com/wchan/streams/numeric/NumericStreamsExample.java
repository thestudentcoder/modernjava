package com.wchan.streams.numeric;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class NumericStreamsExample {

    // Use IntStream when working with numbers

    public static int sumOfNumbers(List<Integer> integerList) {

        return integerList.stream()
                .reduce(0, (a,b) -> a + b); // unboxing to convert Integer to int
    }

    public static int sumOfNumberIntStream() {
        return IntStream.rangeClosed(1,6) // pass values one by one: 1,2,3,4,5,6
                .sum(); // sum will get these values and perform the accumulation to get the sum
    }

    public static void main(String[] args) {

        List<Integer> integerList = Arrays.asList(1,2,3,4,5,6);
        System.out.println(sumOfNumbers(integerList));
    }
}
