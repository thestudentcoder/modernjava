package com.wchan.optional;

import com.wchan.data.Student;
import com.wchan.data.StudentDataBase;

import java.util.Optional;

public class OptionalExample {

    public static Optional<String> getStudentNameOptional() {
        Optional<Student> studentOptional = Optional.ofNullable(StudentDataBase.studentSupplier.get());

        if (studentOptional.isPresent()) {
            return studentOptional.map(Student::getGender); // Optional<String>
        }

        return Optional.empty();
    }

    public static void main(String[] args) {
        String name = getStudentNameOptional().get();
        System.out.println(name.length());
    }
}
