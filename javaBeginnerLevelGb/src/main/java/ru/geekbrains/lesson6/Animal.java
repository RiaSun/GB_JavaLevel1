package ru.geekbrains.lesson6;

public abstract class Animal {

    protected String species;
    protected String name;

    public Animal(String species, String name) {
        this.species = species;
        this.name = name;
    }

    abstract void run(int obstacleLength);

    abstract void swim(int obstacleLength);


}
