package com.learnJava.streams;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

public class StreamsFlatMapExample {

    public static List<String> printStudentActivities() {
        List<String> studentActivities = StudentDataBase.getAllStudents().stream() // Stream<Student>
                .map(Student::getActivties) // Stream<List<String>>
                .flatMap(List::stream) // Stream<String>
                .distinct()
                .sorted()
                .collect(toList());

        return studentActivities;
    }

    public static long getStudentActivitiesCount() {
        long noOfstudentActivities = StudentDataBase.getAllStudents().stream() // Stream<Student>
                .map(Student::getActivties) // Stream<List<String>>
                .flatMap(List::stream) // Stream<String>
                .distinct()
                .count();
        return noOfstudentActivities;
    }
    public static void main(String[] args) {
        System.out.println("printStudentActivities: " + printStudentActivities());
        System.out.println("getStudentActivitiesCount: " + getStudentActivitiesCount());

    }

}
