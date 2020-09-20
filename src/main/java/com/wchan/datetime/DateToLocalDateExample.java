package com.wchan.datetime;

import java.time.*;
import java.util.Date;

public class DateToLocalDateExample {

    public static void main(String[] args) {

        // java.util.Date to LocalDate and vice versa
        Date date = new Date();
        System.out.println(date);

        LocalDateTime localDateTime = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime();
        LocalDate localDate = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        System.out.println(localDateTime);
        System.out.println(localDate);

        // convert localdate to date instance
        Date date1 = new Date()
                .from(localDate.atTime(LocalTime.now()).atZone(ZoneId.systemDefault()).toInstant());

        System.out.println(date1);

        // java.sql.Date to LocalDate and vice versa
        java.sql.Date date2 = java.sql.Date.valueOf(localDate);
        System.out.println(date2);

        // convert to localDate
        LocalDate localDate1 = date2.toLocalDate();
        System.out.println(localDate1);
    }
}
