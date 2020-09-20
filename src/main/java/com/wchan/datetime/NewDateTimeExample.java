package com.wchan.datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class NewDateTimeExample {

    public static void main(String[] args) {
        // These are of type Temporal (interface)

        // LocalDate
        LocalDate localDate = LocalDate.now();
        System.out.println("LocalDate:" + localDate);

        // LocalTime
        LocalTime localTime  = LocalTime.now();
        System.out.println("LocalTime: " + localTime);

        //LocalDateTime
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("LocalDateTeim: " + localDateTime);

    }
}
