package ru.geekbrains.lesson7;

public class Cat {

    private String name;
    private int hunger;//0..100

    private boolean satiety;

    public Cat(String name, int hunger) {
        this.name = name;
        this.hunger = hunger;
        refreshSatiety();
    }

    public void eat(Plate plateFood) {

        tryToEat(plateFood);

        refreshSatiety();
    }

    private void tryToEat(Plate plateFood){
        int decreaseValue = hunger;
        boolean isDecreased = plateFood.tryToDecreaseFood(decreaseValue);
        if (isDecreased) {
            hunger -= decreaseValue;
            System.out.println("Cat [" +name + "]: hunger is decreased. Hunger = "+hunger);
        }else{
            System.out.println("Cat [" +name + "]: hunger is not decreased. Hunger = "+hunger);
        }
    }

    private boolean refreshSatiety() {
        if (hunger == 0) {
            satiety = true;
        } else {
            satiety = false;
        }

//        satiety = hunger == 0;

        return satiety;
    }

    public void info() {
        System.out.println("Cat [" +name + "]: hunger = "+ hunger+", satiety = "+satiety);
    }

    public boolean isSatisfied(){
        return satiety;
    }

//    toDo: в тареке не может быть оотрицательного количества еды -> коты не могу покушать, если в тарекле нет еды;
//    toDo: добавить коту поле сытости (получилосли ли покушать) -> boolean satiety\isHungry;
//    toDo: Если кот видит дно таректе, то не трогает еду -> не может быть на полоивну сыт;


}
