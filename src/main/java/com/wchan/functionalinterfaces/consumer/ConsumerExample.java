package com.wchan.functionalinterfaces.consumer;

import com.wchan.data.Student;
import com.wchan.data.StudentDataBase;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {

    /**
     * Lambdas embrace code reuseability.
     */

    static Consumer<Student> c2 = System.out::println;
    static Consumer<Student> c3 = s -> System.out.print(s.getName());   // print student name
    static Consumer<Student> c4 = s -> System.out.println(s.getActivities());   // print student activities

    static List<Student> studentList = StudentDataBase.getAllStudents();

    public static void printName() {
        studentList.forEach(c2);
    }

    public static void printNameAndActivities() {
        // consumer chaining
        studentList.forEach(c3.andThen(c4));
    }

    public static void printNameAndActivityUsingCondition() {
        // in-line consumer interface implementation
        studentList.forEach(s -> {
            if (s.getGradeLevel() >= 3 && s.getGpa() > 3.9) {
                // pass the student that matches the condition to the other consumers
                // we can chain n number of interfaces using andThen
                c3.andThen(c4).accept(s);
            }
        });
    }

    public static void main(String[] args) {

        // Consumer interface contains single abstract method accept that returns void
        Consumer<String> c1 = (s) -> System.out.println(s.toUpperCase());
        c1.accept("java8");

        printName();
        System.out.println("\n");

        printNameAndActivities();
        System.out.println("\n");

        printNameAndActivityUsingCondition();

    }
}
