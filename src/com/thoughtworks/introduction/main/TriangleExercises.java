package com.thoughtworks.introduction.main;

/**
 * Created by Elyse on 14/02/2016.
 */
public class TriangleExercises {


    public static void easiestExerciseEver() {
        System.out.print("*");
    }

    public static void drawHorizontalLine(int n) {
        for (int i = 0; i < n; i++) {
            System.out.print("*");
        }
    }

    public static void drawVerticalLine(int n) {
        for (int line = 1; line <= n; line++) {
            System.out.print("*");
            //no newline at the end of output.
            if (line != n) {
                System.out.println();
            }
        }
    }

    public static void drawRightTriangle(int n) {
        for (int line = 1; line <= n; line++) {
            drawHorizontalLine(line);
            //no newline at the end of output.
            if (line != n) {
                System.out.println();
            }
        }
    }
}
