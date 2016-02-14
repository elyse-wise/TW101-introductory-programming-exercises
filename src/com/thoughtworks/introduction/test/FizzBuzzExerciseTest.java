package com.thoughtworks.introduction.test;

import com.thoughtworks.introduction.main.DiamondExercises;

import static org.junit.Assert.*;

import java.io.*;

import org.junit.*;

/**
 * Created by Elyse on 14/02/2016.
 */
public class FizzBuzzExerciseTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private String newLine = System.getProperty("line.separator");


    @Test
    public void testDivisibleBy3() {
        //TODO
    }

    @Test
    public void testDivisibleBy5() {
        //TODO
    }

    @Test
    public void testFizzBuzzDivisibleBy3And5() {
        //TODO
    }

    @Test
    public void testFizzBuzzNotDivisibleBy3Or5() {
        //TODO
    }

    @After
    public void cleanUpStreams() {
        System.setOut(null);
        System.setErr(null);
    }
}