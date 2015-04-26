package com.epam.pashkov.task01.toys;

import com.epam.pashkov.task01.Toy;

/**
 * Created by Yaroslav_Pashkov on 4/22/2015.
 */
public class Ball extends Toy {
    public Ball(String type, double price, int count){
        this.setCount(count);
        this.setType(type);
        this.setPrice(price);
    }

    @Override
    public String toString() {
        return "Ball{" +
                "type: " + type +
                ", price: " + price +
                ", count: " + count +
                '}';
    }
}
