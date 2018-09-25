package com.learnJava.numericstream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class NumericStreamMapExample {
    static List<Integer> mapToObj() {
        return IntStream.rangeClosed(1, 5)
                .mapToObj(i -> new Integer(i))
                .collect(Collectors.toList());
    }

    static long mapToLong() {
        return IntStream.rangeClosed(1, 5)
                .mapToLong(i -> i)
                .sum();
    }

    static double mapToDouble() {
        return IntStream.rangeClosed(1, 5)
                .mapToDouble(i -> i)
                .sum();
    }



    public static void main(String[] args) {
        System.out.println("mapToObj: " + mapToObj());

        System.out.println("mapToLong: " + mapToLong());

        System.out.println("mapToDouble: " + mapToDouble());

    }
}
