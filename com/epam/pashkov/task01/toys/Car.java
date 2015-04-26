package com.epam.pashkov.task01.toys;

import com.epam.pashkov.task01.Toy;

/**
 * Created by Yaroslav_Pashkov on 4/22/2015.
 */
public class Car extends Toy {
    private CarSizes size;

    public CarSizes getSize() {
        return size;
    }

    public void setSize(CarSizes size) {
        this.size = size;
    }

    public Car(String type, double price, int count, CarSizes size){
        this.setCount(count);
        this.setType(type);
        this.setPrice(price);
        this.size = size;
    }

    @Override
    public String toString() {
        return "Car{" +
                "type: " + type +
                ", size: " + size +
                ", price: " + price +
                ", count: " + count +
                '}';
    }
}
