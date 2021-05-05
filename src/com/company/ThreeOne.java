package com.company;

public class ThreeOne {
    public static void main(String[] args) {
        System.out.println(min(1, 2, 3));
        System.out.println(min(-1, -2, -3));
        System.out.println(min(3, 3, 5));
        System.out.println(min(5, 5, 10));

        }
    public static int min(int a, int b, int c) {
        int min;
        if(a<=b&&a<=c)min=a;
        else if(b<=a&&b<=c)min=b;
        else min=c;
        return min;
    }
}
