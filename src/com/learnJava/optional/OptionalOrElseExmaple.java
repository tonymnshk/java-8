package com.learnJava.optional;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

import java.util.Optional;

public class OptionalOrElseExmaple {

    //orElse
    static String optionalOrElse() {
        /*Optional<Student> studentOptional =
                Optional.ofNullable(StudentDataBase.studentSupplier.get());*/

        Optional<Student> studentOptional = Optional.ofNullable(null); // Option.empty
        String name = studentOptional.map(Student::getName).orElse("Default");
        return name;
    }

    //orElseGet
    static String optionalOrElseGet() {
        Optional<Student> studentOptional = Optional.ofNullable(null);
                //Optional.ofNullable(StudentDataBase.studentSupplier.get());

        String name = studentOptional.map(Student::getName).orElseGet(() -> "Default");
        return name;
    }
    //orElseThrow
    static String optionalOrElseThrow() {
        Optional<Student> studentOptional = Optional.ofNullable(null);
                //Optional.ofNullable(StudentDataBase.studentSupplier.get());

        String name = studentOptional.map(Student::getName)
                .orElseThrow(() -> new RuntimeException("No Data Available"));
        return name;
    }
    public static void main(String[] args) {
        System.out.println("orElse: " + optionalOrElse());
        System.out.println("orElseGet: " + optionalOrElseGet());
        System.out.println("orElseThrow: " + optionalOrElseThrow());

    }
}
