package com.epam.pashkov.task01.toys;

/**
 * Created by Yaroslav_Pashkov on 4/22/2015.
 */
public enum CarSizes {
    SMALL, MEDIUM, BIG;

    public String toString(){
        if(this == SMALL)
        {
            return "small";
        }
        if(this == MEDIUM)
        {
            return "medium";
        }
        if(this == BIG)
        {
            return "big";
        }
        return null;
    }
}
