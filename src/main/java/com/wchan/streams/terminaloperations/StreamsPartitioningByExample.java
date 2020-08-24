package com.wchan.streams.terminaloperations;

import com.wchan.data.Student;
import com.wchan.data.StudentDataBase;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamsPartitioningByExample {

    // partitioningBy() as a kind of groupingBy()
    // accepts a predicate as input
    // Return type of the collector is going to Map<K,V>
    // Key is always Boolean
    // Two different versions

    public static void partitioningBy_1() {
        final Map<Boolean, List<Student>> studentMap = StudentDataBase.getAllStudents()
                .stream()
                .collect(Collectors.partitioningBy(student -> student.getGpa() >= 3.8));

        System.out.println(studentMap);
    }

    public static void partitioningBy_2() {
        final Map<Boolean, Set<Student>> studentMap = StudentDataBase.getAllStudents()
                .stream()
                .collect(Collectors.partitioningBy(student -> student.getGpa() >= 3.8, Collectors.toSet()));

        System.out.println(studentMap);
    }


    public static void main(String[] args) {
        partitioningBy_1();
        partitioningBy_2();
    }
}
