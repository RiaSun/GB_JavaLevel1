package ru.geekbrains.lesson7;

public class Plate {

    private int food;

    public Plate(int food) {

        this.food = food;
    }

    public boolean tryToDecreaseFood(int decreaseValue) {
        if (food < decreaseValue) {
            return false;
        }
        food -= decreaseValue;
        return true;
    }


    public void info() {
        System.out.println("Food in plate: [" + food + "]");
    }

    //toDo: добавить метод, с помощью окторого можно будет добавлять еду в тарелки
    public void addFood(int additionalFood) {
        food += additionalFood;
        System.out.println("Add food to plate: " + additionalFood);
    }


}
