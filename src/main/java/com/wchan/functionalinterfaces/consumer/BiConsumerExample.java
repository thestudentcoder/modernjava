package com.wchan.functionalinterfaces.consumer;

import com.wchan.data.Student;
import com.wchan.data.StudentDataBase;

import java.util.List;
import java.util.function.BiConsumer;

public class BiConsumerExample {

    static List<Student> studentList = StudentDataBase.getAllStudents();

    public static void nameAndActivities() {
        // BiConsumer takes two inputs and returns a void
        BiConsumer<String, List<String>> biConsumer = (name, activities ) -> System.out.println(name + ": " + activities);
        studentList.forEach((s -> biConsumer.accept(s.getName(), s.getActivities())));
    }

    public static void main(String[] args) {
        BiConsumer<String, String> biConsumer = (a,b) -> System.out.println(a + " " + b);
        biConsumer.accept("Java 7", "Java 8");

        BiConsumer<Integer, Integer> multiply = (a,b) -> System.out.println(a * b);
        multiply.accept(2,3);

        BiConsumer<Integer, Integer> divide = (a,b) -> System.out.println(a / b);
        multiply.andThen(divide).accept(10,5);

        nameAndActivities();
    }
}
