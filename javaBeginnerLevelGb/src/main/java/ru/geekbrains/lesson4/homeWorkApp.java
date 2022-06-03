package ru.geekbrains.lesson4;

import java.util.Random;
import java.util.Scanner;

public class homeWorkApp {

    public static String humanChar = "x";

    public static void main(String[] args) {
        String[][] field = initField(3);
        printField(field);

        while (true) {
            // ход игрока, проверка на ничью, проверка на победу
            humanTurn(field);
            printField(field);
            if (isDraw(field)) {
                break;
            }
            if (isWinner(field, humanChar)) {
                System.out.println("Вы победили!");
                break;
            }
            // ход компьютера, проверка на ничью, проверка на победу
            aiTurn(field);
            printField(field);
            if (isDraw(field)) {
                break;
            }
            if (isWinner(field, "0")) {
                System.out.println("Компьютер победил!");
                break;
            }
        }
        System.out.println("Game over");

    }

    public static String[][] initField(int size) {
        String[][] field = new String[size][size];
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field.length; j++) {
                field[i][j] = "*";
            }
        }
        return field;
    }

    public static void printField(String[][] field) {
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field.length; j++) {
                System.out.print(field[i][j] + " ");
            }
            System.out.print("\n");
        }
        System.out.println("------");

    }

    public static void humanTurn(String[][] field) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Укажите координаты ячейки по x и y");
            int x = scanner.nextInt() - 1;
            int y = scanner.nextInt() - 1;
            int size = field.length;
            if (x < size && y < size && x >= 0 && y >= 0) {

                if (field[x][y].equals("*")) {
                    field[x][y] = humanChar;
                    break;

                } else {
                    System.out.println("Ячейка уже занята");
                }
            } else {
                System.out.println("Вы вышли за переделы поля");
            }

        }

    }

    public static void aiTurn(String[][] field) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            Random random = new Random();
            int x = random.nextInt(field.length);
            int y = random.nextInt(field.length);
            if (field[x][y].equals("*")) {
                field[x][y] = "0";
                break;
            }
        }
        System.out.println("Ход компьютера завершён");
    }

    public static boolean isDraw(String[][] field) {
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field.length; j++) {
                if (field[i][j].equals("*")) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean isWinner(String[][] field, String turn) {

        if (isAnyRowFilledWith(field,turn)) {
            // победа по-горизонтали
            return true;
        } else if (isAnyColumnFilledWith(field, turn)) {
            // победа по-вертикали
            return true;

        } else if (isDiagonalDownFilledWithTurn (field,turn)) {
            // победа по-диагонали
            return true;
        }
        else if (isDiagonalUpFilledWithTurn (field,turn)) {
            // победа по-диагонали
            return true;
        }
        return false;
    }


    //Проверка победы по-вертикали: заполнена ли указанная колонка (int colIndex) указанным символом (String turn)
    public static boolean isColumnFilledWithTurn(String[][] field, String turn, int colIndex) {

        for (int rowIndex = 0; rowIndex < field.length; rowIndex++) {
            if (!field[rowIndex][colIndex].equals(turn)) {
                return false;
            }
        }
        return true;
    }

    // Проверка победы по-вертикали: есть ли какая-то колонка, заполненная указанным символом
    public static boolean isAnyColumnFilledWith(String[][] field, String turn) {
        for (int colIndex = 0; colIndex < field.length; colIndex++) {

            boolean isFilled = isColumnFilledWithTurn(field, turn, colIndex);

            if (isFilled) {
                return true;
            }
        }
        return false;
    }

    //Проверка победы по-горизонтали: заполнена ли указанная колонка (int rowIndex) указанным символом (String turn)
    public static boolean isRowFilledWithTurn (String[][] field, String turn, int rowIndex) {

        for (int colIndex = 0; colIndex < field.length; colIndex++) {
            if (!field[rowIndex][colIndex].equals(turn)) {
                return false;
            }
        }
        return true;
    }
    // Проверка победы по-гориззонтали: есть ли какая-то колонка, заполненная указанным символом
    public static boolean isAnyRowFilledWith(String[][] field, String turn) {
        for (int rowIndex = 0; rowIndex < field.length; rowIndex++) {

            boolean isFilled = isRowFilledWithTurn(field, turn, rowIndex);

            if (isFilled) {
                return true;
            }
        }
        return false;
    }
//Проверка победы по-диагонали:  [0][0] --> [n][n]
    public static boolean isDiagonalDownFilledWithTurn (String[][] field, String turn){
        for (int i = 0; i< field.length; i++){
            if (!field[i][i].equals(turn)){
                return false;
            }
        }
        return true;
    }
// Проверка победы по-диагонали:  [n][0] --> [0][n]
    public static boolean isDiagonalUpFilledWithTurn (String[][] field, String turn){
        for (int i = 0; i < field.length; i++){
            int j = field.length-i -1;
            if (!field [i][j].equals(turn)){
                return false;
            }
        }
        return true;

    }

// 2 diagonal
//        for (int i = 0; i < square.length; i++) {
//        int j = square.length - i - 1;
//        square[i][j] = 1;
//    }








}
