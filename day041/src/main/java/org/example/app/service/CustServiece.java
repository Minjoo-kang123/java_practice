package org.example.app.service;

import org.example.app.dao.CustDao;
import org.example.app.data.CustDto;
import org.example.app.frame.Dao;
import org.example.app.frame.Service;

import java.util.List;

public class CustServiece implements Service<String, CustDto> {

    Dao<String, CustDto> dao;
    public CustServiece(){
        dao = new CustDao();
    }

    @Override
    public int add(CustDto custDto) {
        //insert
        dao.add(custDto);
        //SNS..
        System.out.println("Send Sns... ...");
        //Email...
        System.out.println("Send Email... ...");
        return 0;
    }

    @Override
    public int del(String s) {
        dao.del(s);
        return 0;
    }

    @Override
    public int modify(CustDto custDto) {
        dao.modify(custDto);
        return 0;
    }

    @Override
    public CustDto get(String s) {
        return dao.get(s);
    }

    @Override
    public List<CustDto> getAll() {
        return dao.getAll();
    }
}
