package com.bootcampexercise.module9.activity2;

import junit.framework.TestCase;
import java.util.ArrayList;

/**
 * Unit tests for StudentArrayList functionality.
 */
public class StudentTest extends TestCase {

    private ArrayList<Student> studentList;

    protected void setUp() {
        studentList = new ArrayList<>();
    }

    /**
     * Test adding a student.
     */
    public void testAddStudent() {
        StudentArrayList.addStudent(studentList, new Student(1, "John", 80));
        assertEquals(1, studentList.size());
    }

    /**
     * Test duplicate ID prevention.
     */
    public void testDuplicateStudent() {
        StudentArrayList.addStudent(studentList, new Student(1, "John", 80));
        StudentArrayList.addStudent(studentList, new Student(1, "Mike", 90));

        assertEquals(1, studentList.size());
    }

    /**
     * Test removing student by ID.
     */
    public void testRemoveStudent() {
        studentList.add(new Student(1, "John", 80));
        studentList.removeIf(s -> s.getId() == 1);

        assertEquals(0, studentList.size());
    }

    /**
     * Test highest grade logic.
     */
    public void testHighestGrade() {
        studentList.add(new Student(1, "John", 80));
        studentList.add(new Student(2, "Mike", 90));

        Student top = null;
        for (Student s : studentList) {
            if (top == null || s.getGrade() > top.getGrade()) {
                top = s;
            }
        }

        assertEquals(90.0, top.getGrade());
    }

    /**
     * Test student list is not empty after adding.
     */
    public void testListNotEmpty() {
        studentList.add(new Student(1, "John", 80));
        assertFalse(studentList.isEmpty());
    }
}