package com.bootcampexercise.module8.activity3;
import java.util.HashMap;
import java.util.Map;

/**
 * Demonstrates HashMap usage.
 */
public class MapActivity {

    public static void main(String[] args) {

        Map<String, String> map = new HashMap<>();

        map.put("1", "John");
        map.put("2", "Mike");
        map.put("3", "Sara");

        new MapActivity().print(map);
    }

    /**
     * Prints key-value pairs.
     */
    void print(Map<String, String> map) {
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println("ID: " + entry.getKey() + ", Name: " + entry.getValue());
        }
    }
}