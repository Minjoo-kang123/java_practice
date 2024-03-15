package com.hana.util;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

public class mydate {
    public static void main(String[] args) {
        Date d = new Date();
        System.out.println(d);
        System.out.println(d.getYear());
        System.out.println(d.getMonth());

        System.out.println("-------------------------");
        LocalDate localDate1 = LocalDate.now();
        //now라 칭하는 것은 내 컴퓨터의 시간이다.
        LocalDate localDate2 = LocalDate.of(2024, 02, 12);
        LocalDate localDate3 = LocalDate.parse("2024-07-12");
        System.out.println(localDate1);
        System.out.println(localDate2);
        System.out.println(localDate3);
        System.out.println("-------------------------");

        LocalDateTime localDateTime1 = LocalDateTime.now();
        LocalDateTime localDateTime2 = LocalDateTime.of(2024,4,11,11,11,11); // 연월일 시분초
        LocalDateTime localDateTime3 = LocalDateTime.parse("2024-04-11T12:00:12");
        System.out.println(localDateTime1);
        System.out.println(localDateTime2);
        System.out.println(localDateTime3);
    }
}
