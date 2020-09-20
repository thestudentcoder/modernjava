package com.wchan.datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class FormatLocalDateExample {

    // Introduced in Java 8
    // Used to parse an format the LocalDate, LocalTime, and LocalDateTime

    // parse - converting a string to LocalDate/LocalTime/LocalDateTIme
    // format - converting a LocalDate/LocalTime/LocalDate to a String

    // https://docs.oracle.com/javase/8/docs/api/java/time/format/DateTimeFormatter.html

    public static void parseLocalDate() {

        // STring to a Localdate
        String date = "2018-01-18";
        LocalDate localDate = LocalDate.parse(date);    // parse uses ISO_LOCATE_DATE by default expects date in yyyy-mm-dd
        System.out.println(localDate);

        // equivalent to above
        LocalDate localDate1 = LocalDate.parse(date, DateTimeFormatter.ISO_LOCAL_DATE);
        System.out.println(localDate1);

        // BASIC_ISO_DATE not require dashes
        String date2 = "20180118";  // yyyMMdd
        LocalDate localDate2 = LocalDate.parse(date2, DateTimeFormatter.BASIC_ISO_DATE);
        System.out.println(localDate2);

        // Custom defined dateFormat convert to LocalDate
        String date3 = "2018|01|18";
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy|MM|dd");
        LocalDate localDate3 = LocalDate.parse(date3, dateTimeFormatter);
        System.out.println(localDate3);

        String dateInString = "Mon, 05 May 1980";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEE, d MMM yyyy", Locale.ENGLISH);
        LocalDate dateTime = LocalDate.parse(dateInString, formatter);
        System.out.println(dateTime);
    }

    public static void formatLocalDate() {
        // LocalDate to String
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy|MM|dd");
        LocalDate localDate = LocalDate.now();
        String formattedDate = localDate.format(dateTimeFormatter);
        System.out.println(formattedDate);
    }

    public static void main(String[] args) {
        parseLocalDate();
        formatLocalDate();
    }
}
