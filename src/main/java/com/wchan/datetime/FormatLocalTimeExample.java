package com.wchan.datetime;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class FormatLocalTimeExample {

    public static void parseTime() {

        String time = "13:00";
        // uses ISO_LOCAL_TIME by default
        LocalTime localTime = LocalTime.parse(time);
        System.out.println(localTime);

        LocalTime localTime1 = LocalTime.parse(time, DateTimeFormatter.ISO_LOCAL_TIME);
        System.out.println(localTime1);

        // Custom defined format
        String time1 = "13*00";
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("HH*mm");
        LocalTime localTime2 = LocalTime.parse(time1, dateTimeFormatter);
        System.out.println(localTime2);

        String time2 = "13*00*02";
        DateTimeFormatter dateTimeFormatter1 = DateTimeFormatter.ofPattern("HH*mm*ss");
        LocalTime localTime3 = LocalTime.parse(time2, dateTimeFormatter1);
        System.out.println(localTime3);
    }

    public static void formatTime() {
        // LocalTime to string
        DateTimeFormatter dateTimeFormatter1 = DateTimeFormatter.ofPattern("HH|mm|s");
        LocalTime localTime = LocalTime.now();
        String formattedTime = localTime.format(dateTimeFormatter1);
        System.out.println(formattedTime);
    }

    public static void main(String[] args) {
        parseTime();
        formatTime();
    }
}
