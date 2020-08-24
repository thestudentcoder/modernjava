package com.wchan.intro;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ImperativeVsDeclarativeEx2 {

    public static void main(String[] args) {

        List<Integer> integerList = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        // remove duplicates and output unique values

        /**
         * Imperative
         */
        List<Integer> outputList = new ArrayList<>();

        for (Integer integer : integerList) {
            if (!outputList.contains(integer)) {
                outputList.add(integer);
            }
        }

        System.out.println(outputList);

        /**
         * Declarative
         */
        // Create a stream, using the distinct method, and collect the values as a list
        List<Integer> outputList1 = integerList.stream()
                .distinct()
                .collect(Collectors.toList());

        System.out.println(outputList1);
    }
}
