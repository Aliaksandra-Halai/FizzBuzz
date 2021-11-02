package com.itechart.fizzbuzz.service;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import static java.util.stream.Collectors.joining;

public class FizzBuzzService {

    public String processNumbers(final List<Integer> numbers, final Map<Integer, String> replacementByDivisor) {
        return numbers.stream().map((number) -> processNumber(number, replacementByDivisor))
                .collect(joining(" "));
    }

    private String processNumber(final Integer number, final Map<Integer, String> replacementByDivisor) {
        var builder = new StringBuilder();

        var sortedReplacementByDivisor = new TreeMap<>(replacementByDivisor);
        sortedReplacementByDivisor.forEach((key, value) -> {
            if (number % key == 0) {
                builder.append(value);
            }
        });

        var result = builder.toString();
        return result.isEmpty() ? number.toString() : result;
    }
}
