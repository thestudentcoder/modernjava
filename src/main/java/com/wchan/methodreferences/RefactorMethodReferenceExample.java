package com.wchan.methodreferences;

import com.wchan.data.Student;
import com.wchan.data.StudentDataBase;

import java.util.function.Predicate;

public class RefactorMethodReferenceExample {

    static Predicate<Student> p1 = RefactorMethodReferenceExample::graterThanGradeLevel;

    public static boolean graterThanGradeLevel(Student s) {
        return s.getGradeLevel() >= 3;
    }

    public static void main(String[] args) {
        System.out.println(p1.test(StudentDataBase.studentSupplier.get()));
    }
}
