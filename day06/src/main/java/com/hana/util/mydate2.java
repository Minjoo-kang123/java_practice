package com.hana.util;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;

public class mydate2 {
    public static void main(String[] args) {
        Date d = new Date();
        LocalDate localDate = d.toInstant().atZone(ZoneId.of("Asia/Seoul")).toLocalDate();

        LocalDateTime localDateTime = d.toInstant().atZone(ZoneId.of("Asia/Seoul")).toLocalDateTime();

        System.out.println(localDate);
        System.out.println(localDateTime);
    }
}
