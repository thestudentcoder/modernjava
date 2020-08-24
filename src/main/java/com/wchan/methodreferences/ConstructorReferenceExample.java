package com.wchan.methodreferences;

import com.wchan.data.Student;

import java.util.function.Function;
import java.util.function.Supplier;

public class ConstructorReferenceExample {

    // Constructor reference only valid when used wtih functional interfaces
    static Supplier<Student> studentSupplier = Student::new;

    // This requires a 1 arg constuctor because method reference equivalent to s -> new Student(s)
    static Function<String, Student> studentFunction = Student::new;

    public static void main(String[] args) {
        System.out.println(studentSupplier.get());
        System.out.println(studentFunction.apply("Bob"));
    }
}
