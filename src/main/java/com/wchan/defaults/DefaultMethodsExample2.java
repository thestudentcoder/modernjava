package com.wchan.defaults;

import com.wchan.data.Student;
import com.wchan.data.StudentDataBase;

import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class DefaultMethodsExample2 {

    // Sorting Students by different properties

    static Consumer<Student> studentConsumer = (student) -> System.out.println(student);
    static Comparator<Student> nameComparator = Comparator.comparing(Student::getName);
    static Comparator<Student> GpaComparator = Comparator.comparingDouble(Student::getGpa);

    public static void sortByName(List<Student> studentList) {
        studentList.sort(nameComparator);
        studentList.forEach(studentConsumer);
    }

    public static void sortByGpa(List<Student> studentList) {
        studentList.sort(GpaComparator);
        studentList.forEach(studentConsumer);
    }

    public static void comparatorChaining(List<Student> studentList) {
        studentList.sort(GpaComparator.thenComparing(nameComparator));
        studentList.forEach(studentConsumer);
    }

    public static void sortNullValues(List<Student> studentsList) {
        // perform a sort on a list that contains null values
        // Comparator has a method called nullsFirst and nullsLast
        // null values will be pushed to the beginning or the end
        Comparator<Student> studentComparator = Comparator.nullsFirst(nameComparator);
        studentsList.sort(studentComparator);
    }

    public static void main(String[] args) {

        List<Student> studentList = StudentDataBase.getAllStudents();
//        System.out.println(studentList);
//        studentList.forEach(studentConsumer);
        sortByName(studentList);
        System.out.println("\n");
        sortByGpa(studentList);
        System.out.println("\n");
        comparatorChaining(studentList);
    }
}
