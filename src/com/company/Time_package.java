package com.company;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class Time_package {
    public static void main(String[] args) {
        LocalDate c=LocalDate .now();
        System.out.println(c);
        LocalTime c1=LocalTime.now();
        System.out.println(c1);
        LocalDateTime dt=LocalDateTime.now();
        System.out.println(dt);
//      we can format date time as we want:-
        DateTimeFormatter df =DateTimeFormatter.ofPattern("yyyy/MM/dd//E/h:m:s a");
        String f =dt.format(df);
        System.out.println(f);
    }
}
