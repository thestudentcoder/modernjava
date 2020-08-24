package com.wchan.functionalinterfaces.predicate;

import com.wchan.data.Student;
import com.wchan.data.StudentDataBase;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class PredicateConsumerExample {

    Predicate<Student> p1 = (s) -> s.getGradeLevel() >= 3;
    Predicate<Student> p2 = (s) -> s.getGpa() >= 3.0;

    BiConsumer<String, List<String>> studentBiConsumer = (name, activities) -> System.out.println(name + ": " + activities);

    BiPredicate<Integer, Double> biPredicate = (gradeLevel, gpa) -> gradeLevel >= 3 && gpa >= 3.9;

    Consumer<Student> studentConsumer = (student -> {
        // perform filtering operation using predicate
        // and printing using Biconsumer
        if (p1.and(p2).test(student)) {
            studentBiConsumer.accept(student.getName(), student.getActivities());
        }
    });


    Consumer<Student> studentConsumer2 = (student -> {
        // perform filtering operation using predicate
        // and printing using Biconsumer
        if (biPredicate.test(student.getGradeLevel(), student.getGpa())) {
            studentBiConsumer.accept(student.getName(), student.getActivities());
        }
    });

    public void printNameAndActivities() {
        List<Student> studentList = StudentDataBase.getAllStudents();
        studentList.forEach(studentConsumer2);
    }

    public static void main(String[] args) {
        PredicateConsumerExample p = new PredicateConsumerExample();
        p.printNameAndActivities();
    }
}
