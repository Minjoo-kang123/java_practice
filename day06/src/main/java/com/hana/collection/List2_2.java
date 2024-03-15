package com.hana.collection;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class List2_2 {
    public static void main(String[] args) {
        List<UserDto> list = new ArrayList<>();
        list.add(new UserDto("id01","pw01","jamse01",10,20000L, LocalDate.parse("2024-02-11")));
        list.add(new UserDto("id02","pw02","jamse02",10,20000L, LocalDate.parse("2024-02-11")));
        list.add(new UserDto("id03","pw03","jamse03",10,20000L, LocalDate.parse("2024-02-11")));
        //삭제
        for(UserDto c : list){
            if(c.getId().equals("id03")){
                c.setName("말숙");
                break;
            }
        }
        //list.forEach(s->System.out.println(s.toString()));
        for(UserDto c : list){
            System.out.printf("고객정보 %s %d %,d원 %s년 %s월 %s일 %n", c.getName(), c.getAge(), c.getMoney(),
                    c.getRegdate().getYear() ,c.getRegdate().getMonthValue(), c.getRegdate().getDayOfWeek());
        }
        for(UserDto c : list){
            DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy년 M월 d일");
            System.out.printf("고객정보 %s %d %,d원 %s %n", c.getId(), c.getAge(), c.getMoney(), c.getRegdate().format(format));
        }
    }
}
