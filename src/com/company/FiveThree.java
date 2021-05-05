package com.company;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class FiveThree {
    public static void main(String[] args) {
        List<Integer> integers=new ArrayList<>();
        integers.add(-2);
        integers.add(2);
        integers.add(5);
        integers.add(12);
        integers.add(7);

        List<Integer> list=new ArrayList<>();

        for (int i = 0; i < integers.size(); i++) {
            int y=integers.get(i);
            if(y > 0 && y < 10){list.add(y);}
        }
        System.out.println(list);

    }
}
