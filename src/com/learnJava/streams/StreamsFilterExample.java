package com.learnJava.streams;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

import java.util.List;
import java.util.stream.Collectors;

public class StreamsFilterExample {
    public static List<Student> filterStudents() {
        return StudentDataBase.getAllStudents().stream() //Stream<Student>
                .filter(student -> student.getGender().equals("female"))
                .collect(Collectors.toList());
    }
    public static void main(String[] args) {
        filterStudents().forEach(System.out::println);

    }
}
