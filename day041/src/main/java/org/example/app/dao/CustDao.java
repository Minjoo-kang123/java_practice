package org.example.app.dao;
import org.example.app.data.CustDto;
import org.example.app.frame.Dao;

import java.util.ArrayList;
import java.util.List;

public class CustDao implements Dao<String, CustDto>{

    @Override
    public int add(CustDto custDao) {
        System.out.println("Oracle DB Inserted..." + custDao);
        return 0;
    }

    @Override
    public int del(String s) {
        System.out.println("Oracle DB Deleted..." + s);
        return 0;
    }

    @Override
    public int modify(CustDto custDao) {
        System.out.println("Oracle DB Updated..." + custDao);
        return 0;
    }

    @Override
    public CustDto get(String s) {
        return CustDto.builder().id("s").pwd("pwd01").name("jamse").build();
    }

    @Override
    public List<CustDto> getAll() {
        List<CustDto> list = new ArrayList<>();
        list.add(CustDto.builder().id("s1").pwd("pwd01").name("jamse").build());
        list.add(CustDto.builder().id("s2").pwd("pwd02").name("jamse").build());
        list.add(CustDto.builder().id("s3").pwd("pwd03").name("jamse").build());
        list.add(CustDto.builder().id("s4").pwd("pwd04").name("jamse").build());
        return list;
    }
}
