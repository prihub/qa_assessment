package com.bootcampexercise.module8.activity4;

import java.util.ArrayList;

/**
 * Demonstrates ArrayList operations with Student objects.
 */
public class StudentArrayList {

    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<>();

        addStudent(students, new Student(1, "John", 85));
        addStudent(students, new Student(2, "Sara", 90));
        addStudent(students, new Student(3, "Mike", 75));

        System.out.println("All Students:");
        printStudents(students);

        // Removing student with ID 3
        students.removeIf(s -> s.getId() == 3);

        System.out.println("After removing ID 3:");
        printStudents(students);

        // Finding highest grade
        Student topStudent = null;
        for (Student s : students) {
            if (topStudent == null || s.getGrade() > topStudent.getGrade()) {
                topStudent = s;
            }
        }

        System.out.println("Top Student:");
        if (topStudent != null) {
            topStudent.printStudent();
        }
    }

    /**
     * Adds student if ID is not duplicate.
     */
    static void addStudent(ArrayList<Student> list, Student newStudent) {
        for (Student s : list) {
            if (s.getId() == newStudent.getId()) {
                return;
            }
        }
        list.add(newStudent);
    }

    /**
     * Prints all students.
     */
    static void printStudents(ArrayList<Student> list) {
        for (Student s : list) {
            s.printStudent();
        }
    }
}