package com.bootcampexercise.module8.activity5;

import java.util.*;

/**
 * Demonstrates ArrayList, HashSet, and HashMap operations.
 */
public class CollectionLearn {

    ArrayList<String> list = new ArrayList<>();
    HashSet<String> set = new HashSet<>();
    HashMap<String, String> map = new HashMap<>();

    public static void main(String[] args) {

        CollectionLearn obj = new CollectionLearn();

        obj.addValues();
        obj.printAll();

        obj.removeValues();
        obj.printAll();

        obj.replaceValue("John", "Alex");
        obj.printAll();
    }

    /**
     * Adds values (duplicates automatically handled in Set & Map).
     */
    void addValues() {
        for (int i = 1; i <= 10; i++) {
            String name = "Name" + i;

            if (!list.contains(name)) list.add(name);
            set.add(name);
            map.put(String.valueOf(i), name);
        }
    }

    /**
     * Prints all collections.
     */
    void printAll() {
        System.out.println("List: " + list);
        System.out.println("Set: " + set);
        System.out.println("Map: " + map);
        System.out.println("----------------------");
    }

    /**
     * Removes sample values.
     */
    void removeValues() {
        list.remove("Name1");
        set.remove("Name2");
        map.remove("1");
    }

    /**
     * Replaces value (avoids duplicates in list).
     */
    void replaceValue(String oldValue, String newValue) {

        if (!list.contains(newValue)) {
            int index = list.indexOf(oldValue);
            if (index != -1) {
                list.set(index, newValue);
            }
        }

        if (set.contains(oldValue)) {
            set.remove(oldValue);
            set.add(newValue);
        }

        for (String key : map.keySet()) {
            if (map.get(key).equals(oldValue)) {
                map.put(key, newValue);
                break;
            }
        }
    }
}