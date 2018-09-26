package com.learnJava.defaults;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class DefaultMethodsExample2 {
    static Consumer<Student> studentConsumer = (student -> System.out.println(student));
    static Comparator<Student> nameComparator = Comparator.comparing(Student::getName);
    static Comparator<Student> gradeComparator = Comparator.comparing(Student::getGradeLevel);

    static void sortByName(List<Student> studentList) {
        System.out.println("After Sort: ");
        studentList.sort(nameComparator);
        studentList.forEach(studentConsumer);
    }

    static void sortByGPA(List<Student> studentList) {
        System.out.println("After Sort: ");
        studentList.sort(nameComparator);
        studentList.forEach(studentConsumer);
    }

    static void comparatorChaining(List<Student> studentList) {
        System.out.println("After comparatorChaining: ");
        studentList.sort(gradeComparator.thenComparing(nameComparator));
        studentList.forEach(studentConsumer);
    }

    static void sortWithNullValues(List<Student> studentList) {
        System.out.println("After sortWithNullValues: ");
        Comparator<Student> studentComparator = Comparator.nullsLast(nameComparator);
        studentList.sort(studentComparator);
        studentList.forEach(studentConsumer);

    }

    public static void main(String[] args) {
        List<Student> studentList = StudentDataBase.getAllStudents();
        System.out.println("Before sort: ");
        studentList.forEach(studentConsumer);

        //sortByName(studentList);
        // sortByGPA(studentList);
        //comparatorChaining(studentList);
        sortWithNullValues(studentList);

    }
}
