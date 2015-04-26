package com.epam.pashkov.task1;

/**
 * Created by Yaroslav on 22.04.2015.
 */
public class Monitor extends Product {
    private String typeOfMatrix;
    private String resolution;
    private double diagonal;
    private int reactionTime;

    public String getTypeOfMatrix() {
        return typeOfMatrix;
    }

    public void setTypeOfMatrix(String typeOfMatrix) {
        this.typeOfMatrix = typeOfMatrix;
    }

    public String getResolution() {
        return resolution;
    }

    public void setResolution(String resolution) {
        this.resolution = resolution;
    }

    public double getDiagonal() {
        return diagonal;
    }

    public void setDiagonal(double diagonal) {
        this.diagonal = diagonal;
    }

    public int getReactionTime() {
        return reactionTime;
    }

    public void setReactionTime(int reactionTime) {
        this.reactionTime = reactionTime;
    }

    public Monitor() {
        super();
    }

    public Monitor(String name, double price, String typeOfMatrix, String resolution, double diagonal, int reactionTime) {
        super(price, name);
        setTypeOfMatrix(typeOfMatrix);
        setResolution(resolution);
        setDiagonal(diagonal);
        setReactionTime(reactionTime);
    }

    @Override
    public String toString() {
        return "Monitor{" +
                "price: " + price +
                ", name: " + name +
                ", typeOfMatrix: " + typeOfMatrix +
                ", resolution: " + resolution +
                ", diagonal: " + diagonal +
                ", reactionTime: " + reactionTime +
                '}';
    }
}
