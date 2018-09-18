package com.learnJava.streams;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

import java.util.List;
import java.util.stream.Collectors;

public class StreamsMapExampl {
    public static List<String> namesList() {
        List<String> studentList = StudentDataBase.getAllStudents().stream() // Stream<Student>
                // Student as an input -> Student Name
                .map(Student::getName) // Stream<String>
                .map(String::toUpperCase) // Stream<String>
                .collect(Collectors.toList()); // List<String>

        return studentList;
    }
    public static void main(String[] args) {
        System.out.println(namesList());
    }
}
