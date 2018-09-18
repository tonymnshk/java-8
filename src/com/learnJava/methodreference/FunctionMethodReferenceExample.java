package com.learnJava.methodreference;

import java.util.function.Function;

public class FunctionMethodReferenceExample {

    static Function<String, String> toUpperCaeLamda = String::toUpperCase;
    static Function<String, String> toUpperCaeReference = String::toUpperCase;

    public static void main(String[] args) {
        System.out.println(toUpperCaeLamda.apply("java8"));
        System.out.println(toUpperCaeReference.apply("java8"));
    }

}
