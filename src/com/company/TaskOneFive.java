package com.company;

import java.util.Scanner;

public class TaskOneFive {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while (scanner.hasNext()){
            int x=scanner.nextInt();
            double y= 9.0 / 5.0 * x + 32 ;
            System.out.println(y);
        }
    }
}
