package com.wchan.optional;

import com.wchan.data.Student;
import com.wchan.data.StudentDataBase;

import java.util.Optional;

public class OptionalOrElseExample {

    // orElse
    public static String optionalOrElse() {
        // if you pass in null, it will return Optional.empty object
        Optional<Student> studentOptional = Optional.ofNullable(StudentDataBase.studentSupplier.get());
        // we want the name of the Student
        // This will map the student name unless it tries to operate on Optional.empty object
        // it will return the value in orElse method instead.
        // If there is the possibility of nulls, use th orElse method.
        String name = studentOptional.map(Student::getName).orElse("Default");
        return name;
    }
    // orElseGet

    public static String optionalOrElseGet() {
        // if you pass in null, it will return Optional.empty object
        Optional<Student> studentOptional = Optional.ofNullable(StudentDataBase.studentSupplier.get());
        // we want the name of the Student
        // This will map the student name unless it tries to operate on Optional.empty object
        // it will return the value in orElse method instead.
        // If there is the possibility of nulls, use th orElse method.
        // Takes a supplier.
        String name = studentOptional.map(Student::getName).orElseGet(() -> "Default");
        return name;
    }
    // orElseThrow

    public static String optionalOrElseThrow() {
        // if you pass in null, it will return Optional.empty object
        Optional<Student> studentOptional = Optional.ofNullable(StudentDataBase.studentSupplier.get());
        // we want the name of the Student
        // This will map the student name unless it tries to operate on Optional.empty object
        // it will return the value in orElse method instead.
        // If there is the possibility of nulls and you want sn exception, use this.
        // Takes a supplier.
        String name = studentOptional.map(Student::getName)
                .orElseThrow(() -> new RuntimeException("No data available."));
        return name;
    }

    public static void main(String[] args) {
        System.out.println(optionalOrElse());
    }
}
