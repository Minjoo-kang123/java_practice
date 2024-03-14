package org.example.app.service;

import org.example.app.dao.ItemDao;
import org.example.app.data.CustDto;
import org.example.app.data.ItemDto;
import org.example.app.frame.Dao;
import org.example.app.frame.Service;

import java.util.List;

public class ItemServiece implements Service<String, ItemDto> {

    Dao<String, ItemDto> dao;
    public ItemServiece(){
        dao = new ItemDao();
    }

    @Override
    public int add(ItemDto itemDto) {
        //insert
        dao.add(itemDto);
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
    public int modify(ItemDto itemDto) {
        dao.modify(itemDto);
        return 0;
    }

    @Override
    public ItemDto get(String s) {
        return dao.get(s);
    }

    @Override
    public List<ItemDto> getAll() {
        return dao.getAll();
    }
}
