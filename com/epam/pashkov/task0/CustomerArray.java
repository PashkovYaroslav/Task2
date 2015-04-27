package com.epam.pashkov.task0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by Yaroslav on 27.04.2015.
 */
public class CustomerArray {
    private Customer[] customerArray;
    private int length = 0;

    public Customer[] getCustomerArray() {
        return customerArray;
    }

    public void setCustomerArray(Customer[] customerArray) {
        this.customerArray = customerArray;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public CustomerArray(Customer[] customerArray) {
        this.customerArray = customerArray;
    }

    public CustomerArray(){}

    public void add(Customer c) {
        if (length == 0) {
            customerArray = new Customer[1];
            customerArray[0] = c;
        } else {
            Customer[] custTemp = new Customer[length + 1];
            System.arraycopy(customerArray, 0, custTemp, 0, customerArray.length);
            customerArray = custTemp;
            customerArray[length] = c;
        }
        length++;
    }

    public void sort() {
        Arrays.sort(customerArray, new Comparator<Customer>() {
            @Override
            public int compare(Customer o1, Customer o2) {
                return o1.getLastName().compareTo(o2.getLastName());
            }
        });
    }

    public Customer[] selectedCustomers(int start, int stop){
        Customer[] selectedCustomers = {};
        int len = 0;
        for(Customer c: customerArray){
            if(c.getCreditCardNumber()>=start && c.getCreditCardNumber()<=stop){
                if (len == 0) {
                    selectedCustomers = new Customer[1];
                    selectedCustomers[0] = c;
                } else {
                    Customer[] custTemp = new Customer[len + 1];
                    System.arraycopy(selectedCustomers, 0, custTemp, 0, selectedCustomers.length);
                    selectedCustomers = custTemp;
                    selectedCustomers[len] = c;
                }
                len++;
            }
        }
        return selectedCustomers;
    }

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();
        for(Customer c: customerArray){
            sb.append(c + "\n");
        }
        return sb.toString();
    }
}
