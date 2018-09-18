package com.learnJava.lamdas;

import java.util.function.Consumer;

public class LamdaVariable2 {

    static int value = 4;

    public static void main(String[] args) {


        Consumer<Integer> c1 = (i) -> {
            value++;
            System.out.println(value + i);
        };
        //value = 6;

        c1.accept(4);
    }

}
