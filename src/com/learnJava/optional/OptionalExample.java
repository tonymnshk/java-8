package com.learnJava.optional;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

import java.util.Optional;

public class OptionalExample {
    static String getStudentName() {

        //Student student = StudentDataBase.studentSupplier.get();
        Student student = null;
        if (student !=null) {
            return student.getName();
        }
        return  null;
    }

    static Optional<String> getStudentNameOptional() {
        //Optional<Student> studentOptional = Optional.ofNullable(StudentDataBase.studentSupplier.get());
        Optional<Student> studentOptional = Optional.ofNullable(null); // Optional.empty()
        if (studentOptional.isPresent()) {
            return studentOptional.map(Student::getName); // Optional<String>
        }

        return Optional.empty();// Represents an optional object with no value
    }

    public static void main(String[] args) {
        /*String name = getStudentName();
        System.out.println("Length of the student name: " + name.length());*/

        Optional<String> stringOptional = getStudentNameOptional();
        if (stringOptional.isPresent()) {
            System.out.println(stringOptional.get().length());
        } else {
            System.out.println("Name not found");
        }

    }
}
