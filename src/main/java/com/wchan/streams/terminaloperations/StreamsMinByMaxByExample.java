package com.wchan.streams.terminaloperations;

import com.wchan.data.Student;
import com.wchan.data.StudentDataBase;

import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamsMinByMaxByExample {

    // maxBy(), minBy() Collectors
    // Takes in a comparator as input
    // Returns an optional as output

    public static Optional<Student> minBy() {
        return StudentDataBase.getAllStudents()
                .stream()
                .collect(Collectors.minBy(Comparator.comparing(Student::getGpa)));
    }

    public static Optional<Student> maxBy() {
        return StudentDataBase.getAllStudents()
                .stream()
                .collect(Collectors.maxBy(Comparator.comparing(Student::getGpa)));
    }


    public static void main(String[] args) {
        System.out.println(minBy().get());
        System.out.println(maxBy().get());
    }
}
