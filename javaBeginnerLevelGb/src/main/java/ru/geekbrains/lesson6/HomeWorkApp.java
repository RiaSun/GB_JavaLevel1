package ru.geekbrains.lesson6;


public class HomeWorkApp {

    public static void main(String[] args) {
        Animal dog1 = new Dog("Никель");
        Animal dog2 = new Dog("Кобальт");
        Animal cat1 = new Cat("Атом");
        Animal cat2 = new Cat("Кварк");

        Animal[] animals = {dog1, dog2, cat1, cat2};

        for (int i = 0; i < animals.length; i++) {
            Animal curAnimal = animals[i];
            curAnimal.run(150);
            curAnimal.swim(7);
        }

        int animalCount = 0;
        int dogCount = 0;
        int catCount = 0;

        for (int i = 0; i < animals.length; i++) {
            Animal curAnimal = animals[i];
            if (curAnimal instanceof Dog) {
                dogCount++;
            }
            if (curAnimal instanceof Cat) {
                catCount++;
            }
            if (curAnimal instanceof Animal) {
                animalCount++;
            }
        }
        System.out.println("Количество собак - " + dogCount);
        System.out.println("Количество кошек - " + catCount);
        System.out.println("Количество животных - " + animalCount);

    }


}