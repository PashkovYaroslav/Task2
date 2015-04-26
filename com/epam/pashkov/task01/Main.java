package com.epam.pashkov.task01;

import com.epam.pashkov.task01.toys.*;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by Yaroslav_Pashkov on 4/22/2015.
 */
public class Main {
    public static void main(String[] args) {
        ArrayList<Toy> toys = new ArrayList<Toy>();
        toys.add(new Ball("Ball",50, 1));
        toys.add(new Doll("Doll",75, 5));
        toys.add(new Car("Car",1000,1,CarSizes.MEDIUM));
        toys.add(new Bricks("Bricks",50, 3));
        toys.add(new Ball("Ball", 75, 3));

        // Create a new room and fill it with toys from the catalog with a limited amount of money
        GameRoom gr = new GameRoom(toys,8000);
        System.out.println(gr);

        // Sort the toys in room by price
        Collections.sort(gr.getToys());
        System.out.println(gr);

        // The price of toys in range [start, stop)
        System.out.println("Price in range [0,100)");
        for(Toy t : gr.findToys(0,100)) {
            System.out.println(t);
        }
    }
}
