package com.learnJava.optional;

import java.util.Optional;

public class OptionalOfEmptyNullableExample {
    static Optional<String> ofNullable() {
        Optional<String> stringOptional = Optional.ofNullable("Hello");
        return stringOptional;
    }
    static Optional<String> of() {
        Optional<String> stringOptional = Optional.of("Hello");
        return stringOptional;
    }
    static Optional<String> empty() {
        return Optional.empty();
    }

    public static void main(String[] args) {
        System.out.println("ofNullable: " + ofNullable());
        System.out.println("of: " + of());
        System.out.println("empty: " + empty());

    }
}
