package com.thoughtworks.introduction.main;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Elyse on 14/02/2016.
 */
public class PrimeFactorsExercise {

    private static Boolean hasFactorOf(int number, int i) {
        return (number % i == 0);
    }

    /**
     * The division of ceiling /= i ensures
     * we are only considering prime numbers
     * as potential factors.
     */
    public static List<Integer> generate(int n) {

        int ceiling = n;

        List<Integer> primeFactors = new ArrayList<Integer>();

        for (int i = 2; i <= ceiling; i++) {
            while (hasFactorOf(ceiling, i)) {
                primeFactors.add(i);
                ceiling /= i;
            }
        }
        return primeFactors;
    }
}
