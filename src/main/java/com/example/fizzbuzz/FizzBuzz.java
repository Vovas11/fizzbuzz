package com.example.fizzbuzz;

import java.util.Arrays;

public class FizzBuzz {
    public static void main(String[] args) {
        new FizzBuzz().printFizzBuzz();
    }

    private void printFizzBuzz() {
        Arrays.stream(fizzBuzz(1, 100)).forEach(System.out::println);
    }


    /**
     * Creates an array of strings containing fizz buzz numbers
     *
     * @param start first number
     * @param end last number
     *
     * @return array of FizzBuzz numbers
     */
    public String[] fizzBuzz(int start, int end) {
        // TODO
        return null;
    }
}
