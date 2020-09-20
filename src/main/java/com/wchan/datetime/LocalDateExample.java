package com.wchan.datetime;

import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

public class LocalDateExample {

    public static void main(String[] args) {
        // Creating local dates
        // date and time are immutable
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);

        LocalDate localDate1 = LocalDate.of(2018, 7, 17);
        System.out.println(localDate1);

        LocalDate localDate2 = LocalDate.ofYearDay(2018, 365);
        System.out.println(localDate2);

        // Get values from LocalDate
        System.out.println(localDate.getMonth());
        System.out.println(localDate.getMonthValue());
        System.out.println(localDate.getDayOfWeek());
        System.out.println(localDate.getDayOfYear());

        // ChronoField is an Enum
        System.out.println(localDate.get(ChronoField.DAY_OF_MONTH));

        // Modifying LocalDate
        // This returns a new LocalDate instance
        System.out.println(localDate.plusDays(2));
        System.out.println(localDate.plusMonths(2));
        System.out.println(localDate.minusDays(2));
        System.out.println(localDate.withYear(2021));
        System.out.println(localDate.with(ChronoField.MONTH_OF_YEAR, 2021));
        System.out.println(localDate.with(TemporalAdjusters.firstDayOfNextMonth()));
        // subtract year by 1
        System.out.println(localDate.minus(1, ChronoUnit.YEARS));

        // Additional support methods
        System.out.println(localDate.isLeapYear());
        System.out.println(LocalDate.ofYearDay(2020, 1).isLeapYear());

        // Compare dates
        System.out.println(localDate.isEqual(localDate1));
        System.out.println(localDate1.isAfter(localDate));

        // Check if you can perform an operation on a LocalDate object
        System.out.println(localDate.isSupported(ChronoUnit.MINUTES));

    }
}
