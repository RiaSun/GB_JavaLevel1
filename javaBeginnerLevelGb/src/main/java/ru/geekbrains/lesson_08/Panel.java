package ru.geekbrains.lesson_08;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Panel extends JPanel {
    public Panel() {

        Font font = new Font("Arrial", Font.BOLD, 20);

        setLayout(new FlowLayout());//адаптивная вёрстка; зависит от экрана

        JButton myButton1 = new JButton("Big Green Button");
        myButton1.setFont(font);
        add(myButton1);
//        add(myButton1, BorderLayout.NORTH);//задает расположение для данной кнопки


        JButton myButton2 = new JButton("Сгенерировать номер");
        myButton2.setFont(font);
        add(myButton2);
//        add(myButton2, BorderLayout.SOUTH); //задает расположение для данной кнопки

        TextField textField = new TextField("+7(999)xxxxxxx");
        textField.setFont(font);
        add(textField);

//        myButton1.setText("Bid Green Button"); // внести изменения поле названия кнопки
//        myButton2.setText("+7(999)xxxxxxx");


//       действия для кнопок задаются с помощью написания отдельного класса
//        ButtonAction buttonAction = new ButtonAction(meButton);
//        meButton.addActionListener(buttonAction);

        myButton1.addActionListener(
                new ActionListener() {
 //           анонимный класс, создается в единственном экземпляре, не может быть переиспользован
//           используется, когда нужен один экземпляр класса (чтобы не создавать отдельный класс под единственный объект)
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        myButton1.setText("Big Red Button");

                    }
                }
        );

        myButton2.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        textField.setText(generatePhoneNumber());
                    }
                }
        );

    }

    public String generatePhoneNumber() {
        Random random = new Random();
        String phoneNumber = "";
        phoneNumber += "+7";
        phoneNumber += "(999)";
        phoneNumber += random.nextInt(10);
        phoneNumber += random.nextInt(10);
        phoneNumber += random.nextInt(10);
        phoneNumber += random.nextInt(10);
        phoneNumber += random.nextInt(10);
        phoneNumber += random.nextInt(10);
        phoneNumber += random.nextInt(10);

        return phoneNumber;

    }


}
