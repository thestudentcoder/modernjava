package com.wchan.datetime;

import java.time.Duration;
import java.time.Instant;

public class InstantExample {

    // Instant represents the time in a machine readable format.

    public static void main(String[] args) {
        Instant instant = Instant.now();
        System.out.println(instant);

        instant.getEpochSecond();
        System.out.println(Instant.ofEpochSecond(0));

        Instant instant1 = Instant.now();
        Duration duration = Duration.between(instant, instant1);

    }
}
