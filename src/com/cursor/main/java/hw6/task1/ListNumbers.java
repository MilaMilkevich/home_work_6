package com.cursor.main.java.hw6.task1;

import java.util.ArrayList;
import java.util.List;

public class ListNumbers {

    List<Integer> listOfIntegers = new ArrayList<>();

    public void addNumbers() {
        listOfIntegers.add(3);
        listOfIntegers.add(9);
        listOfIntegers.add(11);
        listOfIntegers.add(18);
        listOfIntegers.add(20);
        listOfIntegers.add(22);

        System.out.println("List before removing: " + listOfIntegers);
    }

    public void removeNumbersDivisibleByThree() {
        listOfIntegers.removeIf(integer -> integer % 3 == 0);
        System.out.println("List after removing elements that are divisible by 3: " + listOfIntegers);
    }
}
