package com.bootcampexercise.module8.activity1;
import java.util.ArrayList;
import java.util.List;

import java.util.ArrayList;
import java.util.List;

/**
 * Demonstrates basic List usage.
 */
public class ListActivity {

    public static void main(String[] args) {

        // Creating list of names
        List<String> names = new ArrayList<>();

        names.add("John");
        names.add("Mike");
        names.add("Sara");
        names.add("Anna");

        print(names);
    }

    /**
     * Prints all elements in the list.
     */
    static void print(List<String> list) {
        for (String name : list) {
            System.out.println(name);
        }
    }
}
