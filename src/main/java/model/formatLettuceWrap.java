
/**
 * @author Aaron Carpenter - acarpenter5@dmacc.edu
 * CIS175 - Fall 2023
 * Sep 16, 2023
 */
package model;

import java.io.PrintWriter;
import java.util.ArrayList;

public class formatLettuceWrap {
    public static void printLettuceWrap(String lettuceWrapContents, PrintWriter writer) {
        String[] contentsArray = lettuceWrapContents.split(",");
        ArrayList<String> lettuceWrapItems = new ArrayList<>();

        lettuceWrapItems.add("Lettuce");
        for (String item : contentsArray) {
            lettuceWrapItems.add(item.trim());
        }
        lettuceWrapItems.add("Lettuce");

        for (String item : lettuceWrapItems) {
            writer.println(item);
        }
    }
}

