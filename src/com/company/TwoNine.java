package com.company;

public class TwoNine {
    public static void main(String[] args) {
        int []arr={1,2,3,4,5};
        int counter=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==5) {System.out.println("да");
                counter++;}

        }
        if(counter==0) System.out.println("нет");
    }
}
