package com.epam.mjc.stage0;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("white", 4, false);
        Bird bird = new Bird();
        Dog dog = new Dog();
        System.out.println(animal.getDescription());
        System.out.println(bird.getDescription());
        System.out.println(dog.getDescription());
    }
}
