package ru.geekbrains.lesson4;

import org.junit.Test;

import static org.junit.Assert.assertTrue;
import static ru.geekbrains.lesson4.homeWorkApp.humanChar;

public class homeWorkAppTest {

    @Test
    public void testIsNotWinnerWhenFieldIsEmpty(){

        //1. prepare src data
        String[][] field = homeWorkApp.initField(3);
        String turn = humanChar;

        //2. do test
        boolean isWinner = homeWorkApp.isWinner(field, turn);

        //3. check results
        assertTrue(isWinner == false);

    }

    @Test
    public void testIsWinnerInHorizontal(){

        //1. prepare src data
        String[][] field = homeWorkApp.initField(3);
        field[0][0] = humanChar;
        field[0][1] = humanChar;
        field[0][2] = humanChar;
        String turn = humanChar;

        //2. do test
        boolean isWinner = homeWorkApp.isWinner(field, turn);

        //3. check results
        assertTrue(isWinner == true);

    }

    @Test
    public void testIsWinnerInVertical(){

        //1. prepare src data
        String[][] field = homeWorkApp.initField(3);
        field[0][0] = humanChar;
        field[1][0] = humanChar;
        field[2][0] = humanChar;
        String turn = humanChar;

        //2. do test
        boolean isWinner = homeWorkApp.isWinner(field, turn);

        //3. check results
        assertTrue(isWinner == true);

    }

    @Test
    public void testIsWinnerInDiagonalDown(){

        //1. prepare src data
        String[][] field = homeWorkApp.initField(3);
        field[0][0] = humanChar;
        field[1][1] = humanChar;
        field[2][2] = humanChar;
        String turn = humanChar;

        //2. do test
        boolean isWinner = homeWorkApp.isWinner(field, turn);

        //3. check results
        assertTrue(isWinner == true);

    }
    @Test
    public void testIsWinnerInDiagonalUp(){

        //1. prepare src data
        String[][] field = homeWorkApp.initField(3);
        field[0][2] = humanChar;
        field[1][1] = humanChar;
        field[2][0] = humanChar;
        String turn = humanChar;

        //2. do test
        boolean isWinner = homeWorkApp.isWinner(field, turn);

        //3. check results
        assertTrue(isWinner == true);

    }




}
