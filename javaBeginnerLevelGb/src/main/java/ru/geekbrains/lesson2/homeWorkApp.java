package ru.geekbrains.lesson2;


    public class homeWorkApp {

        public static void main(String[] args) {
// задание1
            isSumBetween10And20(5, 8);

// задание 2
            printPositiveOrNegative(-3);

//  задение 3
            isPositiveOrNegative(5);

//задание 4
            countStrings("Help", 5);


        }


        public static boolean isSumBetween10And20(int a, int b) {

            boolean result;

//        var 1
            if (a + b >= 10 && a + b <= 20) {
                result = true;
            } else {
                result = false;
            }
            System.out.println(result);
            return result;

//        var 2
//        int sum = a+b;
//        result = (sum >= 10 && sum <= 20);
        }


        public static void printPositiveOrNegative(int i) {

            if (i >= 0) {
                System.out.println("Положительное");
            } else {
                System.out.println("Отрицательное");

            }

        }

        public static boolean isPositiveOrNegative(int i) {
            boolean result;

            if (i < 0) {
                result = true;
            } else {
                result = false;
            }
            System.out.println(result);
            return result;
        }

        public static void countStrings(String text, int maxCount) {

            for (int i = 1; i <= maxCount; i++) {
                System.out.println(i + " " + text);
            }


        }


    }

