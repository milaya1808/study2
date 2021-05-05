package com.company;

public class TwoOneTwo {
    public static void main(String[] args) {
        int [] arr={1,1,1,1,1,2,2,2,3,3,4,4,5,5,6,6};
        int current = 1, max = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1]) {
                current++;
                if (current > max) {
                    max = current;
                }
            } else current = 1;
        }
        System.out.println(max);
    }
}

