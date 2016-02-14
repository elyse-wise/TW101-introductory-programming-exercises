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
        assertEquals("*", outContent.toString());

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
        DiamondExercises.drawIsoscelesTriangle(0);
        assertEquals("", outContent.toString());
    }

    @Test
    public void testDrawDiamond() {
        DiamondExercises.drawDiamond(1);
        assertEquals("*", outContent.toString());

        outContent.reset();
        DiamondExercises.drawDiamond(3);
        assertEquals("  *  " + newLine +
                " *** " + newLine +
                "*****" + newLine +
                " *** " + newLine +
                "  *  ", outContent.toString());

        outContent.reset();
        DiamondExercises.drawDiamond(5);
        assertEquals("    *    " + newLine +
                "   ***   " + newLine +
                "  *****  " + newLine +
                " ******* " + newLine +
                "*********" + newLine +
                " ******* " + newLine +
                "  *****  " + newLine +
                "   ***   " + newLine +
                "    *    ", outContent.toString());

        outContent.reset();
        DiamondExercises.drawDiamond(0);
        assertEquals("", outContent.toString());
    }

    /**
     * Note: The spec is ambiguous,
     * I assume the 'name' in the diamond should be centered.
     */
    @Test
    public void testDrawDiamondWithName() {
        String name = "Elyse";

        DiamondExercises.drawDiamondWithName(1);
        assertEquals(name, outContent.toString());

        outContent.reset();
        DiamondExercises.drawDiamondWithName(3);
        assertEquals("  *  " + newLine +
                " *** " + newLine +
                name + newLine +
                " *** " + newLine +
                "  *  ", outContent.toString());

        outContent.reset();
        DiamondExercises.drawDiamondWithName(5);
        assertEquals("    *    " + newLine +
                "   ***   " + newLine +
                "  *****  " + newLine +
                " ******* " + newLine +
                "  " + name + "  " + newLine +
                " ******* " + newLine +
                "  *****  " + newLine +
                "   ***   " + newLine +
                "    *    ", outContent.toString());

        outContent.reset();
        DiamondExercises.drawDiamondWithName(0);
        assertEquals("", outContent.toString());
    }

    @After
    public void cleanUpStreams() {
        System.setOut(null);
        System.setErr(null);
    }
}