package com.studentmanagement.model;

public class App {
    public static void main(String[] args) {

        Student myStudent = new Student(101, "Alex", "alex@gmail.com", 21, "Computer Science" );

        System.out.println("Student ID: " + myStudent.getId());

        System.out.println("Original Name: " + myStudent.getName());

        myStudent.setName("Alexandre");

        System.out.println("Updated Name: " + myStudent.getName());
    }
}
