package com.example.fizzbuzz;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class FizzBuzzTest {

    private FizzBuzz fizzBuzz;

    private static String[] FB_NUM_1_20 = {"1",    "2",    "Fizz", "4",    "Buzz",
                                           "Fizz", "7",    "8",    "Fizz", "Buzz",
                                           "11",   "Fizz", "13",   "14",   "FizzBuzz",
                                           "16",    "17",  "Fizz", "19",   "Buzz" };

    @Before
    public void start() {
        fizzBuzz = new FizzBuzz();
    }

    @Test
    public void testFizzBuzzPrintsFrom1to20() {
        assertArrayEquals("Numbers from 1 to 20", fizzBuzz.fizzBuzz(1, 100), FB_NUM_1_20);
    }
}
