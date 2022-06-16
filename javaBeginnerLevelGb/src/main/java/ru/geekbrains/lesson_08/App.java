package ru.geekbrains.lesson_08;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class App extends JFrame {
//    static int counter = 0;

    public App() {
        setTitle("My first window application");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(200, 200, 300, 300);

        setResizable(false); //делает размер окна приложения не изменяемым

        add(new Panel(), BorderLayout.CENTER);

//        add(new Panel(), BorderLayout.NORTH); // размещает кнопки по указанному уровню
//        add(new Panel(), BorderLayout.SOUTH);

        setVisible(true);
    }




}
