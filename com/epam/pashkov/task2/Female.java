package com.epam.pashkov.task2;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by Yaroslav_Pashkov on 4/23/2015.
 */
public class Female extends People {
    public Female(String firstName, String lastName, float growth, float weight) {
        super(false,firstName, lastName, growth, weight);
        System.out.println("Create female.");
    }

    public People birth(People maleParent){
        People p;
        Scanner sc;

        if(new Random().nextDouble()>=0.5)
        {
            sc = new Scanner(System.in);
            System.out.println("Enter the name of baby (male):");
            String name = sc.nextLine();
            sc.close();
            System.out.println("Create baby (male).");
            p = new Male(name,maleParent.getLastName(),(float)(maleParent.getGrowth()+0.1*(this.getGrowth()-maleParent.getGrowth())), (float)(maleParent.getWeight()+0.1*(this.getWeight()-maleParent.getWeight())));
            return p;
        }

        sc = new Scanner(System.in);
        System.out.println("Enter the name of baby (female):");
        String name = sc.nextLine();
        sc.close();
        System.out.println("Create baby (female).");
        p = new Female(name,maleParent.getLastName(),(float)(this.getGrowth()+0.1*(maleParent.getGrowth()-this.getGrowth())), (float)(this.getWeight()+0.1*(maleParent.getWeight()-this.getWeight())));
        return p;
    }
}
