/**
 * @author Aaron Carpenter - acarpenter5@dmacc.edu
 * CIS175 - Fall 2023
 * Sep 16, 2023
 */


package model;

import java.io.PrintWriter;
import java.util.ArrayList;

public class formatSandwich {
    public static void printSandwich(String sandwichContents, PrintWriter writer) {
        String[] contentsArray = sandwichContents.split(",");
        ArrayList<String> sandwichItems = new ArrayList<>();

        sandwichItems.add("Bread");
        for (String item : contentsArray) {
            sandwichItems.add(item.trim());
        }
        sandwichItems.add("Bread");

        for (String item : sandwichItems) {
            writer.println(item);
        }
    }
}
