package com.wchan.optional;

import com.wchan.data.Bike;
import com.wchan.data.Student;
import com.wchan.data.StudentDataBase;

import java.util.Optional;

public class OptionalMapFlatMapExample {

    // filter
    public static void optionalFilter() {
        Optional<Student> studentOptional =
                Optional.ofNullable(StudentDataBase.studentSupplier.get());

        studentOptional.filter(student -> student.getGpa() >= 3.5)
        .ifPresent(s -> System.out.println(s));
    }

    // map
    public static void optionalMap() {
        Optional<Student> studentOptional =
                Optional.ofNullable(StudentDataBase.studentSupplier.get());


        if (studentOptional.isPresent()) {
            // map return an object of type Optional
            final Optional<String> stringOptional = studentOptional.filter(s -> s.getGpa() >= 3.5)
                    .map(Student::getName);

            System.out.println(stringOptional.get());
        }
    }

    // flatmap
    public static void optionalFlatMap() {
        // Optional<Student>
        Optional<Student> studentOptional = Optional.ofNullable(StudentDataBase.studentSupplier.get());

        // We want the name of the bike
        // Use flatmap to get into another flatmap
        final Optional<String> name = studentOptional.filter(s -> s.getGpa() >= 3.5)
                .flatMap(Student::getBike)
                .map(Bike::getName);

        name.ifPresent(s -> System.out.println(s));
    }


    public static void main(String[] args) {
        optionalFilter();
        optionalMap();
        optionalFlatMap();
    }
}
