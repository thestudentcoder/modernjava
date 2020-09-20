package com.wchan.datetime;

import java.time.*;

public class ZonedDateTimeExample {

    // ZonedDateTime represents the dat/time with its time zone
    // Time Zones are categorized by their ZoneID and ZoneOffset
    // ZoneOffset is the offset from the UTC time

    public static void main(String[] args) {

        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        System.out.println(zonedDateTime);
        System.out.println(zonedDateTime.getOffset());

        zonedDateTime.getZone();  // ZoneID
        ZoneId.getAvailableZoneIds();   //  list supported ZoneIDs

        // CST, EST, MST, PST
        ZonedDateTime.now(ZoneId.of("America/Chicago"));

        // ZonedDateTime using clock
        Clock.system(ZoneId.of("American/Chicago"));

        /**
         * Convert from localdatetime to ZonedLocalDate and time
         */

        LocalDateTime localDateTime = LocalDateTime.now();
        ZonedDateTime zonedDateTime1 = localDateTime.atZone(ZoneId.of("America/Chicago"));

        ZonedDateTime zonedDateTime2 = Instant.now().atZone(ZoneId.of("America/Detroit"));

        OffsetDateTime offsetDateTime = localDateTime.atOffset(ZoneOffset.ofHours(-6));

    }
}
