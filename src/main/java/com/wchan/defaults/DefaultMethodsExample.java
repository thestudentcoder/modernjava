package com.wchan.defaults;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class DefaultMethodsExample {

    public static void main(String[] args) {
        // Sort the list of names in alphabetical order
        List<String> stringList = Arrays.asList("Adam", "Jenny", "Alex", "Dan", "Mike", "Eric");

        // Prior Java 8
//        Collections.sort(stringList);
//        System.out.println("Sorted list using Collections.sort(): " + stringList);

        // Java 8
        // List interface has a lot of default methods as of Java 8
        // Sort method takes in a comparator.  Comparator has a method called naturalOrder() which informs
        // the sort method to sort in ascending order.
        stringList.sort(Comparator.naturalOrder());
        stringList.sort(Comparator.reverseOrder());
        System.out.println(stringList);
    }
}
