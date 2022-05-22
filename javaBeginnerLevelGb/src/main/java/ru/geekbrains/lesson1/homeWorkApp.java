package ru.geekbrains.lesson1;

public class homeWorkApp {


    public static void main(String[] args) {
        System.out.println("Hello, World!");
        printThreeWords ();
        checkSumSign ();
        printColor ();
        compareNumbers ();

    }


        public static void checkSumSign () {
            int a;
            int b;
            a = -15;
            b = 10;
            int sum = a + b;
            if (sum >= 0) {
                System.out.println("Сумма положительная");
            } else {
                System.out.println("Сумма отрицательная");
            }
        }

        public static void printColor () {
            int value;
            value = 102;
            if (value <= 0) {
                System.out.println("Красный");
            }
            if (value > 0 && value <= 100) {
                System.out.println("Жёлтый");
            }
            if (value > 100) {
                System.out.println("Зелёный");
            }
        }

        public static void compareNumbers () {
            int a;
            int b;
            a = 7;
            b = 9;
            if (a >= b) {
                System.out.println("a>=b");
            } else {
                System.out.println("a<b");
            }
        }

        public static void printThreeWords () {
            System.out.println("Orange");
            System.out.println("Banana");
            System.out.println("Apple");

        }




}
