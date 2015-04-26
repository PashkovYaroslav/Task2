package com.epam.pashkov.task2;

/**
 * Created by Yaroslav_Pashkov on 4/23/2015.
 */
public class Main {
    public static void main(String[] args) {
        People m = new Male("John", "Travis", 185, 80);
        People w = new Female("Lucy", "Sullivan", 170, 55);

        System.out.println(People.compatibilityTest(m, w));
    }
}
