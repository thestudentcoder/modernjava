package com.wchan.streams.terminaloperations;

import com.wchan.data.Student;
import com.wchan.data.StudentDataBase;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamsMappingExample {

    // Mapping collector applies a transformation function first then collects the data
    // in a a collection.

    // Similar to the mapping method.  Using this we can avoid an intermediate method.

    public static void main(String[] args) {
        final List<String> namesList = StudentDataBase.getAllStudents()
                .stream()
                .collect(Collectors.mapping(Student::getName, Collectors.toList()));

        System.out.println(namesList);

        final Set<String> namesSet = StudentDataBase.getAllStudents()
                .stream()
                .collect(Collectors.mapping(Student::getName, Collectors.toSet()));

        System.out.println(namesSet);
    }
}
