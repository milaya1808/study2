package com.company;

import java.util.Scanner;

public class TwoFour {
    public static void main(String[] args) {
        double x=0;
        Scanner scanner=new Scanner(System.in);
        int deposit= scanner.nextInt();
        int percent=scanner.nextInt();

        for (int i = 0; i < 5; i++) {
             x=x+deposit+(deposit*percent/100f);
            System.out.println(x);
        }
    }
}
