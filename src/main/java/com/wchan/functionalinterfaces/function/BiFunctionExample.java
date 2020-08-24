package com.wchan.functionalinterfaces.function;

import com.wchan.data.Student;
import com.wchan.data.StudentDataBase;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Predicate;

public class BiFunctionExample {

    static List<Student> studentList = StudentDataBase.getAllStudents();
    static Predicate<Student> predicate = student -> student.getGradeLevel() >= 3;

    // BiFunction that takes a list of students, a predicate, and produces a hashmap
    static BiFunction<List<Student>, Predicate<Student>, Map<String, Double>> biFunction = (studenList, predicate) -> {
        Map<String, Double> studentGpaMap = new HashMap<>();

        studenList.forEach((student) -> {
            if (predicate.test(student)) {
                studentGpaMap.put(student.getName(), student.getGpa());
            }
        });

        return studentGpaMap;
    };

    public static void main(String[] args) {
        Map<String, Double> studentMap = biFunction.apply(studentList, predicate);
        System.out.println(studentMap);
    }
}
