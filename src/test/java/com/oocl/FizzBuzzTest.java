package com.oocl;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FizzBuzzTest {

    FizzBuzz fizzBuzz = new FizzBuzz();

    @Test
    public void test_fizzBuzz_response_when_raw_number_return_raw_number() {
        // Given
        int number = 1;

        // When
        String actualResponse = fizzBuzz.response(number);

        // Then
        assertEquals(actualResponse, number+"");
    }

    @Test
    public void test_fizzBuzz_response_when_multiples_of_3_return_fizz() {
        // Given
        int number = 3;

        // When
        String actualResponse = fizzBuzz.response(number);

        // Then
        assertEquals(actualResponse, "Fizz");
    }

    @Test
    public void test_fizzBuzz_response_when_multiples_of_5_return_buzz() {
        // Given
        int number = 5;

        // When
        String actualResponse = fizzBuzz.response(number);

        // Then
        assertEquals(actualResponse, "Buzz");
    }

    @Test
    public void test_fizzBuzz_response_when_multiples_of_3_and_5_return_fizzBuzz() {
        // Given
        int number = 15;

        // When
        String actualResponse = fizzBuzz.response(number);

        // Then
        assertEquals(actualResponse, "FizzBuzz");
    }
}