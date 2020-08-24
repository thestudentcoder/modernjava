package com.wchan.streams.operations;

import com.wchan.data.Student;
import com.wchan.data.StudentDataBase;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamsReduceExample {

    // Reduce is a terminal operation used to reduce the contents of a stream to a single value.
    // It takes 2 parameters - default or initial value, BinaryOperator<T>.
    // A BinaryOperator is a Function that takes two inputs of the same type and returns an output
    // of the same type.

    // These are the popular use cases.

    public static int performMultiplication(List<Integer> integers) {
        // a = 1, b = 1 (from stream)
        // a = 1 (previous step), b = 3 (from stream)
        // a = 3 (from previous step), b = 5
        return integers.stream()
                .reduce(1, (a, b) -> a * b);
    }

    public static Optional<Integer> performMultiplicationWithoutIdentity(List<Integer> integers) {
        // Returns Optional<Integer> when there is no identity specified
        return integers.stream()
                .reduce((a, b) -> a * b);
    }

    public static Optional<Student> getHighestGpaStudent() {
        return StudentDataBase.getAllStudents().stream()
                .reduce((s1,s2) -> s1.getGpa() > s2.getGpa()? s1 : s2);
    }


    public static void main(String[] args) {

        List<Integer> integers = Arrays.asList(1,3,5,7);
        System.out.println(performMultiplication(integers));
        System.out.println(performMultiplicationWithoutIdentity(integers).get());
        System.out.println(getHighestGpaStudent().get());
    }
}
