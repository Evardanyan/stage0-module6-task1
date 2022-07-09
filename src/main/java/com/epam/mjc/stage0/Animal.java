package com.epam.mjc.stage0;

public class Animal {
    private String color;
    private int numberOfPaws;
    private boolean hasFur;

    public Animal(String color, int numberOfPaws, boolean hasFur) {
        this.color = color;
        this.numberOfPaws = numberOfPaws;
        this.hasFur = hasFur;
    }

    String getDescription() {
        String fur = hasFur ? " a fur." : " no fur.";
        String paws = numberOfPaws == 1 ? numberOfPaws + " paw " : numberOfPaws + " paws ";
        return "This animal is mostly " + color + ". It has " + paws + "and" + fur;
    }
}
