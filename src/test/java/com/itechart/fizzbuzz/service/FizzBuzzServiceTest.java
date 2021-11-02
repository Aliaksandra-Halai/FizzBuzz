package com.itechart.fizzbuzz.service;

import org.junit.jupiter.api.Test;

import java.util.Map;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.toList;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzServiceTest {

    private final FizzBuzzService fizzBuzzService = new FizzBuzzService();

    @Test
    public void processNumbersWithInitialCase() {
        //GIVEN
        var numbers = IntStream.rangeClosed(5, 15).boxed().collect(toList());
        var replacementByDivisor = Map.of(3, "Fizz", 5, "Buzz");
        var expected = "Buzz Fizz 7 8 Fizz Buzz 11 Fizz 13 14 FizzBuzz";

        //WHEN
        var result = fizzBuzzService.processNumbers(numbers, replacementByDivisor);

        //THEN
        assertEquals(expected, result);
    }

    @Test
    public void processNumbersWithUnsortedInitialCase() {
        //GIVEN
        var numbers = IntStream.rangeClosed(5, 15).boxed().collect(toList());
        var replacementByDivisor = Map.of(5, "Buzz", 3, "Fizz");
        var expected = "Buzz Fizz 7 8 Fizz Buzz 11 Fizz 13 14 FizzBuzz";

        //WHEN
        var result = fizzBuzzService.processNumbers(numbers, replacementByDivisor);

        //THEN
        assertEquals(expected, result);
    }

    @Test
    public void processNumbersWithUnsortedDivisorsMap() {
        //GIVEN
        var numbers = IntStream.rangeClosed(5, 15).boxed().collect(toList());
        var replacementByDivisor = Map.of(2, "New", 5, "Buzz", 3, "Fizz");
        var expected = "Buzz NewFizz 7 New Fizz NewBuzz 11 NewFizz 13 New FizzBuzz";

        //WHEN
        var result = fizzBuzzService.processNumbers(numbers, replacementByDivisor);

        //THEN
        assertEquals(expected, result);
    }

}
