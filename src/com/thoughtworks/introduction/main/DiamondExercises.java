package com.thoughtworks.introduction.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by Elyse on 14/02/2016.
 */
public class DiamondExercises {

    private static String name = "Elyse";


    public static List<String> getIsoscelesTriangle(int n) {

        ArrayList<String> lines = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            int lineLength = i * 2 - 1;
            lines.add(StringFormatter.buildRepeatingString("*", lineLength));
        }

        return (lines);
    }

    public static void drawIsoscelesTriangle(int n) {

        List<String> triangle = getIsoscelesTriangle(n);

        StringFormatter.printLines(StringFormatter.buildCentrePaddedLines(triangle));
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

        StringFormatter.printLines(StringFormatter.buildCentrePaddedLines(diamond));
    }


    public static void drawDiamondWithName(int n) {

        List<String> diamond = getIsoscelesTriangle(n);

        List<String> bottomLines = getIsoscelesTriangle(n - 1);
        Collections.reverse(bottomLines);
        diamond.addAll(bottomLines);

        diamond = StringFormatter.buildCentrePaddedLines(diamond);

        //replace the nth line with name (centre-padded)
        String centredName = StringFormatter.buildCentrePaddedString(name, StringFormatter.getLongestLineLength(diamond));

        if (n > 0) {
            if (diamond.isEmpty()) {
                diamond.add(name);
            } else {
                diamond.set((n - 1), centredName);
            }
        }

        StringFormatter.printLines(diamond);
    }
}
