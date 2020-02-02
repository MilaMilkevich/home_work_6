package com.cursor.main.java.hw6.task3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CheckElements {
    List<Integer> firstList = new ArrayList<>();
    List<Integer> secondList = new ArrayList<>();

    public void addList() {
        firstList.add(4);
        firstList.add(10);
        firstList.add(8);
        firstList.add(7);
        firstList.add(3);

        secondList.add(5);
        secondList.add(1);
        secondList.add(3);
        secondList.add(55);
        secondList.add(9);

        System.out.println("First list contains: " + firstList);
        System.out.println("Second list contains: " + secondList);
    }

    public void demonstrateExistenceOfSharedElement() {
        System.out.println(existenceOfSharedElement(firstList, secondList) ?
                "No similar elements found in lists" : "Lists have similar element");
    }

    private boolean existenceOfSharedElement(List<Integer> firstList, List<Integer> secondList) {
        return Collections.disjoint(firstList, secondList);
    }

    public void numListsCheck() {
        for (Integer integer : firstList) {
            for (Integer value : secondList) {
                if (integer.equals(value)) {
                    System.out.println("The similar numbers are:" + integer);
                }
            }
        }
    }
}






