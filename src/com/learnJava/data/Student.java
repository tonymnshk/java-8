package com.learnJava.data;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name;
    private int gradeLevel;
    private double gpa;
    private String gender;
    List<String> activties = new ArrayList<>();
    private int noteBooks;

    public int getNoteBooks() {
        return noteBooks;
    }

    public void setNoteBooks(int noteBooks) {
        this.noteBooks = noteBooks;
    }

    public Student(String name, int gradeLevel, double gpa, String gender, List<String> activties, int noteBooks) {
        this.name = name;
        this.gradeLevel = gradeLevel;
        this.gpa = gpa;
        this.gender = gender;
        this.activties = activties;
        this.noteBooks = noteBooks;
    }

    public Student(String name, int gradeLevel, double gpa, String gender, List<String> activties) {
        this.name = name;
        this.gradeLevel = gradeLevel;
        this.gpa = gpa;
        this.gender = gender;
        this.activties = activties;
    }

    public Student() {

    }

    public Student(String s) {
        this.name = s;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGradeLevel() {
        return gradeLevel;
    }

    public void setGradeLevel(int gradeLevel) {
        this.gradeLevel = gradeLevel;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public List<String> getActivties() {
        return activties;
    }

    public void printListOfActivities() {
        System.out.println(activties);
    }

    public void setActivties(List<String> activties) {
        this.activties = activties;
    }


    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", gradeLevel='" + gradeLevel + '\'' +
                ", gpa='" + gpa + '\'' +
                ", gender='" + gender + '\'' +
                ", activties=" + activties +
                '}';
    }
}
