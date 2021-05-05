package com.company;

public class TwoSix {
    public static void main(String[] args) {
        int a=14;
        int b=6;

        if (a % b ==0) System.out.println("Делится");
        else {
            float x = (float) a % b;
            System.out.println("Делится с остатком , остаток " + x);
        }
    }
}
