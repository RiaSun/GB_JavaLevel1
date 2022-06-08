package ru.geekbrains.lesson6;

public class Cat extends Animal {


    public Cat(String name) {
        super("Кот", name);
    }

    @Override
    void run(int obstacleLength) {
        if (obstacleLength > 200) {
            System.out.println("Кот не может пробежать больше 200м");
        } else {
            System.out.println(this.species + " " + this.name + " пробежал " + obstacleLength + "м");
        }
    }

    @Override
    void swim(int obstacleLength) {
        System.out.println("Кошка не может плавать");

    }
}
