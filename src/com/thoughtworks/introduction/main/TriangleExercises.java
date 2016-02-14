package com.thoughtworks.introduction.main;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Elyse on 14/02/2016.
 */
public class TriangleExercises {


    public static void easiestExerciseEver() {
        System.out.print("*");
    }

    public static void drawHorizontalLine(int n) {
        String line = StringFormatter.buildRepeatingString("*", n);
        System.out.print(line);
    }

    public static void drawVerticalLine(int n) {
        List<String> lines = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            lines.add("*");
        }

        StringFormatter.printLines(lines);
    }

    public static void drawRightTriangle(int n) {

        List<String> lines = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            String line = StringFormatter.buildRepeatingString("*", i);
            lines.add(line);
        }

        StringFormatter.printLines(lines);
    }
}
