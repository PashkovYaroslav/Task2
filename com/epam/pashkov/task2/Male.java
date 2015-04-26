package com.epam.pashkov.task2;

/**
 * Created by Yaroslav_Pashkov on 4/23/2015.
 */
public class Male extends People {
    public Male(String firstName, String lastName, float growth, float weight) {
        super(true,firstName, lastName, growth, weight);
        System.out.println("Create male.");
    }
}
