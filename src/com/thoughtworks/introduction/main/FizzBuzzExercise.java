package com.thoughtworks.introduction.main;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Elyse on 14/02/2016.
 */
public class FizzBuzzExercise {


    private static Boolean numberDivisibleByN(int number, int n) {
        return (number > 0 && number % n == 0);
    }

    public static String getNumberAsFizzBuzz(int n) {
        String result = "";

        if (numberDivisibleByN(n, 3)) {
            result += "Fizz";
        }

        if (numberDivisibleByN(n, 5)) {
            result += "Buzz";
        }

        if (result.isEmpty()) {
            result += n;
        }

        return result;
    }

    public static void fizzBuzz() {
        List<String> allResults = new ArrayList<>();

        for (int n = 1; n <= 100; n++) {
            allResults.add(getNumberAsFizzBuzz(n));
        }

        StringFormatter.printLines(allResults);
    }
}
