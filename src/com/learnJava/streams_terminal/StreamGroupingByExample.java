package com.learnJava.streams_terminal;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

import java.util.*;

import static java.util.stream.Collectors.*;

public class StreamGroupingByExample {
    static void groupStudentsByGender() {
        Map<String, List<Student>> studentMap = StudentDataBase.getAllStudents()
                .stream()
                .collect(groupingBy(Student::getGender));
        System.out.println(studentMap);
    }

    static void customizedGroupingBy() {
        Map<String, List<Student>> studentMap = StudentDataBase.getAllStudents()
                .stream()
                .collect(groupingBy(student -> student.getGpa() >= 3.8? "OUTSTANDING" : "AVERAGE"));
        System.out.println(studentMap);
    }

    static void twoLevelGroupoing_1() {
        Map<Integer, Map<String, List<Student>>> studentMap = StudentDataBase.getAllStudents()
                .stream()
                .collect(groupingBy(Student::getGradeLevel,
                        groupingBy(student -> student.getGpa() >= 3.8? "OUTSTANDING" : "AVERAGE")));
        System.out.println(studentMap);
    }
    static void twoLevelGroupoing_2() {
        Map<String, Integer> studentMap = StudentDataBase.getAllStudents()
                .stream()
                .collect(groupingBy(Student::getName,
                        summingInt(Student::getNoteBooks)));
        System.out.println(studentMap);
    }

    static void threeArgumentGroupBy() {
        LinkedHashMap<String, Set<Student>> studentLinkedHashmap = StudentDataBase.getAllStudents()
                .stream()
                .collect(groupingBy(Student::getName, LinkedHashMap::new, toSet()));
        System.out.println(studentLinkedHashmap);
    }

    static void calculateTopGpa() {
        Map<Integer, Optional<Student>> studentMapOptional = StudentDataBase.getAllStudents()
                .stream()
                .collect(groupingBy(Student::getGradeLevel,
                        maxBy(Comparator.comparing(Student::getGpa))));
        System.out.println(studentMapOptional);

        System.out.println("------------------------");

        Map<Integer, Student> studentMapOptional1 = StudentDataBase.getAllStudents()
                .stream()
                .collect(groupingBy(Student::getGradeLevel,
                        collectingAndThen(maxBy(Comparator.comparing(Student::getGpa)),
                        Optional::get)));
        System.out.println(studentMapOptional1);
    }

    static void calculateLeastGpa() {
        Map<Integer, Optional<Student>> studentMapOptional = StudentDataBase.getAllStudents()
                .stream()
                .collect(groupingBy(Student::getGradeLevel,
                        minBy(Comparator.comparing(Student::getGpa))));
        System.out.println(studentMapOptional);

        System.out.println("------------------------");

        Map<Integer, Student> studentMapOptional1 = StudentDataBase.getAllStudents()
                .stream()
                .collect(groupingBy(Student::getGradeLevel,
                        collectingAndThen(minBy(Comparator.comparing(Student::getGpa)),
                                Optional::get)));
        System.out.println(studentMapOptional1);
    }

    public static void main(String[] args) {
        //groupStudentsByGender();
        //customizedGroupingBy();
        //twoLevelGroupoing_2();
        //threeArgumentGroupBy();
        //calculateTopGpa();
        calculateLeastGpa();
    }
}

























