package com.company;

public class TwoSeven {
    public static void main(String[] args) {
int b=31;
int counter=0;

        for (int i = 2; i < b; i++) {
            if( b % i ==0){
                System.out.println("true ");
                counter++;
                break;
            }
        }
        if(counter==0) System.out.println("false");

    }
}
