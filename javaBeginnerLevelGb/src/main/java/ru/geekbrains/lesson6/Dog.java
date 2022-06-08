package ru.geekbrains.lesson6;

public class Dog extends Animal {


    public Dog(String name) {
        super("Собака", name);
    }

    @Override
    void run(int obstacleLength) {
        if (obstacleLength > 500) {
            System.out.println("Собака не может пробежать больше 500м");
        } else {
            System.out.println(this.species + " " + this.name + " пробежал " + obstacleLength + "м");
        }
    }

    @Override
    void swim(int obstacleLength) {
        if (obstacleLength > 10) {
            System.out.println("Собака не может проплыть больше 10м");
        } else {
            System.out.println(this.species + " " + this.name + " пропроплыл " + obstacleLength + "м");
        }
    }
}
