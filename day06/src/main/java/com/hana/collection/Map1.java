package com.hana.collection;

import java.util.*;

public class Map1 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("K1", "V1");
        map.put("K2", "V2");
        map.put("K3", "V3");

        System.out.println(map.get("K2"));
        Set<String> keys = map.keySet();
        keys.forEach(c -> System.out.println(c));

        Collection<String> col = map.values();
        col.forEach(c -> System.out.println(c));
    }
}
