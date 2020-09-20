package com.wchan.datetime;

import java.time.LocalTime;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

public class LocalTimeExample {

    public static void main(String[] args) {

        LocalTime localTime = LocalTime.now();
        System.out.println(localTime);

        LocalTime localTime1 = LocalTime.of(23, 33);
        System.out.println(localTime1);

        LocalTime localTime2 = LocalTime.of(23, 33, 33);
        System.out.println(localTime2);

        LocalTime localTime3 = LocalTime.of(23, 33, 33, 98989898);
        System.out.println(localTime3);

        /**
         * Getting the values from local time instance
         */

        System.out.println(localTime.getHour());
        System.out.println(localTime.getMinute());
        System.out.println(localTime.get(ChronoField.HOUR_OF_DAY));
        System.out.println(localTime.toSecondOfDay());

        /**
         * Modify values of LocalTime
         */

        System.out.println(localTime.minusHours(2));
        System.out.println(localTime.minus(2, ChronoUnit.HOURS));
        System.out.println(localTime.with(LocalTime.MIDNIGHT));
        System.out.println(localTime.with(ChronoField.HOUR_OF_DAY, 22));
        System.out.println(localTime.plusMinutes(2));
    }
}
