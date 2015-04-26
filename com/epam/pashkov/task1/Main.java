package com.epam.pashkov.task1;

/**
 * Created by Yaroslav on 22.04.2015.
 */
public class Main {
    public static void main(String[] args) {
        ProductArray pa = new ProductArray();
        pa.add(new Monitor("LG",10000,"IPS","1920x1080",23.5, 5));
        pa.add(new Monitor("Samsung",5000,"IPS","1920x1080",23.5, 3));
        pa.add(new Monitor("Asus",7500,"IPS","1920x1080",23.5, 7));
        pa.add(new Monitor("Acer",7000,"IPS","1920x1080",23.5, 5));
        pa.add(new Monitor("Dell",10000,"IPS","1920x1080",23.5, 3));

        pa.add(new Motherboard("ASUS ROG1", 5000, "Intel X99", "DDR3", "8 x SATA 6Gb/s port(s)", "Gigabit LAN Controller", "3.1"));
        pa.add(new Motherboard("ASUS ROG2", 4000, "Intel X99", "DDR3", "8 x SATA 6Gb/s port(s)", "Gigabit LAN Controller", "3.1"));
        pa.add(new Motherboard("ASUS ROG3", 4500, "Intel X99", "DDR3", "8 x SATA 6Gb/s port(s)", "Gigabit LAN Controller", "3.1"));
        pa.add(new Motherboard("ASUS ROG4", 6000, "Intel X99", "DDR3", "8 x SATA 6Gb/s port(s)", "Gigabit LAN Controller", "3.1"));

        // Original array
        System.out.println("Original array:");
        System.out.println(pa.toString());

        // Array sorted by price
        pa.sort();
        System.out.println("Array sorted by price:");
        System.out.println(pa.toString());
    }
}
