package com.epam.pashkov.task01;

import java.util.Collections;

/**
 * Created by Yaroslav_Pashkov on 4/22/2015.
 */
public abstract class Toy implements Comparable<Toy> {
    protected int count;
    protected String type;
    protected double price;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        if(count>0) {
            this.count = count;
        }
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public int compareTo(Toy o) {
        return new Double(this.getPrice()).compareTo(new Double(o.getPrice()));
    }

    @Override
    public abstract String toString();
}
