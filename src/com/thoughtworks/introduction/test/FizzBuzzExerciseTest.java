package com.thoughtworks.introduction.test;

import static org.junit.Assert.*;

import java.io.*;

import com.thoughtworks.introduction.main.FizzBuzzExercise;
import org.junit.*;

/**
 * Created by Elyse on 14/02/2016.
 */
public class FizzBuzzExerciseTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private String newLine = System.getProperty("line.separator");

    /**
     * Set STDOUT to Print stream, so we can inspect printed output
     */
    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @Test
    public void testDivisibleBy3() {
        assertEquals("Fizz", FizzBuzzExercise.getNumberAsFizzBuzz(3));
        assertEquals("Fizz", FizzBuzzExercise.getNumberAsFizzBuzz(9));

        assertNotEquals("Fizz", FizzBuzzExercise.getNumberAsFizzBuzz(8));
        assertNotEquals("Fizz", FizzBuzzExercise.getNumberAsFizzBuzz(5));
        assertNotEquals("Fizz", FizzBuzzExercise.getNumberAsFizzBuzz(0));
        assertNotEquals("Fizz", FizzBuzzExercise.getNumberAsFizzBuzz(-10));

    }

    @Test
    public void testDivisibleBy5() {
        assertEquals("Buzz", FizzBuzzExercise.getNumberAsFizzBuzz(5));
        assertEquals("Buzz", FizzBuzzExercise.getNumberAsFizzBuzz(25));

        assertNotEquals("Buzz", FizzBuzzExercise.getNumberAsFizzBuzz(8));
        assertNotEquals("Buzz", FizzBuzzExercise.getNumberAsFizzBuzz(3));
        assertNotEquals("Buzz", FizzBuzzExercise.getNumberAsFizzBuzz(0));
        assertNotEquals("Buzz", FizzBuzzExercise.getNumberAsFizzBuzz(-10));
    }

    @Test
    public void testFizzBuzzDivisibleBy3And5() {
        assertEquals("FizzBuzz", FizzBuzzExercise.getNumberAsFizzBuzz(15));

        assertNotEquals("FizzBuzz", FizzBuzzExercise.getNumberAsFizzBuzz(3));
        assertNotEquals("FizzBuzz", FizzBuzzExercise.getNumberAsFizzBuzz(5));
        assertNotEquals("FizzBuzz", FizzBuzzExercise.getNumberAsFizzBuzz(0));
        assertNotEquals("FizzBuzz", FizzBuzzExercise.getNumberAsFizzBuzz(-10));

    }

    @Test
    public void testFizzBuzzNotDivisibleBy3Or5() {
        assertEquals("1", FizzBuzzExercise.getNumberAsFizzBuzz(1));
        assertEquals("11", FizzBuzzExercise.getNumberAsFizzBuzz(11));
        assertEquals("2", FizzBuzzExercise.getNumberAsFizzBuzz(2));
        assertEquals("0", FizzBuzzExercise.getNumberAsFizzBuzz(0));
        assertEquals("-10", FizzBuzzExercise.getNumberAsFizzBuzz(-10));

        assertNotEquals("3", FizzBuzzExercise.getNumberAsFizzBuzz(3));
        assertNotEquals("5", FizzBuzzExercise.getNumberAsFizzBuzz(5));

    }

    @Test
    public void testFizzBuzz() {

        FizzBuzzExercise.fizzBuzz();
        String fizzBuzzResults = outContent.toString();

        String sampleResults = "1" + newLine +
                "2" + newLine +
                "Fizz" + newLine +
                "4" + newLine +
                "Buzz" + newLine +
                "Fizz" + newLine +
                "7" + newLine +
                "8" + newLine +
                "Fizz" + newLine +
                "Buzz" + newLine +
                "11" + newLine +
                "Fizz" + newLine +
                "13" + newLine +
                "14" + newLine +
                "FizzBuzz";

        assertTrue(fizzBuzzResults.startsWith(sampleResults));
    }

    @After
    public void cleanUpStreams() {
        System.setOut(null);
        System.setErr(null);
    }
}