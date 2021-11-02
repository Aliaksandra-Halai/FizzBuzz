package com.itechart.fizzbuzz.service;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.toList;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzServiceTest {

    private final FizzBuzzService fizzBuzzService = new FizzBuzzService();

    @Test
    public void processNumbersTestWithInitialCase() {
        //GIVEN
        var numbers = IntStream.rangeClosed(5, 15).boxed().collect(toList());
        var expected = "Buzz Fizz 7 8 Fizz Buzz 11 Fizz 13 14 FizzBuzz";

        //WHEN
        var result = fizzBuzzService.processNumbers(numbers);

        //THEN
        assertEquals(expected, result);
    }

}
