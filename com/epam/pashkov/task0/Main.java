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
        Customer[] customers = new Customer[5];
        customers[0] = new Customer(1,"Pavlov", "Sergey", "Alexandrovich","Address0",100,121);
        customers[1] = new Customer(2,"Dmitriev", "Ivan", "Yakovlevich","Address1",101,122);
        customers[2] = new Customer(3,"Goncharenko", "Stepan", "Alekseevich","Address2",102,123);
        customers[3] = new Customer(4, "Kotsuk", "Miroslav", "Sviatoslavovich", "Address3", 103, 124);
        customers[4] = new Customer(5, "Akhmatova", "Alla", "Stepanovna", "Address4", 104, 125);

        System.out.println("Original list:");
        for(Customer c : customers){
            System.out.println(c);
        }

        System.out.println("List sorted by last name:");
        Arrays.sort(customers, new SortByLastName());
        for(Customer c : customers){
            System.out.println(c);
        }

        System.out.println("Credit card number in range [100,102]:");
        for(Customer c: Customer.selectedCustomers(customers, 100, 102)){
            System.out.println(c);
        }
    }
}
