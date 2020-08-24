package com.wchan.functionalinterfaces.function;

import com.wchan.data.Student;
import com.wchan.data.StudentDataBase;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;

public class FunctionStudentExample {

    static List<Student> studentList = StudentDataBase.getAllStudents();

    static Predicate<Student> predicate = student -> student.getGradeLevel() >= 3;

    // Function to return a map of student names and gpa's
    static Function<List<Student>, Map<String, Double>> studentFunction = studentList -> {
        Map<String, Double> studentGradeMap = new HashMap<>();

        studentList.forEach(student -> {
            // we can also do some filtering here
            if (predicate.test(student)) {
                studentGradeMap.put(student.getName(), student.getGpa());
            }

        });

        return studentGradeMap;
    };

    public static void main(String[] args) {
        Map<String, Double> studentMap = studentFunction.apply(studentList);
        System.out.println(studentMap);
    }
}
