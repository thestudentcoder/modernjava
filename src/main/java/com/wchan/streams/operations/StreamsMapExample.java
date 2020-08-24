package com.wchan.streams.operations;

import com.wchan.data.Student;
import com.wchan.data.StudentDataBase;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamsMapExample {

    // Map changes streams from one type to another type
    // This use case is collect the names of the students
    // and print that list to the console.

    public static List<String> namesList() {
        return StudentDataBase.getAllStudents().stream()    // Stream<Student>
                .map(Student::getName)  // Stream<String>
                .map(String::toUpperCase)   // Stream<String> -> uppercase operation on each input
                .collect(Collectors.toList());  // List<String>
    }

    public static Set<String> namesSet() {
        return StudentDataBase.getAllStudents().stream()    // Stream<Student>
                .map(Student::getName)  // Stream<String>
                .map(String::toUpperCase)   // Stream<String> -> uppercase operation on each input
                .collect(Collectors.toSet());  // List<String>
    }

    public static void main(String[] args) {
        System.out.println(namesList());
        System.out.println(namesSet());
    }
}
