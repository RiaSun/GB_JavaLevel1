package ru.geekbrains.lesson3;

import java.util.Random;
import java.util.Scanner;

public class homeWorkApp {

    public static void main(String[] args) {


        //task 1
        System.out.println("task 1");
        int[] elements = new int[10];

        //внесение чисел в массив с помощью Random
        Random random = new Random();
        for (int i = 0; i < elements.length; i++) {
            elements[i] = random.nextInt(2);
        }

        //вывод рузьтата #1.1 (можно вынести в отдельный метод)
        for (int i = 0; i < elements.length; i++) {
            System.out.print(elements[i] + " ");
        }
        System.out.print("\n");

        //заменить 0 на 1, 1 на 0
        for (int i = 0; i < elements.length; i++) {
            if (elements[i] < 1) {
                elements[i] += 1;
            } else if (elements[i] > 0) {
                elements[i] -= 1;
            }
        }

        //вывод рузьтата #1.2 (можно вынести в отдельный метод)
        for (int i = 0; i < elements.length; i++) {
            System.out.print(elements[i] + " ");
        }
        System.out.print("\n");

        //v2
//        for(int i = 0; i < elements.length; i++){
//            elements[i] = elements[i] == 0 ? 1 : 0;
//        }
        //v3
//        for(int i = 0; i < elements.length; i++){
//        elements[i] = 1 - elements[i];
//        }


        //task 2
        System.out.println("task 2");
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
            System.out.println("arr[" + i + "] = " + arr[i]);
        }

        //v2
//        int[] arr = new int[100];
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = i + 1;
//        }
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print("arr[" + i + "] = " + arr[i] + "  ");
//            if (i > 0 && i % 10 == 0) {
//                System.out.print("\n");
//            }
//        }
//        System.out.print("\n");

        //task 3
        System.out.println("task 3");
        int[] less6Double = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int j = 0; j < less6Double.length; j++) {
            if (less6Double[j] < 6) {
                less6Double[j] *= 2;
            }
            System.out.print(less6Double[j] + " ");
        }
        System.out.print("\n");

        //task 4
        System.out.println("task 4");
        int n = 5;
        int[][] square = new int[n][n];

        // 1 diagonal
        for (int i = 0; i < square.length; i++) {
            square[i][i] = 1;
        }
        // 2 diagonal
        for (int i = 0; i < square.length; i++) {
            int j = square.length - i - 1;
            square[i][j] = 1;
        }
        // вывод
        for (int i = 0; i < square.length; i++) {
            for (int j = 0; j < square[i].length; j++) {
                System.out.print(square[i][j] + "  ");
            }
            System.out.println();
        }

        // вариант с полным перебором по обоим массивам

//        for (int i = 0; i < square.length; i++) {
//            for (int j = 0; j < square[i].length; j++) {
//                if (i==j){
//                    square[i][j] = 1;
//                }
//            }
//        }
//        for (int i = 0; i < square.length; i++) {
//            for (int j = 0; j < square[i].length; j++) {
//                if (i+j== square.length-1){
//                    square[i][j] = 1;
//                }
//            }
//        }


//   task Field from lesson_3
//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//        int m = scanner.nextInt();
//
//        int [][] square = new int[n][m];
//        for (int i = 0; i < square[0].length; i++) {
//            square [0][i] = 1;
//        }
//        for (int i = 0; i < square[0].length; i++) {
//            square [square.length-1][i] = 1;
//        }
//        for (int i = 0; i < square.length; i++) {
//            square [i][0] = 1;
//        }
//        for (int i = 0; i < square.length; i++) {
//            square [i][square[i].length-1] = 1;
//        }
//        for (int i = 0; i < square.length; i++){
//            for (int j = 0; j< square[i].length; j++){
//                System.out.print(square[i][j] + " ");
//            }
//            System.out.println();
//        }

        // task 5
        int len = 5;
        int initialValue = 3;
        initArr(len, initialValue);


        // task 6
        System.out.println("task 6");

        int[] minMax = new int[10];

        //внесение чисел в массив с помощью Random
        for (int i = 0; i < minMax.length; i++) {
            minMax[i] = random.nextInt(16);
        }
        int max = minMax[0];
        int min = minMax[0];

        for (int i = 0; i < minMax.length; i++) {
            int current = minMax[i];
            if (current > max) {
                max = current;
            }
            if (current < min) {
                min = current;
            }
        }
        for (int i = 0; i < minMax.length; i++) {
            System.out.print(minMax[i] + " ");
        }
        System.out.print("\n");

        //вывод результата с помощью метода String.format
        System.out.println(String.format("min=%s max=%s", min, max));


        //task 7
        System.out.println("task 7");
        int[] filledArr = new int[10];
        for (int i = 0; i < filledArr.length; i++) {
            filledArr[i] = random.nextInt(3);
        }
        for (int i = 0; i < filledArr.length; i++) {
            System.out.print(filledArr[i] + "  ");
        }
//      v - значение; цикл перебора значений
//        for (int v : filledArr) {
//            System.out.print(v + "  ");
//        }
        System.out.print("\n");

        boolean isExists = checkBalance(filledArr);
        System.out.println(isExists);

        //  task 8
        System.out.println("task 8");
        int[] nArr = new int[10];
        for (int i = 0; i < nArr.length; i++) {
            nArr[i] = random.nextInt(8);
        }
        n = random.nextInt(6) - 3;
        for (int i = 0; i < nArr.length; i++) {
            System.out.print(nArr[i] + "  ");
        }
        System.out.print("\n");
        System.out.println(n);
        tapeLine(nArr, n);
        for (int i = 0; i < nArr.length; i++) {
            System.out.print(nArr[i] + "  ");
        }
    }

    public static int[] initArr(int len, int initialValue) {
        int[] array = new int[len];
        for (int i = 0; i < len; i++) {
            array[i] = initialValue;
        }
        return array;

    }

    public static boolean checkBalance(int[] filledArr) {
        for (int i = 0; i < filledArr.length; i++) {
            int sumLeft = 0;
            int sumRight = 0;
            for (int j = 0; j < i; j++) {
                sumLeft += filledArr[j];
            }
            for (int k = i; k < filledArr.length; k++) {
                sumRight += filledArr[k];
            }
            if (sumLeft == sumRight) {
                return true;
            }
        }
        return false;
    }


    public static void tapeLine(int[] nArr, int n) {
        if (n > 0) {
            for (int i = 1; i <= n; i++) {
                replaceRight(nArr);
            }
        } else {
            for (int j = 1; j <= n * -1; j++) {
                replaceLeft(nArr);
            }
        }
    }

    public static void replaceRight(int[] arr) {
        int lastValue = arr[arr.length - 1];
        for (int i = arr.length - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0] = lastValue;
    }

    public static void replaceLeft(int[] arr) {
        int firstValue = arr[0];
        for (int j = 0; j < arr.length - 1; j++) {
            arr[j] = arr[j + 1];
        }
        arr[arr.length - 1] = firstValue;

    }


}



