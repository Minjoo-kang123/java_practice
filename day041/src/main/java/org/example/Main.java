package org.example;

import org.example.app.data.CustDto;
import org.example.app.data.ItemDto;
import org.example.app.frame.Service;
import org.example.app.service.CustServiece;
import org.example.app.service.ItemServiece;

import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        Service<String, CustDto> service = new CustServiece();
//        CustDto custDto = CustDto.builder().id("id01").pwd("pwd01").build();
//        System.out.println(custDto);
//
//        service.add(custDto);
//
//        List<CustDto> list = null;
//        list = service.getAll();
//        for(CustDto c : list){
//            System.out.println(c);
//        }

        Service<String, ItemDto> service = new ItemServiece();
        ItemDto itemDto = ItemDto.builder().id(1234L).name("pwd01").price(10000L).build();
        System.out.println(itemDto);

        service.add(itemDto);

        List<ItemDto> list = null;
        list = service.getAll();
        for(ItemDto c : list){
            System.out.println(c);
        }
    }
}