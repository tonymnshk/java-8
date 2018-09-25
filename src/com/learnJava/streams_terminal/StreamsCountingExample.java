package com.learnJava.streams_terminal;

import com.learnJava.data.StudentDataBase;

import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;

public class StreamsCountingExample {
    static long count() {
        return StudentDataBase.getAllStudents().stream()
                .filter(student -> student.getGpa() >= 3.9)
                .collect(counting());
    }

    public static void main(String[] args) {
        System.out.println("count(): " + count());
    }
}
