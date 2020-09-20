package com.wchan.datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoField;

public class LocalDateTimeExample {

    public static void main(String[] args) {
        final LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);

        final LocalDateTime localDateTime1 = LocalDateTime.of(2018, 3, 21, 23,
                33, 33, 978);
        System.out.println(localDateTime1);

        final LocalDateTime localDateTime2 = localDateTime.of(LocalDate.now(), LocalTime.now());
        System.out.println(localDateTime2);

        /**
         * Getting the time and date from the LocalDateTime instance
         */

        System.out.println(localDateTime.getHour());
        System.out.println(localDateTime.getMinute());
        System.out.println(localDateTime.getDayOfMonth());
        System.out.println(localDateTime.get(ChronoField.DAY_OF_MONTH));

        /**
         * Modifying LocalDateTime
         */

        System.out.println(localDateTime.plusHours(2));
        System.out.println(localDateTime.minusDays(2));
        System.out.println(localDateTime.withMonth(12));

        // Converting localdate, localtime to localdatetime and vice versa
        LocalDate localDate = LocalDate.of(2019,01,01);
        // Adds time to it so it can return a localdatetime
        localDate.atTime(23,33);

        LocalTime localTime = LocalTime.of(23, 39);
        // Add date to get LocalDateTime as the output
        localTime.atDate(localDate);

        LocalDateTime localDateTime3 = localTime.atDate(localDate);
        localDateTime3.toLocalDate();
        localDateTime3.toLocalTime();

    }
}
