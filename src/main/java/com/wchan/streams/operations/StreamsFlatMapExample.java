package com.wchan.streams.operations;

import com.wchan.data.Student;
import com.wchan.data.StudentDataBase;

import java.util.List;
import java.util.stream.Collectors;

public class StreamsFlatMapExample {

    // Similar to Map
    // Converts one type to another type
    // Used in Streams where each elements in the stream represents multiple elements
    // ex: Stream<List>, Stream<Array>

    // We can also call .distinct(), count(), sorted()

    public static List<String> printStudentActivities() {
        return StudentDataBase.getAllStudents().stream()   // Stream<Student>
                .map(Student::getActivities)    // Stream<List<String>> each element in the Stream will be a list of String
                .flatMap(List::stream) // Stream<String>
                .distinct() // runs the distinct operations for all the elements in the Stream
                .sorted()
                .collect(Collectors.toList());

    }

    public static long printStudentActivitiesCout() {
        return StudentDataBase.getAllStudents().stream()   // Stream<Student>
                .map(Student::getActivities)    // Stream<List<String>> each element in the Stream will be a list of String
                .flatMap(List::stream) // Stream<String>
                .distinct() // runs the distinct operations for all the elements in the Stream
                .count();

    }

    public static void main(String[] args) {
        printStudentActivities();
    }
}
