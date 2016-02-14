package com.thoughtworks.introduction.test;

import com.thoughtworks.introduction.main.TriangleExercises;

import static org.junit.Assert.*;

import java.io.*;

import org.junit.*;

/**
 * Created by Elyse on 14/02/2016.
 */
public class TriangleExercisesTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private String newLine = System.getProperty("line.separator");

    /**
     * Set STDOUT and STDERROR to Print streams, so we can inspect printed
     * output from main
     */
    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @Test
    public void testEasiestExerciseEver() {
        TriangleExercises.easiestExerciseEver();
        assertEquals("*", outContent.toString());
    }

    @Test
    public void testDrawHorizontalLine() {
        TriangleExercises.drawHorizontalLine(3);
        assertEquals("***", outContent.toString());

        outContent.reset();
        TriangleExercises.drawHorizontalLine(8);
        assertEquals("********", outContent.toString());

        outContent.reset();
        TriangleExercises.drawHorizontalLine(0);
        assertEquals("", outContent.toString());
    }


    @Test
    public void testDrawRightTriangle() {
        TriangleExercises.drawRightTriangle(3);
        assertEquals("*" + newLine +
                "**" + newLine +
                "***", outContent.toString());

        outContent.reset();
        TriangleExercises.drawRightTriangle(6);
        assertEquals("*" + newLine +
                "**" + newLine +
                "***" + newLine +
                "****" + newLine +
                "*****" + newLine +
                "******", outContent.toString());

        outContent.reset();
        TriangleExercises.drawRightTriangle(0);
        assertEquals("", outContent.toString());
    }

    @After
    public void cleanUpStreams() {
        System.setOut(null);
        System.setErr(null);
    }
}