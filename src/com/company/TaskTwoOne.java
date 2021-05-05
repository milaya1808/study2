package com.company;

import org.w3c.dom.ls.LSOutput;

public class TaskTwoOne {
   static String s []={"Мама","Мыла","Раму"};

    public static void main(String[] args) {
        System.out.println(s[0]+s[1]+s[2]);
        System.out.println(s[0]+s[2]+s[1]);
        System.out.println(s[1]+s[0]+s[2]);
        System.out.println(s[1]+s[2]+s[0]);
        System.out.println(s[2]+s[1]+s[0]);
        System.out.println(s[2]+s[0]+s[1]);
    }
}
