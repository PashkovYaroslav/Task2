package com.epam.pashkov.task2;

import java.util.Random;

/**
 * Created by Yaroslav_Pashkov on 4/23/2015.
 */
public class People {
    protected boolean gender;
    protected String firstName;
    protected String lastName;
    protected float growth;
    protected float weight;

    public People(){

    }

    public People(boolean gender, String firstName, String lastName, float growth, float weight) {
        setGender(gender);
        setFirstName(firstName);
        setLastName(lastName);
        setGrowth(growth);
        setWeight(weight);
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public float getGrowth() {
        return growth;
    }

    public void setGrowth(float growth) {
        if(growth>0){
            this.growth = growth;
        }
        else{
            throw new IllegalArgumentException("Growth is less than 0");
        }
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        if(weight>0){
            this.weight = weight;
        }
        else{
            throw new IllegalArgumentException("Weight is less than 0");
        }
    }

    public boolean speak(People people) {
        if (!this.gender && !people.gender) {
            return true;
        }

        if (!this.gender && people.gender) {
            return true;
        }

        if (this.gender && !people.gender) {
            return true;
        }

        if (this.gender && people.gender) {
            Random rnd = new Random();
            if (rnd.nextDouble() >= 0.5) {
                System.out.println("Speak: >=50%.");
                return true;
            }
        }
        return false;
    }

    public boolean tolerate(People people) {
        Random rnd;
        if (!this.gender && !people.gender) {
            rnd = new Random();
            if (rnd.nextDouble() < 0.05) {
                System.out.println("Tolerate < 5%.");
                return true;
            }
        }

        if (!this.gender && people.gender) {
            rnd = new Random();
            if (rnd.nextDouble() < 0.7) {
                System.out.println("Tolerate < 70%.");
                return true;
            }
        }

        if (this.gender && !people.gender) {
            rnd = new Random();
            if (rnd.nextDouble() < 0.7) {
                System.out.println("Tolerate < 70%.");
                return true;
            }
        }

        if (this.gender && people.gender) {
            rnd = new Random();
            if (rnd.nextDouble() < 0.056) {
                System.out.println("Tolerate < 5.6%.");
                return true;
            }
        }
        return false;
    }

    // Spend time together
    public boolean together(People people) {
        float growthMax;
        float growthMin;
        if (this.growth > people.growth) {
            growthMax = this.growth;
            growthMin = people.growth;
        } else {
            growthMax = people.growth;
            growthMin = this.growth;
        }
        if (1 - growthMin / growthMax > 0.1) {
            System.out.println("The difference of growth more 10%.");
            Random rnd = new Random();
            if (rnd.nextDouble() < 0.85) {
                return true;
            }
        } else {
            System.out.println("The difference of growth less of equal 10%.");
            Random rnd = new Random();
            if (rnd.nextDouble() < 0.95) {
                return true;
            }
        }

        return false;
    }

    public People relationship(People people) {
        People p = new People();

        boolean speak = speak(people);
        boolean tolerate = tolerate(people);
        boolean together = together(people);
        System.out.println("Speak: " + speak + ", tolerate: " + tolerate + ", together: " + together);
        if (speak && tolerate && together) {
            if (this.gender == people.gender) {
                return p;
            } else {
                if (this.gender == false) {
                    Female f = (Female) this;
                    p = f.birth(people);
                } else {
                    Female f = (Female) people;
                    p = f.birth(this);
                }
            }
        }
        return p;

    }

    // The start point of algorithm
    public static People compatibilityTest(People p1, People p2) {
        return p1.relationship(p2);
    }

    @Override
    public String toString() {
        String g = this.gender ? "Male" : "Female";

        return (this.firstName != null) ? "People{" +
                "Gender: " + g +
                ", First Name: " + firstName +
                ", Last Name: " + lastName +
                ", Growth: " + growth +
                ", Weight: " + weight +
                '}' : "Nothing happend.";
    }
}