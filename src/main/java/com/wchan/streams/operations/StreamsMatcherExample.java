package com.wchan.streams.operations;

import com.wchan.data.StudentDataBase;

public class StreamsMatcherExample {

    // anyMatch, allMatch, noneMatch all take in predicates and return a Boolean as output
    // anyMatch() returns true is any of the elements matches the predicate
    // allMatch() return true if all the elements in the stream matches the predicate
    // noneMatch returns true if none of the elements int he stream matches the predicate

    public static boolean allMatch() {
        return StudentDataBase.getAllStudents().stream()
                .allMatch(student -> student.getGpa() >= 3.5);
    }

    public static boolean anyMatch() {
        return StudentDataBase.getAllStudents().stream()
                .anyMatch(student -> student.getGpa() >= 4.2);
    }

    public static boolean noneMatch() {
        return StudentDataBase.getAllStudents().stream()
                .noneMatch(student -> student.getGpa() >= 4.1);
    }



    public static void main(String[] args) {
        System.out.println(allMatch());
        System.out.println(anyMatch());
        System.out.println(noneMatch());
    }
}
