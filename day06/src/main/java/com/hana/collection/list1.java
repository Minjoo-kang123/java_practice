package com.hana.collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class list1 {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");

        System.out.println(list);

        list.forEach(System.out::println);

        System.out.println(list.indexOf("B"));
        System.out.println(list.get(2));
    }
}
