package com.thoughtworks.introduction.main;

import java.util.List;

/**
 * Created by Elyse on 14/02/2016.
 */
public class StringFormatter {

    public static String buildRepeatingString(String s, int n) {

        String finalString = "";
        for (int i = 1; i <= n; i++) {
            finalString += s;
        }
        return finalString;
    }

    /**
     * find the length of the longest String in a List
     */
    public static int getLongestLineLength(List<String> lines) {
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
    public static String buildCentrePaddedString(String content, int lineLength) {
        int sidePaddingLength = (lineLength - content.length()) / 2;

        String sidePadding = buildRepeatingString(" ", sidePaddingLength);

        String finalString = sidePadding + content + sidePadding;

        //handle odd lengths
        if (lineLength > 1 && lineLength % 2 == 0) {
            finalString += " ";
        }

        return finalString;
    }

    public static List<String> buildCentrePaddedLines(List<String> lines) {
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
    public static void printLines(List<String> lines) {

        if (lines.size() > 0) {

            System.out.print(lines.get(0));

            for (int i = 1; i < lines.size(); i++) {
                System.out.println();
                System.out.print(lines.get(i));
            }
        }
    }

}
