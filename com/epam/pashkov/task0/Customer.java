package com.epam.pashkov.task0;

import java.util.ArrayList;

/**
 * Created by Yaroslav_Pashkov on 4/21/2015.
 */
public class Customer {
    private int id;
    private String lastName;
    private String firstName;
    private String patronymic;
    private String address;
    private int creditCardNumber;
    private int bankAccount;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        if(id>0){
        this.id = id;
        }
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        if(lastName.length()>0) {
            this.lastName = lastName;
        }
        else{
            throw new IllegalArgumentException("Incorrect last name.");
        }
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        if(firstName.length()>0) {
            this.firstName = firstName;
        }
        else{
            throw new IllegalArgumentException("Incorrect first name.");
        }
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        if(patronymic.length()>0) {
            this.patronymic = patronymic;
        }
        else{
            throw new IllegalArgumentException("Incorrect patronymic.");
        }
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        if(address.length()>0) {
            this.address = address;
        }
        else{
            throw new IllegalArgumentException("Incorrect address.");
        }
    }

    public int getCreditCardNumber() {
        return creditCardNumber;
    }

    public void setCreditCardNumber(int creditCardNumber) {
        if(creditCardNumber>0){
        this.creditCardNumber = creditCardNumber;
        }
        else{
            throw new IllegalArgumentException("Incorrect credit card number.");
        }
    }

    public int getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(int bankAccount) {
        if(bankAccount >0) {
            this.bankAccount = bankAccount;
        }
        else{
            throw new IllegalArgumentException("Incorrect bank account.");
        }
    }

    public Customer(){
    }

    public Customer(int id, String lastName, String firstName, String patronymic, String address, int creditCardNumber, int bankAccount) {
        setId(id);
        setLastName(lastName);
        setFirstName(firstName);
        setPatronymic(patronymic);
        setAddress(address);
        setCreditCardNumber(creditCardNumber);
        setBankAccount(bankAccount);
    }

    // Return the collection of cutomers in range of credit card number [start, stop]
    public static ArrayList<Customer> selectedCustomers(Customer[] customers,int start, int stop){
        ArrayList<Customer> selected = new ArrayList<Customer>();
        for(Customer c: customers){
            if(c.getCreditCardNumber()>=start && c.getCreditCardNumber()<=stop) selected.add(c);
        }
        return selected;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "ID: " + id +
                ", Last Name: " + lastName +
                ", First Name: " + firstName +
                ", Patronymic: " + patronymic +
                ", Address: " + address +
                ", Credit Card Number: " + creditCardNumber +
                ", Bank Account: " + bankAccount +
                '}';
    }
}
