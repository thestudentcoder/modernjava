package com.wchan.streams.terminaloperations;

import com.wchan.data.Student;
import com.wchan.data.StudentDataBase;

import java.util.stream.Collectors;

public class StreamsSumAverageExample {

    // summingInt collector returns the sum as a result
    // has support for summing long and double as well
    // averagingInt returns the average as a result

    public static int sum() {
        return StudentDataBase.getAllStudents()
                .stream()
                .collect(Collectors.summingInt(Student::getNotebooks));
    }

    public static double average() {
        return StudentDataBase.getAllStudents()
                .stream()
                .collect(Collectors.averagingInt(Student::getNotebooks));
    }


    public static void main(String[] args) {
        System.out.println("Total number of notebooks: " + sum());
        System.out.println("Average number of notebooks: " + average());
    }
}
