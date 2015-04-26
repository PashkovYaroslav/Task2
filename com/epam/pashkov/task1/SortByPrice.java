package com.epam.pashkov.task1;

import java.util.Comparator;

/**
 * Created by Yaroslav on 22.04.2015.
 */
public class SortByPrice implements Comparator<Product> {
    public int compare(Product p1, Product p2) {
        return new Double(p1.getPrice()).compareTo(new Double(p2.getPrice()));
    }
}
