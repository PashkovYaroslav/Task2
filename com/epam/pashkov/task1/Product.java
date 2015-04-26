package com.epam.pashkov.task1;

/**
 * Created by Yaroslav_Pashkov on 4/22/2015.
 */
public abstract class Product {
    public static double allPrice;
    public static int countOfAllProducts;
    protected double price;
    protected String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length() > 0) {
            this.name = name;
        } else {
            throw new IllegalArgumentException("Incorrect name.");
        }
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price > 0) {
            this.price = price;
            allPrice += price;
        } else {
            throw new IllegalArgumentException("The price is less then 0.");
        }
    }

    public Product() {
        countOfAllProducts++;
    }

    public Product(double price, String name) {
        setPrice(price);
        setName(name);
        countOfAllProducts++;
    }

    public static double avgPrice() {
        double avg = allPrice / countOfAllProducts;
        return avg;
    }

    public abstract String toString();
}
