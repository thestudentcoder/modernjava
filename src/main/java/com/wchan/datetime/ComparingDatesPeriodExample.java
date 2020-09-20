package com.wchan.datetime;

import java.time.LocalDate;
import java.time.Period;

public class ComparingDatesPeriodExample {

    // Period is a date-based representation of time in Days, Months, and Years
    // and is part of the java.time package.
    // It is compatible with LocalDate.  It represents a period of time not just
    // a specific date and time.

    // Period is mainly used to calculate the difference between two dates not times.
    // Dureation is used for times.

    public static void main(String[] args) {

        // Creating a period
        Period period1 = Period.ofDays(10);
        period1.getDays();

        LocalDate localDate1 = LocalDate.of(2019, 01, 01);
        LocalDate localDate2 = LocalDate.of(2019, 01, 31);

        // Calculates the difference between the two dates
        Period period = Period.between(localDate1, localDate2);

        Period period2 = localDate1.until(localDate2);
        System.out.println(period2.getDays());  // 30 -> performs 31 - 1
        System.out.println(period2.getMonths()); // 122 - 11
        System.out.println(period2.getYears());  // 0

        Period period3 = Period.ofYears(20);
        period3.getYears();
        period3.toTotalMonths();
        period3.getDays();



    }
}
