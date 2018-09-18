package com.learnJava.functionalInterfaces;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {
    static Consumer<Student> c2 = (s) -> System.out.println(s);
    static Consumer<Student> c3 = (student) -> System.out.print(student.getName());
    static Consumer<Student> c4 = (student) -> System.out.println(student.getActivties());

    public static void printName() {
        List<Student> studentList = StudentDataBase.getAllStudents();
        studentList.forEach(c2);
    }

    public static void printNameAndActivities() {
        System.out.println("printNameAndActivities: ");
        List<Student> studentList = StudentDataBase.getAllStudents();

        studentList.forEach(c3.andThen(c4)); // consumer chaining

    }

    public static void printNameAndActivitiesUsingCondition() {
        System.out.println("printNameAndActivitesUsingCondition: ");
        List<Student> studentList = StudentDataBase.getAllStudents();

        studentList.forEach(student -> {
            if (student.getGradeLevel() >= 3 && student.getGpa() >= 3.9) {
                c3.andThen(c4).accept(student);
            }
        });

    }

    public static void main(String[] args) {
        Consumer<String> c1 = (s) -> System.out.println(s.toUpperCase());
        c1.accept("java8");

        //printName();

        printNameAndActivities();

        //printNameAndActivitiesUsingCondition();
    }
}
