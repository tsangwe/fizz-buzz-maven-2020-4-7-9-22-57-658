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
        assertEquals(actualResponse, "1");
    }
}