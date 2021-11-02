package com.itechart.fizzbuzz.service;

import java.util.List;

import static java.util.stream.Collectors.joining;

public class FizzBuzzService {

    public String processNumbers(final List<Integer> numbers) {
        return numbers.stream().map(this::processNumber).collect(joining(" "));
    }

    private String processNumber(final Integer number) {
        var builder = new StringBuilder();

        if (number % 3 == 0) {
            builder.append("Fizz");
        }

        if (number % 5 == 0) {
            builder.append("Buzz");
        }

        var result = builder.toString();
        return result.isEmpty() ? number.toString() : result;
    }
}
