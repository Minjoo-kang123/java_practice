package com.hana.collection;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class List4 {
    public static void main(String[] args) {
        Set<String> list = new HashSet<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");
        list.add("F");
        System.out.println(list.size());

        Set<Integer> num = new HashSet<>();
        Random r = new Random();
        while(num.size() < 10){
            int rnum = r.nextInt(101);
            num.add(rnum);
        }
        System.out.println(num.size());
        num.stream().sorted().forEach((c)->System.out.println(c));


    }
}
