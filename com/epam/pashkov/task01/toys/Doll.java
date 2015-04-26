package com.epam.pashkov.task01.toys;
import com.epam.pashkov.task01.Toy;

/**
 * Created by Yaroslav_Pashkov on 4/22/2015.
 */
public class Doll extends Toy {
    public Doll(String type, double price, int count){
        this.setCount(count);
        this.setType(type);
        this.setPrice(price);
    }

    @Override
    public String toString() {
        return "Doll{" +
                "type: " + type +
                ", price: " + price +
                ", count: " + count +
                '}';
    }
}
