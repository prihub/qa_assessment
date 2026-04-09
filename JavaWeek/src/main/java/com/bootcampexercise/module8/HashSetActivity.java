package com.bootcampexercise.module8;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetActivity {
    public static void main(String[] args) {

        // 1 - Create a HashSet of 10 names
        HashSet<String> names = new HashSet<>();
        names.add("John");
        names.add("Mike");
        names.add("Shanti");
        names.add("Stacie");
        names.add("Disha");
        names.add("Anil");
        names.add("Ravi");
        names.add("Priya");
        names.add("Amit");
        names.add("Sonia");

        // Print HashSet by iteration
        System.out.println("Initial HashSet:");
        printHashSet(names);

        // 2 - Add duplicate values
        names.add("Mike");  // duplicate
        names.add("Disha"); // duplicate

        System.out.println("\nAfter adding duplicates:");
        printHashSet(names);

        // 3 - Remove 2 values
        names.remove("Ravi");
        names.remove("Priya");

        System.out.println("\nAfter removing 2 values:");
        printHashSet(names);

        // 4 - Find the "index" of "Disha" (simulate by iteration)
        int index = 0;
        int foundIndex = -1;
        for (String name : names) {
            if (name.equals("Disha")) {
                foundIndex = index;
                break;
            }
            index++;
        }

        System.out.println("\nIndex of 'Disha' in HashSet (simulated): " + foundIndex);
    }

    static void printHashSet(HashSet<String> set) {
        Iterator<String> it = set.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
