package com.company;

public class TwoOneOne {
    public static void main(String[] args) {
        int[]arr={2,9,6,2,5,2,9,6,8,0,3};
        int sum=0;
        int counter=0;
        while (sum<=10){
            sum=sum+arr[counter];
            counter++;
        }
        System.out.println(counter);
    }
}
