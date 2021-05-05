package com.company;

import java.util.Arrays;

public class TwoOneZero {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9, };

        long count = Arrays.stream(arr).count();
        long count1 = Arrays.stream(arr).distinct().count();

        if (count1<count) {
            System.out.println("Да");
        }else System.out.println("Нет");
    }
}

