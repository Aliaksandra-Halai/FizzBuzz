package com.itechart.fizzbuzz;

import com.itechart.fizzbuzz.service.FizzBuzzService;

import java.util.Map;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.toList;

public class Main {

    public static void main(String... args) {
        var service = new FizzBuzzService();
        var numbers = IntStream.rangeClosed(1, 100).boxed().collect(toList());
        var replacementByDivisor = Map.of(5, "Buzz", 3, "Fizz");
        System.out.println(service.processNumbers(numbers, replacementByDivisor));
    }
}
