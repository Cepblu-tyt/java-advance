package org.sda.setHomework;

import java.util.*;

public class SetHomework {
    static Set<String> colorsSet = new HashSet<>();
     private static final Scanner SCANNER = new Scanner(System.in);
    public static void main(String[] args) {


        Set<String> colorsSet = new HashSet<>();
        menuOperation(colorsSet);
    }

    private static void menuOperation(Set<String> colorsSet) {
        int menuOption = getMenu();

        switch(menuOption) {
            case 1: // Add item
                addItem(colorsSet);
                menuOperation(colorsSet);
                break;
            case 2: // Delete item
                System.out.println("You can delete this colors:");
                System.out.println(colorsSet);
                deleteItem(colorsSet);
                menuOperation(colorsSet);
                break;
            case 3: // Display items
                System.out.println("Non-sorted and sorted colors are below:");
                displayItems(colorsSet);
                break;

            default:
                System.out.println("Incorrect option, choose the correct one!");
                menuOperation(colorsSet);
        }
    }

    private static int getMenu() {
        System.out.println("-------------------------------------");
        System.out.println(" What do you want do with colors?    ");
        System.out.println("-------------------------------------");

        List<String> menu = List.of("Add color", "Delete color", "Display colors");

        for(int i = 0; i < menu.size(); i++) {
            System.out.println(i + 1 + ". " + menu.get(i));
        }

        System.out.println("Choose a menu from above:");

        return SCANNER.nextInt();
    }

    private static void addItem(Set<String> colorsSet) {
        boolean isAdd = true;

        while (isAdd) {
            System.out.println("Enter color to add it to list ");
            String addColor = SCANNER.next();

            if (!colorsSet.contains(addColor)) {
                colorsSet.add(addColor);
                System.out.println("'" + addColor + "' added to the list. Do you want to add more colors? (true/false)");
            } else {
                System.out.println("The color already exists, do you want to add an other color? (true/false)");
            }
            isAdd = SCANNER.nextBoolean();
        }
    }

    private static void deleteItem(Set<String> colorsSet) {
        boolean isDelete = true;

        while(isDelete) {
            System.out.println("Enter color to be deleted from the list: ");
            String deleteItem = SCANNER.next();

            if (colorsSet.contains(deleteItem)) {
                colorsSet.remove(deleteItem);
                System.out.println("'"+ deleteItem +"' deleted from the list. Do you want to delete more colors?");
            } else {
                System.out.println("The color not exists, do you want to delete an other color?");
            }

            isDelete = SCANNER.nextBoolean();
        }
    }

    public static void displayItems(Set<String> colorsSet) {
        for (String color : colorsSet) {
            System.out.println(color);
        }

        TreeSet colorsTreeSet = new TreeSet(colorsSet); // Stored as Sorted
        System.out.println(colorsTreeSet);
    }
}

