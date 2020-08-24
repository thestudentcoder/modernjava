package com.wchan.streams.terminaloperations;

import com.wchan.data.Student;
import com.wchan.data.StudentDataBase;

import java.util.stream.Collectors;

public class StreamsJoiningExample {

    // Joining collector joins strings with the option of using prefixes and delimiters.

    public static String joining_1() {
        return StudentDataBase.getAllStudents().stream()
                .map(Student::getName)
                .collect(Collectors.joining());
    }

    public static String joining_2() {
        return StudentDataBase.getAllStudents().stream()
                .map(Student::getName)
                .collect(Collectors.joining("-"));
    }

    public static String joining_3() {
        return StudentDataBase.getAllStudents().stream()
                .map(Student::getName)
                .collect(Collectors.joining("-", "(", ")"));
    }


    public static void main(String[] args) {
        System.out.println(joining_1());
        System.out.println(joining_2());
        System.out.println(joining_3());
    }
}
