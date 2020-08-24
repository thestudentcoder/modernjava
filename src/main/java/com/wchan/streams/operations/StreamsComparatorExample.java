package com.wchan.streams.operations;

import com.wchan.data.Student;
import com.wchan.data.StudentDataBase;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsComparatorExample {

    // Comoparator.comoparing static function accepts a sort key Function and returns a Comparator
    // for the type which contins the sort key.

    public static List<Student> sortStudentsByName() {
        return StudentDataBase.getAllStudents().stream()
                .sorted(Comparator.comparing(Student::getName))
                .collect(Collectors.toList());
    }

    public static List<Student> sortStudentsByGpa() {
        return StudentDataBase.getAllStudents().stream()
                .sorted(Comparator.comparing(Student::getGpa).reversed())   // descending order
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        System.out.println(sortStudentsByName());
        System.out.println(sortStudentsByGpa());
    }
}
