package com.thoughtworks.introduction.test;

import com.thoughtworks.introduction.main.DiamondExercises;

import static org.junit.Assert.*;

import java.io.*;

import org.junit.*;

/**
 * Created by Elyse on 14/02/2016.
 */
public class DiamondExercisesTest {

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
    public void testDrawIsoscelesTriangle() {
        DiamondExercises.drawIsoscelesTriangle(1);
        assertEquals("  *  " + newLine +
                " *** " + newLine +
                "*****", outContent.toString());

        outContent.reset();
        DiamondExercises.drawIsoscelesTriangle(3);
        assertEquals("  *  " + newLine +
                " *** " + newLine +
                "*****", outContent.toString());

        outContent.reset();
        DiamondExercises.drawIsoscelesTriangle(5);
        assertEquals("    *    " + newLine +
                "   ***   " + newLine +
                "  *****  " + newLine +
                " ******* " + newLine +
                "*********", outContent.toString());

        outContent.reset();
        DiamondExercises.drawIsoscelesTriangle(3);
        assertEquals("", outContent.toString());
    }

    @After
    public void cleanUpStreams() {
        System.setOut(null);
        System.setErr(null);
    }
}