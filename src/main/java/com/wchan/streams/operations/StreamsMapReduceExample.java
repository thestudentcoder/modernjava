package com.wchan.streams.operations;

import com.wchan.data.Student;
import com.wchan.data.StudentDataBase;

public class StreamsMapReduceExample {

    // Perform a summation of all the notebooks each Student has.

    private static int numberOfNotebooks() {
        return StudentDataBase.getAllStudents().stream()   // Stream<Student>
                .filter(student -> student.getGradeLevel() >= 3)
                .map(Student::getNotebooks) // Stream<Integer>
//                .reduce(0, (a,b) -> a + b);
                .reduce(0, Integer::sum);
    }

    public static void main(String[] args) {
        System.out.println(numberOfNotebooks());
    }
}
