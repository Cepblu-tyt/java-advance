package org.sda.setHomework;

import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Set;

public class SetHomework {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Set<String> colorsSet = new HashSet<>(); // Non-sorted, randomly stored

        colorsSet.add("Blue");    // 525632
        colorsSet.add("Black");  // 152635
        colorsSet.add("White");
        colorsSet.add("Red");
        colorsSet.add("Green");
        colorsSet.add("Orange");
        colorsSet.add("Gray");
        colorsSet.add("Yellow");
        System.out.println(colorsSet);

        private static void displayAddedColors () {
            if (colorsSet.contains(scanner.hasNextLine())) {
                int i = scanner.nextInt();
                System.out.println("color -> " + i);
            } else {
                throw new InputMismatchException("This is not a color! Please input color of the list!");
            }

        }
    }
}

