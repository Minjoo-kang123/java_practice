package com.hana.collection;

import javax.crypto.Cipher;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.*;

public class List2 {
    public static void main(String[] args) {
        List<CustDto> list = new ArrayList<>();
        list.add(CustDto.builder().id("id001").pwd("pwd01").name("james").money(200000L).age(25).regdate(LocalDate.parse("2024-01-02")).build());
        list.add(CustDto.builder().id("id002").pwd("pwd02").name("james").money(200000L).age(25).regdate(LocalDate.parse("2024-01-02")).build());
        list.add(CustDto.builder().id("id003").pwd("pwd03").name("james").money(200000L).age(25).regdate(LocalDate.parse("2024-01-02")).build());
        list.add(CustDto.builder().id("id004").pwd("pwd04").name("james").money(200000L).age(25).regdate(LocalDate.parse("2024-01-02")).build());
        list.add(CustDto.builder().id("id005").pwd("pwd05").name("james").money(200000L).age(25).regdate(LocalDate.parse("2024-01-02")).build());

        //list.forEach(s->System.out.println(s.toString()));
        for(CustDto c : list){
            System.out.printf("고객정보 %s %d %,d원 %s년 %s월 %s일 %n", c.getId(), c.getAge(), c.getMoney(),
                    c.getRegdate().getYear() ,c.getRegdate().getMonthValue(), c.getRegdate().getDayOfWeek());
        }
        for(CustDto c : list){
            DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy년 M월 d일");
            System.out.printf("고객정보 %s %d %,d원 %s %n", c.getId(), c.getAge(), c.getMoney(), c.getRegdate().format(format));
        }
    }
}
