package com.wchan.datetime;

import java.time.Duration;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class ComparingTimesDurationExample {

    // Duration is a time based representation of time in hours, minutes, seconds, and nanoseconds.
    // Duration class is compatible with LocalTime and LocalDateTime.
    // It represents a duration of time not just a specific time.

    public static void main(String[] args) {

        LocalTime localTime1 = LocalTime.of(7,20);
        LocalTime localTime2 = LocalTime.of(8,20);

        Duration duration = Duration.between(localTime1, localTime2);
        duration.toMinutes();

        // until method
        long numMinutesDiff = localTime1.until(localTime2, ChronoUnit.MINUTES);
        System.out.println(numMinutesDiff);

        Duration duration2 = Duration.ofHours(3);

    }
}
