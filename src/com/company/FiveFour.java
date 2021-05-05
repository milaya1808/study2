package com.company;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class FiveFour {
    public static void main(String[] args) throws IOException
    {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileReader inStream = new FileReader(reader.readLine());
        BufferedReader reader1 = new BufferedReader(inStream);
        ArrayList<Integer> list  = new ArrayList<Integer>();

        String line = " ";
        while ((line = reader1.readLine()) != null)
        {
            int x = Integer.parseInt(line);
            if((x%2)==0)
            {
                list.add(x);
            }}
        reader1.close();


        Collections.sort(list);
        for(int x : list)
        {
            System.out.println(x);
        }

    }
}

