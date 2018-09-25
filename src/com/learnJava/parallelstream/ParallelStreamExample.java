package com.learnJava.parallelstream;

import java.util.function.Supplier;
import java.util.stream.IntStream;

public class ParallelStreamExample {

    static long checkPerformanceResult(Supplier<Integer> supplier, int numberoOfTimes) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < numberoOfTimes; i++) {
            supplier.get();
        }
        long endTime = System.currentTimeMillis();

        return  endTime - startTime;
    }


    static int sumSequentialStream() {
        return IntStream.rangeClosed(1, 100000)
                .sum();
    }
    static int sumParallelStream() {
        return IntStream.rangeClosed(1, 100000)
                .parallel()
                .sum();
    }

    public static void main(String[] args) {
        System.out.println(Runtime.getRuntime().availableProcessors());

        System.out.println("Sum Sequential: " + checkPerformanceResult(()->sumSequentialStream(), 20));
        System.out.println("Sum Parallel: " + checkPerformanceResult(ParallelStreamExample::sumParallelStream, 20));

    }
}
