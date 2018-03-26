package com.example.fizzbuzz;

import java.util.Arrays;

public class FizzBuzz {
    public static void main(String[] args) {
        new FizzBuzz().printFizzBuzz();
    }

    /**
     * Auxiliary method printing fizz/buzz/numbers from 1 to 100
     */
    private void printFizzBuzz() {
        Arrays.stream(fizzBuzz(1, 100)).forEach(System.out::println);
    }


    /**
     * Creates an array of strings containing fizz/buzz/numbers
     *
     * @param start first number, positive integer
     * @param end last number, positive integer, greater than or equal to start
     *
     * @return array of fizz/buzz/numbers
     */
    public String[] fizzBuzz(int start, int end) {
        String[] fbNums = new String[end - start + 1];

        for (int i = 0; i < fbNums.length; i++) {
            int currentN = start + i;
            String stringToAdd = "";

            if (currentN % 3 == 0) {
                stringToAdd += "Fizz";
            }
            if (currentN % 5 == 0) {
                stringToAdd += "Buzz";
            }
            fbNums[i] = stringToAdd.isEmpty() ? String.valueOf(currentN) : stringToAdd;
        }
        return fbNums;
    }
}
