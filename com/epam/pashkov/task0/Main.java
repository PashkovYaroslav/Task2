package com.epam.pashkov.task0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

/**
 * Created by Yaroslav_Pashkov on 4/20/2015.
 */
public class Main {
    public static void main(String[] args) {
        CustomerArray ca = new CustomerArray();
        ca.add(new Customer(1,"Pavlov", "Sergey", "Alexandrovich","Address0",100,121));
        ca.add(new Customer(2,"Dmitriev", "Ivan", "Yakovlevich","Address1",101,122));
        ca.add(new Customer(3,"Goncharenko", "Stepan", "Alekseevich","Address2",102,123));
        ca.add(new Customer(4, "Kotsuk", "Miroslav", "Sviatoslavovich", "Address3", 103, 124));
        ca.add(new Customer(5, "Akhmatova", "Alla", "Stepanovna", "Address4", 104, 125));

        System.out.println("Original array:");
        System.out.println(ca.toString());

        System.out.println("Filtered array:");
        for(Customer c : ca.selectedCustomers(100, 102)){
            System.out.println(c.toString());
        }
    }
}
