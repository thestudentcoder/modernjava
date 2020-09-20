package com.wchan.streams.terminaloperations;

import com.wchan.data.Student;
import com.wchan.data.StudentDataBase;

import java.util.*;
import java.util.stream.Collectors;

public class StreamsGroupingByExample {

    // Equivalent to group by in sql
    // Used to group elements based on property
    // Output of groupingBy collector is a Map<K, V>
    // 3 different versions of groupingBy()
    // groupBy(classifier), groupingBy(classifier, downstream), groupingBy(classifier, supplier, downstream)

    // use case: group students by gender
    public static void groupStudentsByGender() {
        final Map<String, List<Student>> studentMap = StudentDataBase.getAllStudents()
                .stream()
                .collect(Collectors.groupingBy(Student::getGender));

        System.out.println(studentMap);
    }

    // customized groupingBy implementation
    // assign key of outstanding for students with GPA's greater than 3.8
    public static void customizedGroupingBy() {
        final Map<String, List<Student>> studentMap = StudentDataBase.getAllStudents()
                .stream()   // Stream<Student>
                .collect(Collectors.groupingBy(student -> student.getGpa() >= 3.8? "outstanding" : "average"));

        System.out.println(studentMap);
    }

    // 2 param version

    // 2nd groupingBy creates another map
    public static void twoLevelGrouping_1() {
        final Map<Integer, Map<String, List<Student>>> studentMap = StudentDataBase.getAllStudents()
                .stream()
                .collect(Collectors.groupingBy(Student::getGradeLevel,
                        Collectors.groupingBy(student -> student.getGpa() >= 3.8 ? "outstanding" : "average")));

        System.out.println(studentMap);
    }

    public static void twoLevelGrouping_2() {
        Map<String, Integer> studentMap = StudentDataBase.getAllStudents()
                .stream()
                .collect(Collectors.groupingBy(Student::getName,
                        Collectors.summingInt(Student::getNotebooks)));

        System.out.println(studentMap);

    }

    // 3 argument version

    // first param is key, second param is type of output, value the output is going to generate
    public static void threeArgumentGroupBy() {
        final LinkedHashMap<String, Set<Student>> studentLinkedHashMap = StudentDataBase.getAllStudents()
                .stream()
                .collect(Collectors.groupingBy(Student::getName, LinkedHashMap::new, Collectors.toSet()));
    }

    // Combination with maxBy, minBy

    // Calculate the top GPA student in each grade as well as the student with the lowest GPA
    public static void calculateTopGpa() {
        final Map<Integer, Student> studentMap = StudentDataBase.getAllStudents()
                .stream()
                .collect(Collectors.groupingBy(Student::getGradeLevel,
                        Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparing(Student::getGpa)),
                                Optional::get)));

        System.out.println(studentMap);
    }

    public static void calculateLeastGpa() {
        final Map<Integer, Student> studentMap = StudentDataBase.getAllStudents()
                .stream()
                .collect(Collectors.groupingBy(Student::getGradeLevel,
                        Collectors.collectingAndThen(Collectors.minBy(Comparator.comparing(Student::getGpa)),
                                Optional::get)));

        System.out.println(studentMap);
    }


    public static void main(String[] args) {
        groupStudentsByGender();
//        customizedGroupingBy();
//        twoLevelGrouping_1();
//        twoLevelGrouping_2();
//        threeArgumentGroupBy();
//        calculateTopGpa();
//        calculateLeastGpa();
    }
}
