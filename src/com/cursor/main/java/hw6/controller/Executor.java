package com.cursor.main.java.hw6.controller;

import com.cursor.main.java.hw6.task1.ListNumbers;
import com.cursor.main.java.hw6.task2.Fruit;
import com.cursor.main.java.hw6.task3.CheckElements;
import com.cursor.main.java.hw6.task4.SortNumber;

public class Executor {

    public static void run() {
        ListNumbers listNumbers = new ListNumbers();
        listNumbers.addNumbers();
        listNumbers.removeNumbersDivisibleByThree();

        Fruit listFruit = new Fruit();
        listFruit.addFruit();
        listFruit.demonstrateReplacementValueInList();

        CheckElements list = new CheckElements();
        list.addList();
        list.demonstrateExistenceOfSharedElement();
        list.numListsCheck();

        SortNumber sortNumber = new SortNumber();
        sortNumber.addNumber();
        sortNumber.demonstrateSortNumber();
    }
}
