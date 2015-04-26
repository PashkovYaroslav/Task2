package com.epam.pashkov.task0;

import java.util.Comparator;

/**
 * Created by Yaroslav on 24.04.2015.
 */
public class SortByLastName implements Comparator<Customer> {
    @Override
    public int compare(Customer o1, Customer o2) {
        return o1.getLastName().compareTo(o2.getLastName());
    }
}
