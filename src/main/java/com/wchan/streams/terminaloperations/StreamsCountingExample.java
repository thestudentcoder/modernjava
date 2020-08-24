package com.wchan.streams.terminaloperations;

import com.wchan.data.StudentDataBase;

import java.util.stream.Collectors;

public class StreamsCountingExample {

    // Counting collector counts the number of elements in the Stream
    // Use case: find the number of elements matching a criteria
    public static long count() {

        return StudentDataBase.getAllStudents()
                .stream()
                .filter(s -> s.getGpa() > 3.9)
                .collect(Collectors.counting());
    }

    public static void main(String[] args) {
        System.out.println(count());
    }
}
