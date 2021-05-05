package com.company;

public class ThreeFive {
   static int counter=0;
    public static void main(String[] args) {
        int num[] = {4,2,6,2,65};
        fun(num);

    }
    public static void fun(int []arr) {
        int max = arr.length;
        if (counter >= arr.length) {
        } else {
            System.out.println(arr[counter]);
            counter++;
            fun(arr);
        }
    }
}
