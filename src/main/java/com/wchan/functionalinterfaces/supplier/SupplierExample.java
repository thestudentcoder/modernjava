package com.wchan.functionalinterfaces.supplier;

import com.wchan.data.Student;
import com.wchan.data.StudentDataBase;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SupplierExample {

    // Supplier doesn't take any input and returns output
    // Invoke using .get()

    public static void main(String[] args) {
        Supplier<Student> studentSupplier = () -> new Student("Adam",2,3.6, "male",
                Arrays.asList("swimming", "basketball","volleyball"), 111);
        System.out.println(studentSupplier.get());

        Supplier<List<Student>> listSupplier = () -> StudentDataBase.getAllStudents();
        System.out.println(listSupplier.get());
    }
}
