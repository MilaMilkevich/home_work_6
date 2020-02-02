package com.cursor.main.java.hw6.task2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Fruit {
    List<String> listOfFruit = new ArrayList<>();

    public void addFruit() {
        listOfFruit.add("Melon");
        listOfFruit.add("Apricot");
        listOfFruit.add("Plum");
        listOfFruit.add("Orange");
        listOfFruit.add("Apple");

        System.out.println("List fruit before replacement: " + listOfFruit);
    }

    public void demonstrateReplacementValueInList() {
        replaceFruit(listOfFruit, "Orange", "Grapefruit");
        System.out.println("List fruit after replacement: " + listOfFruit);
    }

    public void replaceFruit(List<String> list, String oldValue, String newValue) {
        Collections.replaceAll(list, oldValue, newValue);
        if (!listOfFruit.contains(newValue)) {
            System.out.println("Fruit is not present in list, so no replacement happens in the list.");
        }
    }
}
