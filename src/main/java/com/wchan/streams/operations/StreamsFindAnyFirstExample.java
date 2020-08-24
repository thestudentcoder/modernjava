package com.wchan.streams.operations;

import com.wchan.data.Student;
import com.wchan.data.StudentDataBase;

import java.util.Optional;

public class StreamsFindAnyFirstExample {

    // findFirst() and findAny() are used to find an element in the stream
    // Both functions return Optional
    // findFirst() returns the first element in the stream
    // findAny() return the first element it finds in the stream
    // This is accomplished using short circuiting.

    public static Optional<Student> findAnyStudent() {
        return StudentDataBase.getAllStudents().stream()
                // As soon as one student matches the criteria, it will be returned and stop processing
                .filter(student -> student.getGpa() > 3.9)
                .findAny();

    }

    public static Optional<Student> findFirstStudent() {
        return StudentDataBase.getAllStudents().stream()
                .filter(student -> student.getGpa() > 3.9)
                .findFirst();

    }

    public static void main(String[] args) {
        System.out.println(findAnyStudent().get());
        System.out.println(findFirstStudent().get());
    }
}
