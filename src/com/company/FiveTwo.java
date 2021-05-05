package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class FiveTwo {

    public static void main(String[] args) throws IOException {
        Map<String, String> addresses = new HashMap<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String family;
        String city;
        //list of addresses
        while (true) {
            city = reader.readLine();
            if (city.isEmpty()) break;
            family = reader.readLine();


            addresses.put(city, family);

        }
        String myCity = reader.readLine();
        for (Map.Entry<String, String> town : addresses.entrySet()) {
            String town_i = town.getKey();
            if (myCity.equals(town_i)) {
                System.out.println(town.getValue());
            }
        }
    }
}
