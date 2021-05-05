package com.company;

public class ThreeTwo {
    public static void main(String[] args) {
        System.out.println(min(-20, -10));
        System.out.println(min(-40, -10, -30, 40));
        System.out.println(min(-20, -40, -30, 40));
        System.out.println(min(-20, -10, -40, 40));
        System.out.println(min(-20, -10, -30, -40));
    }

    public static int min(int a, int b, int c, int d) {
       int min1=min(a,b);
       int min2=min(c,d);
       int min3=min(min1,min2);
       return min3;
    }

    public static int min(int a, int b) {
        int min;
        if(a<b) min=a;
        else min=b;
        return min;
    }
}
