package com.bootcampexercise.module8;
import java.util.ArrayList;
import java.util.List;

public class ListActivity {
    public static void main(String[] args) {

        // 1 - create a list of names using ArrayList
        List<String> names = new ArrayList<>();

        names.add("John");
        names.add("Mike");
        names.add("Shanti");
        names.add("Stacie");

        // 2 - Call print method
        print(names);
    }

    static void print(List list) {

        // 3 - print elements of the list
        for (Object name : list) {
            System.out.println(name);
        }
    }
}
