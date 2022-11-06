package org.sda.setHomework;

import java.util.*;

public class SetHomework {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Set<String> colorsSet = new HashSet<>(); // Non-sorted, randomly stored
        boolean isAdd = true;

        while (isAdd) {
            System.out.println("Enter color to add it to list ");
            String addColor = scanner.next();

            if (!colorsSet.contains(addColor)) {
                colorsSet.add(addColor);
                System.out.println("'" + addColor + "' added to the list. Do you want to add more colors? (true/false)");
            } else {
                System.out.println("The color already exists, do you want to add an other color? (true/false)");
            }
            isAdd = scanner.nextBoolean();
        }
        for (String color : colorsSet) {
            System.out.println(color);
        }

        TreeSet colorsTreeSet = new TreeSet(colorsSet); // Stored as Sorted
        System.out.println(colorsTreeSet);
    }
}




