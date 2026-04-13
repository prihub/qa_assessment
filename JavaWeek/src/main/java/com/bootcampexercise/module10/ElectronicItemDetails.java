package com.bootcampexercise.module10;

import java.util.HashMap;

/**
 * Demonstrates use of HashMap for storing item prices
 */
public class ElectronicItemDetails {

    /**
     * returns price of given item name from hashmap
     */
    public static double returnPriceOfItem(HashMap<String, Double> itemHashMap, String name) {

        // check if item exists in map
        if (itemHashMap.containsKey(name)) {
            return itemHashMap.get(name);
        }

        return 0; // return 0 if item not found
    }

    public static void main(String[] args) {

        HashMap<String, Double> itemHashMap = new HashMap<>();

        // adding items and their prices
        itemHashMap.put("TV", 500.0);
        itemHashMap.put("Refrigerator", 800.0);
        itemHashMap.put("Washing Machine", 600.0);
        itemHashMap.put("Laptop", 1000.0);

        // printing price of TV
        System.out.println("Price of TV is " + returnPriceOfItem(itemHashMap, "TV"));
    }
}