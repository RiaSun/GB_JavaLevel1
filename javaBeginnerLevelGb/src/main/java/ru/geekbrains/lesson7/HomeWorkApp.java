package ru.geekbrains.lesson7;


public class HomeWorkApp {

    public static void main(String[] args) {
        Cat cat1 = new Cat("Atom", 100);
        Cat cat2 = new Cat("Quark", 30);
        Cat cat3 = new Cat("Nickel", 75);
        Cat cat4 = new Cat("Cobalt", 15);
        Cat cat5 = new Cat("Mercury", 80);
        Plate plate1 = new Plate(200);


//       toDo: с помощью массива покормить котов (сделать так, чтобы коты покушали)
        Cat[] cats = new Cat[5];
        cats[0] = cat1;
        cats[1] = cat2;
        cats[2] = cat3;
        cats[3] = cat4;
        cats[4] = cat5;

        for (int i = 0; i < cats.length; i++) {
            cats[i].info();
        }
        plate1.info();


        boolean allCatsAreSatieted = false;


        while(!allCatsAreSatieted) {
            System.out.println("");
//            повторять кормление до тех пор, пока все коты не будут накормлены
            for (int j = 0; j < cats.length; j++) {
                cats[j].eat(plate1);
            }
            plate1.info();
            plate1.addFood(100);
            plate1.info();

            allCatsAreSatieted = checkAllCatsAreSatieted(cats);
        }
    }

    private static boolean checkAllCatsAreSatieted(Cat[] cats){
//        проверяет, есть ли не накормленные коты
        for (int i=0; i< cats.length; i++){
            if (!cats[i].isSatisfied()){
                return false;
            }
        }

        System.out.println("All Cats Are Satieted!");
        return true;
    }
}