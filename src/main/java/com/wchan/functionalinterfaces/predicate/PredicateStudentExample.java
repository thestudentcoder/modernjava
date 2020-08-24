package com.wchan.functionalinterfaces.predicate;

import com.wchan.data.Student;
import com.wchan.data.StudentDataBase;

import java.util.List;
import java.util.function.Predicate;

public class PredicateStudentExample {

    static Predicate<Student> p1 = (s) -> s.getGradeLevel() >= 3;
    static Predicate<Student> p2 = (s) -> s.getGpa() >= 3.9;

    static List<Student> studentList = StudentDataBase.getAllStudents();

    public static void filterStudentsByGradeLevel() {
        // This can be done alternatively using stream.filter()
        studentList.forEach(s -> {
            if (p1.test(s)) {
                System.out.println(s);
            }
        });
    }

    public static void filterStudentsByGPA() {
        // This can be done alternatively using stream.filter()
        studentList.forEach(s -> {
            if (p2.test(s)) {
                System.out.println(s);
            }
        });
    }

    public static void filterStudents() {
        // This can be done alternatively using stream.filter()
        studentList.forEach(s -> {
            if (p1.and(p2).negate().test(s)) {
                System.out.println(s);
            }
        });
    }

    public static void main(String[] args) {
        filterStudentsByGradeLevel();
        System.out.println("\n");

        filterStudentsByGPA();
        System.out.println("\n");

        filterStudents();
    }
}
