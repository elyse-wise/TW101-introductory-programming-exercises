package com.thoughtworks.introduction.test;

import com.thoughtworks.introduction.main.PrimeFactorsExercise;
import org.junit.*;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by Elyse on 14/02/2016.
 */
public class PrimeFactorsExerciseTest {

    @Test
    public void testNoPrimeFactorsFor1() {
        assertTrue(PrimeFactorsExercise.generate(1).isEmpty());
    }

    @Test
    public void testNoPrimeFactorsFor0() {
        assertTrue(PrimeFactorsExercise.generate(0).isEmpty());
    }

    @Test
    public void testNoPrimeFactorsForNegative() {
        assertTrue(PrimeFactorsExercise.generate(-10).isEmpty());
    }

    @Test
    public void testPrimeFactorsFor30() {
        List<Integer> expectedFactors = Arrays.asList(2, 3, 5);
        assertEquals(PrimeFactorsExercise.generate(30), expectedFactors);
    }

    @Test
    public void testPrimeFactorsFor500() {
        List<Integer> expectedFactors = Arrays.asList(2, 2, 5, 5, 5);
        assertEquals(PrimeFactorsExercise.generate(500), expectedFactors);
    }
}
