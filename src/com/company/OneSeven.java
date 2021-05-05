package com.company;

import java.util.Scanner;

public class OneSeven {
    public static void main(String[] args) {
        int counter=0;
        Scanner scanner=new Scanner(System.in);
        while (scanner.hasNext()) {
            String s=scanner.next();
            String[] arr =s.split(",");
            int a=Integer.parseInt(arr[0]);
            int b=Integer.parseInt(arr[1]);
            int c=Integer.parseInt(arr[2]);
            System.out.println(a*b*c*1000);
        }
    }
}

