package org.example.app.dao;
import org.example.app.data.ItemDto;
import org.example.app.frame.Dao;

import java.util.ArrayList;
import java.util.List;

public class ItemDao implements Dao<String, ItemDto>{

    @Override
    public int add(ItemDto itemDto) {
        System.out.println("Oracle DB Inserted..." + itemDto);
        return 0;
    }

    @Override
    public int del(String s) {
        System.out.println("Oracle DB Deleted..." + s);
        return 0;
    }

    @Override
    public int modify(ItemDto itemDto) {
        System.out.println("Oracle DB Updated..." + itemDto);
        return 0;
    }

    @Override
    public ItemDto get(String s) {
        return ItemDto.builder().id(12345L).name("pwd01").price(10000L).build();
    }

    @Override
    public List<ItemDto> getAll() {
        List<ItemDto> list = new ArrayList<>();
        list.add(ItemDto.builder().id(12345L).name("pwd01").price(10000L).build());
        list.add(ItemDto.builder().id(12345L).name("pwd02").price(10000L).build());
        list.add(ItemDto.builder().id(12345L).name("pwd03").price(10000L).build());
        list.add(ItemDto.builder().id(12345L).name("pwd015").price(10000L).build());
        return list;
    }
}
