package com.company;

import java.util.Scanner;

public class OneSix {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while (scanner.hasNext()){
            int y=scanner.nextInt();
            System.out.println(y+y*15.0/100);
        }
    }
}
