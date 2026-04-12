package com.bootcampexercise.module8.activity2;
import java.util.HashSet;

/**
 * Demonstrates Set behavior (no duplicates).
 */
public class HashSetActivity {

    public static void main(String[] args) {

        HashSet<String> names = new HashSet<>();

        // Adding 10 values
        names.add("John");
        names.add("Mike");
        names.add("Sara");
        names.add("Anna");
        names.add("Tom");
        names.add("Disha");
        names.add("Raj");
        names.add("Nina");
        names.add("Leo");
        names.add("Zara");

        print(names);

        // Adding duplicate values (will not be added)
        names.add("John");
        names.add("Disha");

        System.out.println("After adding duplicates:");
        print(names);

        // Removing 2 values
        names.remove("Tom");
        names.remove("Raj");

        System.out.println("After removing values:");
        print(names);

        // HashSet does not support index
        System.out.println("HashSet does not support index-based access.");
    }

    static void print(HashSet<String> set) {
        for (String name : set) {
            System.out.println(name);
        }
    }
}