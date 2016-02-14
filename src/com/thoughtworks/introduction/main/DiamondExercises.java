package com.thoughtworks.introduction.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by Elyse on 14/02/2016.
 */
public class DiamondExercises {

    private static String name = "Elyse";

    private static String buildRepeatingString(String s, int n) {

        String finalString = "";
        for (int i = 1; i <= n; i++) {
            finalString += s;
        }
        return finalString;
    }

    /**
     * find the length of the longest String in a List
     */
    private static int getLongestLineLength(List<String> lines) {
        int lineLength = 0;

        for (String s : lines) {
            if (s.length() > lineLength) {
                lineLength = s.length();
            }
        }

        return lineLength;
    }

    /**
     * Print a padded string (centered to a set length)
     */
    private static String buildCentrePaddedString(String content, int lineLength) {
        int sidePaddingLength = (lineLength - content.length()) / 2;

        String sidePadding = buildRepeatingString(" ", sidePaddingLength);

        String finalString = sidePadding + content + sidePadding;

        //handle odd lengths
        if (lineLength > 1 && lineLength % 2 == 0) {
            finalString += " ";
        }

        return finalString;
    }

    private static List<String> buildCentrePaddedLines(List<String> lines) {
        int lineLength = getLongestLineLength(lines);

        for (int i = 0; i < lines.size(); i++) {
            String centeredLine = buildCentrePaddedString(lines.get(i), lineLength);
            lines.set(i, centeredLine);
        }

        return lines;
    }

    /**
     * print a list of strings, separated by a newline.
     * do not add a newline at the end.
     */
    private static void printLines(List<String> lines) {

        if (lines.size() > 0) {

            System.out.print(lines.get(0));

            for (int i = 1; i < lines.size(); i++) {
                System.out.println();
                System.out.print(lines.get(i));
            }
        }
    }

    public static List<String> getIsoscelesTriangle(int n) {

        ArrayList<String> lines = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            int lineLength = i * 2 - 1;
            lines.add(buildRepeatingString("*", lineLength));
        }

        return (lines);
    }

    public static void drawIsoscelesTriangle(int n) {

        List<String> triangle = getIsoscelesTriangle(n);

        printLines(buildCentrePaddedLines(triangle));
    }

    /**
     * A diamond 'top' is an isosceles triangle
     * A diamond 'bottom' is an isosceles triangle in reverse order
     */
    public static void drawDiamond(int n) {

        List<String> diamond = getIsoscelesTriangle(n);

        List<String> bottomLines = getIsoscelesTriangle(n - 1);
        Collections.reverse(bottomLines);
        diamond.addAll(bottomLines);

        printLines(buildCentrePaddedLines(diamond));
    }


    public static void drawDiamondWithName(int n) {


        List<String> diamond = getIsoscelesTriangle(n);

        List<String> bottomLines = getIsoscelesTriangle(n - 1);
        Collections.reverse(bottomLines);
        diamond.addAll(bottomLines);

        diamond = buildCentrePaddedLines(diamond);

        //replace the nth line with name (centre-padded)
        String centredName = buildCentrePaddedString(name, getLongestLineLength(diamond));

        if (n > 0) {
            if (diamond.isEmpty()) {
                diamond.add(name);
            } else {
                diamond.set((n - 1), centredName);
            }
        }

        printLines(diamond);
    }
}
