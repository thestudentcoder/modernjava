package com.wchan.data;

import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Data
@EqualsAndHashCode(exclude = "activities")
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Student {
    private String name;
    private int gradeLevel;
    private double gpa;
    private String gender;
    List<String> activities = new ArrayList<>();
    private int notebooks;

    public void printListActivities() {
        System.out.println(activities);
    }

    public Student(String name) {
        this.name = name;
    }
}
