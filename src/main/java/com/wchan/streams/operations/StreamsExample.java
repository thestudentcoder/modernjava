package com.wchan.streams.operations;

import com.wchan.data.Student;
import com.wchan.data.StudentDataBase;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamsExample {

    // Streams are immutable
    // Streams are only one-way
    // Streams ae lazily constructed and requires a terminal operations to start the pipeline
    // Streams have internal iteration
    // Peek can be used to debug and takes a Consumer.

    public static void main(String[] args) {

        // Create a map of student names and their activities
        Map<String, List<String>> studentMap = StudentDataBase.getAllStudents().stream()
                .filter(s -> s.getGradeLevel() >= 3)
                .peek(s -> System.out.println("after seond filter" + s))
                .filter(s -> s.getGpa() >= 3.9)
                .collect(Collectors.toMap(Student::getName, Student::getActivities));

        System.out.println(studentMap);
    }
}
