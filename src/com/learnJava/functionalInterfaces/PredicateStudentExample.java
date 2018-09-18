package com.learnJava.functionalInterfaces;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

import java.util.List;
import java.util.function.Predicate;

public class PredicateStudentExample {
    static Predicate<Student> p1 = (student) -> student.getGradeLevel() >= 3;
    static Predicate<Student> p2 = (student) -> student.getGpa() >= 3.9;

    static void filterStudentByGradeLevel() {
        System.out.println("filterStudentByGradeLevel: ");
        List<Student> studentList = StudentDataBase.getAllStudents();
        studentList.forEach(student -> {
            if(p1.test(student)) {
                System.out.println(student);
            }
        });
    }

    static void filterStudentByGpa() {
        System.out.println("filterStudentByGpa: ");
        List<Student> studentList = StudentDataBase.getAllStudents();
        studentList.forEach(student -> {
            if(p2.test(student)) {
                System.out.println(student);
            }
        });
    }

    static void filterStudents() {
        System.out.println("filterStudentByGpa and filterStudentByGradeLevel: ");
        List<Student> studentList = StudentDataBase.getAllStudents();
        studentList.forEach(student -> {
            if(p1.or(p2).negate().test(student)) {
                System.out.println(student);
            }
        });
    }
    public static void main(String[] args) {
        filterStudentByGradeLevel();
        filterStudentByGpa();
        filterStudents();

    }
}
