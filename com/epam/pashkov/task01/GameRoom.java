package com.epam.pashkov.task01;

import java.util.ArrayList;

/**
 * Created by Yaroslav_Pashkov on 4/22/2015.
 */
public class GameRoom {
    private ArrayList<Toy> toys;
    private double count;

    public ArrayList<Toy> getToys() {
        return toys;
    }

    public void setToys(ArrayList<Toy> toys) {
        this.toys = toys;
    }

    public double getCount() {
        return count;
    }

    public void setCount(double count) {
        if(count>0) {
            this.count = count;
        }
        else{
            throw new IllegalArgumentException("Incorrect count.");
        }
    }

    public GameRoom(ArrayList<Toy> t, double count) {
        this.toys = new ArrayList<Toy>();
        setCount(count);
        double currentCost = 0;
        for(int i = 0; i<t.size(); i++){
            if(count>=currentCost+t.get(i).getCount()*t.get(i).getPrice()){
                toys.add(t.get(i));
                currentCost+=t.get(i).getCount()*t.get(i).getPrice();
            }
        }
        this.count = count;
    }

    // Select all toys by price
    public ArrayList<Toy> findToys(double startPrice, double stopPrice){
        ArrayList<Toy> temp = new ArrayList<Toy>();
        for(int i = 0; i<toys.size(); i++){
            if(toys.get(i).getPrice()>=startPrice && toys.get(i).getPrice()<stopPrice){
                temp.add(toys.get(i));
            }
        }
        return temp;
    }

    // Select all toys by price and count
    public ArrayList<Toy> findToys(double startPrice, double stopPrice, int startCount, int stopCount){
        ArrayList<Toy> temp = new ArrayList<Toy>();
        for(int i = 0; i<toys.size(); i++){
            if(toys.get(i).getPrice()>=startPrice && toys.get(i).getPrice()<stopPrice &&
                    toys.get(i).getCount()>=startCount && toys.get(i).getCount()<stopCount){
                temp.add(toys.get(i));
            }
        }
        return temp;
    }

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer("GameRoom's toys: ");
        for(Toy t : toys){
            sb.append(t+"\n");
        }
        return sb.toString();
    }
}
