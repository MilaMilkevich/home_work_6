package com.cursor.main.java.hw6.task4;

import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

public class SortNumber {
    Set<Integer> numbers = new TreeSet<>(Collections.reverseOrder());

    public void addNumber() {
        numbers.add(3);
        numbers.add(87);
        numbers.add(-20);
        numbers.add(5);
    }

    public void demonstrateSortNumber() {
        System.out.println("Sorted numbers: " + numbers);
    }
}
